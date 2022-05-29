package com.ProjectActivity.importerSite.Dto;

import java.util.List;

public class ImportDto {
    public int id;
    public String title;
    public double index;
    public List<String> product;

    public ImportDto(int id, String title, double index, List<String> product) {
        this.id = id;
        this.title = title;
        this.index = index;
        this.product = product;
    }

}
