package com.ProjectActivity.importerSite.Entity;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "sitc4")
public class Code_sitc4 {

	@Id
	private String sitc4;

	private String sitc4_name;

	public String getSitc4() {
		return sitc4;
	}

	public void setSitc4(String sitc4) {
		this.sitc4 = sitc4;
	}

	public String getSitc4_name() {
		return sitc4_name;
	}

	public void setSitc4_name(String sitc4_name) {
		this.sitc4_name = sitc4_name;
	}

	public Set<Code_hs96> getHs96_elements() {
		return hs96_elements;
	}

	public void setHs96_elements(Set<Code_hs96> hs96_elements) {
		this.hs96_elements = hs96_elements;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name = "Sitc4toHS96",
		joinColumns = { @JoinColumn(name = "sitc4", referencedColumnName = "sitc4") },
		inverseJoinColumns = { @JoinColumn(name = "hs96", referencedColumnName = "hs96") }
	)
	private Set<Code_hs96> hs96_elements;
}
