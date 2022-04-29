package com.ProjectActivity.importerSite.Service.Implementation;

import com.ProjectActivity.importerSite.Dto.ProductDto;
import com.ProjectActivity.importerSite.Dto.TechnologyCountryDto;
import com.ProjectActivity.importerSite.Entity.Country;
import com.ProjectActivity.importerSite.Entity.Country_Technology_Unit;
import com.ProjectActivity.importerSite.Entity.Product_Technology_Unit;
import com.ProjectActivity.importerSite.Repository.CountryRepository;
import com.ProjectActivity.importerSite.Repository.TechnologyCountryRepository;
import com.ProjectActivity.importerSite.Service.CountryTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CountryTechnologyServiceImpl implements CountryTechnologyService {

    @Autowired
    TechnologyCountryRepository technologyCountryRepository;

    @Autowired
    CountryRepository countryRepository;

    @Override
    public List<TechnologyCountryDto> productList(long id, short year) {

        /*
        Country country;
        try{
            country = countryRepository.getById(id);
        }
        catch (Exception e){
            System.out.println("Страна не найдена!");
            return null;
        }

         */
        var data = technologyCountryRepository.findByCountryAndYear(countryRepository.getById(id), year);

        System.out.println(countryRepository.getById(id));
        List<TechnologyCountryDto> array = new ArrayList<TechnologyCountryDto>(data.size());

        List<ProductDto> products;
        for (Country_Technology_Unit unit : data){
            products = new ArrayList<>();

            for(Product_Technology_Unit product : unit.getTechnology().getProducts()){
                products.add(new ProductDto(product.getProduct_name(), product.getSitc4().getSitc4_id()));
            }

            array.add(new TechnologyCountryDto(unit.getTechnology().getName(), unit.getIts(), products));
        }
        return array;
    }


}
