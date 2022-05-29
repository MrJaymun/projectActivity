package com.ProjectActivity.importerSite.Dto;

public class IIPDDto {

    public String country;
    public int year;
    public double index;
    public double dynamic;

    public IIPDDto(String country, int year, double index, double dynamic) {
        this.country = country;
        this.year = year;
        this.index = index;
        this.dynamic = dynamic;
    }
}
