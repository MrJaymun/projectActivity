package com.ProjectActivity.importerSite.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IntegerValue {


	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Id
	int value;


}
