package com.ProjectActivity.importerSite.Dto;

import java.util.List;

public class ImportDto {
    public int id;
    public String title;
    public double index;
    public List<Product> products;

    public ImportDto(int id, String title, double index, List<Product> products) {
        this.id = id;
        this.title = title;
        this.index = index;
        this.products = products;
    }

}
