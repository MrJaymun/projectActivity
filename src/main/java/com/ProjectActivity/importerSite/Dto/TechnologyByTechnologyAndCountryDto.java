package com.ProjectActivity.importerSite.Dto;

public class TechnologyByTechnologyAndCountryDto implements IndexCountryTechnologyDto {

    private short year;

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    public TechnologyByTechnologyAndCountryDto(short year, double index) {
        this.year = year;
        this.index = index;
    }

    private double index;
}
