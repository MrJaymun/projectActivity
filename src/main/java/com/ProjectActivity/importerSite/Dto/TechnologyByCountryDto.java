package com.ProjectActivity.importerSite.Dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TechnologyByCountryDto implements IndexCountryTechnologyDto {



    private Long id;
    private String title;



    public List<ListForYearIndexDto> getValues() {
        return values;
    }

    public void setValues(List<ListForYearIndexDto> values) {
        this.values = values;
    }

    public TechnologyByCountryDto(Long id, String title, List<ListForYearIndexDto> values) {
        this.id = id;
        this.title = title;
        this.values = values;
    }

    private List<ListForYearIndexDto> values;

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
