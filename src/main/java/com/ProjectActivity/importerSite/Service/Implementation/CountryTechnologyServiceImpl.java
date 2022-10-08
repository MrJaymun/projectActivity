package com.ProjectActivity.importerSite.Service.Implementation;

import com.ProjectActivity.importerSite.Dto.*;
import com.ProjectActivity.importerSite.Entity.*;
import com.ProjectActivity.importerSite.Repository.CountryRepository;
import com.ProjectActivity.importerSite.Repository.ImportExportDataRepository;
import com.ProjectActivity.importerSite.Repository.TechnologyCountryRepository;
import com.ProjectActivity.importerSite.Repository.TechnologyRepository;
import com.ProjectActivity.importerSite.Service.CountryTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.*;

@Service
public class CountryTechnologyServiceImpl implements CountryTechnologyService {

    @Autowired
    TechnologyCountryRepository technologyCountryRepository;

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    TechnologyRepository technologyRepository;

    @Autowired
    ImportExportDataRepository importExportDataRepository;

    @Override
    public List<ImportDto> productList(long id, short year) {
        var data = technologyCountryRepository.findByCountryAndYear(countryRepository.getById(id), year);

        List<TechnologyCountryDto> array = new ArrayList<>(data.size());

        List<ProductDto> products;
        for (Country_Technology_Unit unit : data) {
            products = new ArrayList<>();

            for (Product_Technology_Unit product : unit.getTechnology().getProducts()) {
                products.add(new ProductDto(product.getProduct_name(), product.getSitc4().getHs96_elements()));
            }

            array.add(new TechnologyCountryDto(unit.getTechnology().getName(), unit.getIts(), products));

        }

        var validation = importExportDataRepository.findByImporterAndYear(countryRepository.getById(id), year);
        HashSet<Code_hs96> used = new HashSet<>();

        for (Import_Export_Unit unit : validation) {
            used.add(unit.getHs96id());
        }

        ArrayList<ImportDto> finalData = new ArrayList<>();
        int size = 0;
        for (TechnologyCountryDto unit : array) {

            List<String> usedProducts = new ArrayList<>();
            for (ProductDto productUnit : unit.products) {

                for (Code_hs96 code_hs96 : productUnit.hs96) {
                    if (used.contains(code_hs96)) {
                        usedProducts.add(code_hs96.getHs96_name());
                    }
                }
            }
            HashSet<String> usedFinal = new HashSet<>();
            ArrayList<Product> finalResult = new ArrayList();
            int i = 1;
            for (String str : usedProducts) {
                if (!usedFinal.contains(str)) {
                    usedFinal.add(str);
                    finalResult.add(new Product(i, str));
                    i++;
                }
            }
            finalData.add(new ImportDto(size, unit.name, unit.index, finalResult));
            size++;
        }

        return finalData;
    }

    public List<IndexCountryTechnologyDto> getData(Long technologyId, Long countryId, Short year){
        if(countryId != null){
            if(year != null){
                technologyByCountryAndYear(countryId, year);
            }
            if(technologyId != null){
                technologyByTechnologyAndCountry(technologyId, countryId);
            }
            return technologyByCountry(countryId);
        }
        return findByTechnologyAndYear(technologyId, year);
    }


    @Override
    public List<IndexCountryTechnologyDto> technologyByCountry(long id) {


        Country country = countryRepository.getById(id);

        List<TechnologyByCountryDto> result = new ArrayList<>();
        boolean flag = true;
        for (Country_Technology_Unit unit : country.getCountryTechnology()) {

            for (TechnologyByCountryDto existing : result) {
                if (existing.getId() == unit.getTechnology().getId()) {
                    flag = false;

                }
            }
            if (flag) {
                Map<Short, Double> values = new HashMap<>();
                for (Country_Technology_Unit taker : country.getCountryTechnology()) {
                    if (taker.getTechnology().getId() == unit.getTechnology().getId()) {

                        values.put(taker.getYear(), taker.getIts());
                    }
                }

                TechnologyByCountryDto finalUnit = new TechnologyByCountryDto(unit.getTechnology().getId(), unit.getTechnology().getName(), sortByComparator(values, false));
                result.add(finalUnit);
            }

        }
        //ПОТОМКИ, ДАЖЕ НЕ СПРАШИВАЙТЕ КАКОГО ЧЕРТА ТУТ ТВОРИТСЯ
        return new ArrayList<>(result);
    }

    @Override
    public List<IndexCountryTechnologyDto> technologyByCountryAndYear(long countryId, short year) {
        List<TechnologyByCountryAndYearDto> result = new ArrayList<>();
        var data = technologyCountryRepository.findByCountryAndYear(countryRepository.getById(countryId), year);
        for (Country_Technology_Unit unit : data) {
            result.add(new TechnologyByCountryAndYearDto(unit.getTechnology().getId(), unit.getTechnology().getName(), unit.getIts()));
        }

        return new ArrayList<>(result);
    }

    @Override
    public List<IndexCountryTechnologyDto> technologyByTechnologyAndCountry( long technologyId, long countryId) {

        List<TechnologyByTechnologyAndCountryDto> result = new ArrayList<>();
        var data = technologyCountryRepository.findByTechnologyAndCountry(technologyRepository.getById(technologyId), countryRepository.getById(countryId));
        for (Country_Technology_Unit unit : data) {
            result.add(new TechnologyByTechnologyAndCountryDto(unit.getYear(), unit.getIts()));
        }
        return new ArrayList<>(result);
    }

    @Override
    public List<IndexCountryTechnologyDto> findByTechnologyAndYear(long technologyId, short year) {
        List<TechnologyByCountryAndYearDto> result = new ArrayList<>();
        var data = technologyCountryRepository.findByTechnologyAndYear(technologyRepository.getById(technologyId), year);
        for (Country_Technology_Unit unit : data) {
            result.add(new TechnologyByCountryAndYearDto(unit.getCountry().getId(), unit.getCountry().getName(), unit.getIts()));
        }

        return new ArrayList<>(result);
    }

    private static Map<Short, Double> sortByComparator(Map<Short, Double> unsortMap, final boolean order) {

        List<Entry<Short, Double>> list = new LinkedList<>(unsortMap.entrySet());

        Collections.sort(list, (o1, o2) -> {
            if (order) {
                return o1.getKey().compareTo(o2.getKey());
            } else {
                return o2.getKey().compareTo(o1.getKey());
            }
        });


        Map<Short, Double> sortedMap = new LinkedHashMap<Short, Double>();
        for (Entry<Short, Double> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }


}
