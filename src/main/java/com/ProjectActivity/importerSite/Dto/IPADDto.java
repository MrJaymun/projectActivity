package com.ProjectActivity.importerSite.Dto;

public class IPADDto {

    public String country;
    public int year;
    public double index;
    public double dynamic;

    public IPADDto(String country, int year, double index, double dynamic) {
        this.country = country;
        this.year = year;
        this.index = index;
        this.dynamic = dynamic;
    }
}
