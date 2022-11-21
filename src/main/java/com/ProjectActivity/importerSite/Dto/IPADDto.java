package com.ProjectActivity.importerSite.Dto;

public class IPADDto {

	public String country;
	public int year;
	public double index;
	public Double dynamic;
	public String alpha3;

	public IPADDto(String country, int year, double index, Double dynamic, String alpha3) {
		this.country = country;
		this.year = year;
		this.index = index;
		this.dynamic = dynamic;
		this.alpha3 = alpha3;
	}
}
