package com.ProjectActivity.importerSite.Entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "product_codes_hs96")
public class Code_hs96 implements Serializable {

	@Id
	private String hs96;

	private String hs96_name;

	@ManyToMany(mappedBy = "hs96_elements")
	private Set<Code_sitc4> sitc4;

	public String getHs96() {
		return hs96;
	}

	public void setHs96(String hs96) {
		this.hs96 = hs96;
	}

	public String getHs96_name() {
		return hs96_name;
	}

	public void setHs96_name(String hs96_name) {
		this.hs96_name = hs96_name;
	}

	public Set<Code_sitc4> getSitc4() {
		return sitc4;
	}

	public void setSitc4(Set<Code_sitc4> sitc4) {
		this.sitc4 = sitc4;
	}

	public Code_hs96() {}
}
