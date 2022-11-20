package com.ProjectActivity.importerSite.Entity;

import java.io.Serializable;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Import_Export_Unit_PK implements Serializable {

	@Id
	private short year;

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name="id")
	private Country importer;

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name="id")
	private Country exporter;

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public Country getImporter() {
		return importer;
	}

	public void setImporter(Country importer) {
		this.importer = importer;
	}

	public Country getExporter() {
		return exporter;
	}

	public void setExporter(Country exporter) {
		this.exporter = exporter;
	}
}
