package com.ProjectActivity.importerSite.Dto;


//На самом деле это и по стране, и по технологии, нужно создать более общую конструкцию
public class TechnologyByCountryAndYearDto implements IndexCountryTechnologyDto {

    private Long id;
    private String technology;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    public TechnologyByCountryAndYearDto(Long id, String technology, double index) {
        this.id = id;
        this.technology = technology;
        this.index = index;
    }

    private double index;
}
