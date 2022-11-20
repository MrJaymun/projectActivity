package com.ProjectActivity.importerSite.Entity;

import java.io.Serializable;
import javax.persistence.Id;

public class IPAD_PK implements Serializable {

	@Id
	public String country;

	@Id
	public int year;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
