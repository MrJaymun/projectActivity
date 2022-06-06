package com.ProjectActivity.importerSite.Dto;

public class IIPDDto {

    public String country;
    public int year;
    public double index;
    public Double dynamic;

    public IIPDDto(String country, int year, double index, Double dynamic) {
        this.country = country;
        this.year = year;
        this.index = index;
        this.dynamic = dynamic;
    }
}
