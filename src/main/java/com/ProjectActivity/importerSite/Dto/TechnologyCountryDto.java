package com.ProjectActivity.importerSite.Dto;

import java.util.List;

public class TechnologyCountryDto {
    //По сути это технология, но делается на основе Country_Technology_Unit

    public String name;
    public double index;
    public List<ProductDto> products;

    public TechnologyCountryDto(String name, double index, List<ProductDto> products) {
        this.name = name;
        this.index = index;

        this.products = products;
    }



    public TechnologyCountryDto(){

    }
}
