package com.ProjectActivity.importerSite.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "iipd")
@IdClass(IIPD_PK.class)
public class IIPD implements Serializable {

	@Id
	public String country;

	@Id
	public int year;

	public double index;
	public Double dynamic;

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

	public double getIndex() {
		return index;
	}

	public void setIndex(double index) {
		this.index = index;
	}

	public Double getDynamic() {
		return dynamic;
	}

	public void setDynamic(Double dynamic) {
		this.dynamic = dynamic;
	}
}
