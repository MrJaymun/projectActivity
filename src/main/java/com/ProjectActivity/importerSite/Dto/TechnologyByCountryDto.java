package com.ProjectActivity.importerSite.Dto;

import java.util.HashMap;
import java.util.Map;

public class TechnologyByCountryDto implements IndexCountryTechnologyDto {



    private Long id;
    private String title;



    public Map<Short, Double> getValues() {
        return values;
    }

    public void setValues(Map<Short, Double> values) {
        this.values = values;
    }

    public TechnologyByCountryDto(Long id, String title, Map<Short, Double> values) {
        this.id = id;
        this.title = title;
        this.values = values;
    }

    private Map<Short, Double> values;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
