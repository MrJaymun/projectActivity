package com.ProjectActivity.importerSite.Service.Implementation;

import com.ProjectActivity.importerSite.Dto.*;
import com.ProjectActivity.importerSite.Entity.*;
import com.ProjectActivity.importerSite.Repository.CountryRepository;
import com.ProjectActivity.importerSite.Repository.ImportExportDataRepository;
import com.ProjectActivity.importerSite.Repository.TechnologyCountryRepository;
import com.ProjectActivity.importerSite.Service.CountryTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class CountryTechnologyServiceImpl implements CountryTechnologyService {

    @Autowired
    TechnologyCountryRepository technologyCountryRepository;

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    ImportExportDataRepository importExportDataRepository;

    @Override
    public List<ImportDto> productList(long id, short year) {
        var data = technologyCountryRepository.findByCountryAndYear(countryRepository.getById(id), year);

        List<TechnologyCountryDto> array = new ArrayList<TechnologyCountryDto>(data.size());

        List<ProductDto> products;
        for (Country_Technology_Unit unit : data){
            products = new ArrayList<>();

            for(Product_Technology_Unit product : unit.getTechnology().getProducts()){
                products.add(new ProductDto(product.getProduct_name(), product.getSitc4().getHs96_elements()));
                List<String> hs96 = new ArrayList<>();

            }

            array.add(new TechnologyCountryDto(unit.getTechnology().getName(), unit.getIts(), products));

        }

        var validation = importExportDataRepository.findByImporterAndYear(countryRepository.getById(id), year);
        HashSet<Code_hs96> used = new HashSet<>();
        ArrayList<String> needed = new ArrayList();
        for(Import_Export_Unit unit : validation){
            used.add(unit.getHs96id());
        }

        ArrayList<ImportDto> finalData = new ArrayList<>();
        int size = 0;
        for (TechnologyCountryDto unit : array){

            List<String> usedProducts = new ArrayList<>();
            for(ProductDto productUnit : unit.products){

                for(Code_hs96 code_hs96 : productUnit.hs96){
                    if(used.contains(code_hs96)){
                        usedProducts.add(code_hs96.getHs96_name());
                    }
                }
            }
            HashSet<String> usedFinal = new HashSet<>();
            ArrayList<Product> finalResult = new ArrayList();
            int i = 1;
            for(String str : usedProducts){
                if(!usedFinal.contains(str)){
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


}
