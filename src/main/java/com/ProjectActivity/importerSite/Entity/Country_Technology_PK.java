package com.ProjectActivity.importerSite.Entity;

import java.io.Serializable;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Country_Technology_PK implements Serializable {

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "country_id")
	private Country country;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "technology_id")
	private Technology technology;

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	@Id
	private short year;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology) {
		this.technology = technology;
	}
}
