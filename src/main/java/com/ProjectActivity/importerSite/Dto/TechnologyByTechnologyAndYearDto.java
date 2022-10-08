package com.ProjectActivity.importerSite.Dto;


//На самом деле это и по стране, и по технологии, нужно создать более общую конструкцию
public class TechnologyByTechnologyAndYearDto implements IndexCountryTechnologyDto {

    private Long id;
    private String country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    public TechnologyByTechnologyAndYearDto(Long id, String technology, double index) {
        this.id = id;
        this.country = technology;
        this.index = index;
    }

    private double index;
}
