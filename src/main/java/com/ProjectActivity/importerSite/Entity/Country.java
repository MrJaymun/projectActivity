package com.ProjectActivity.importerSite.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "countries")
public class Country implements Serializable {

	@Id
	private Long id;

	private String name;

	public List<Country_Technology_Unit> getCountryTechnology() {
		return countryTechnology;
	}

	public void setCountryTechnology(List<Country_Technology_Unit> countryTechnology) {
		this.countryTechnology = countryTechnology;
	}

	@OneToMany(mappedBy = "country")
	private List<Country_Technology_Unit> countryTechnology;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country() {}
}
