package com.ProjectActivity.importerSite.Dto;

import java.util.Comparator;

public class CountryDto {

	public int id;
	public String title;

	public String alpha3;

	public CountryDto(int id, String title, String alpha3) {
		this.id = id;
		this.title = title;
		this.alpha3 = alpha3;
	}

	public static final Comparator<CountryDto> COMPARE_BY_NAME = (first, second) -> first.title.compareTo(second.title);
}
