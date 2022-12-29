package com.ProjectActivity.importerSite.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IntegerValue {


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	int id;
	String name;


}
