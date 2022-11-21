package com.ProjectActivity.importerSite.Entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "products_technologies")
public class Product_Technology_Unit implements Serializable {

	@Id
	private String product_name;

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Technology technology;

	@Id
	private double probability;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sitc4")
	private Code_sitc4 sitc4;

	/*
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Sitc4toHS96",
            joinColumns = {@JoinColumn(name = "sitc4_id", referencedColumnName = "sitc4")},
            inverseJoinColumns = {@JoinColumn(name = "hs96_id", referencedColumnName = "hs96_id")}
    )
    private Set<Code_hs96> hs96_elements;

     */

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology_id) {
		this.technology = technology;
	}

	public double getProbability() {
		return probability;
	}

	public void setProbability(double probability) {
		this.probability = probability;
	}

	public Code_sitc4 getSitc4() {
		return sitc4;
	}

	public void setSitc4(Code_sitc4 sitc4) {
		this.sitc4 = sitc4;
	}

	public Product_Technology_Unit() {}
}
