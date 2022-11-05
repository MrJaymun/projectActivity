package com.ProjectActivity.importerSite.Dto;

import java.util.Comparator;

public class CountryDto {
    public int id;
    public String title;

    public CountryDto(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public static final Comparator<CountryDto> COMPARE_BY_NAME = (first, second) -> first.title.compareTo(second.title);
}
