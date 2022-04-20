package com.ProjectActivity.importerSite.Entity;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.Set;

public class Product_Technology_Unit implements Serializable {

    private String product_name;

    private int technology_id;

    private double probability;

    private String sitc4_rev;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Sitc4toHS96",
            joinColumns = @JoinColumn(name = "sitc4_id"),
            inverseJoinColumns = @JoinColumn(name = "hs96_id")
    )
    private Set<Code_hs96> hs96_elements;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getTechnology_id() {
        return technology_id;
    }

    public void setTechnology_id(int technology_id) {
        this.technology_id = technology_id;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public String getSitc4_rev() {
        return sitc4_rev;
    }

    public void setSitc4_rev(String sitc4_rev) {
        this.sitc4_rev = sitc4_rev;
    }

    public Set<Code_hs96> getHs96_elements() {
        return hs96_elements;
    }

    public void setHs96_elements(Set<Code_hs96> hs96_elements) {
        this.hs96_elements = hs96_elements;
    }

    public Product_Technology_Unit(){

    }

}
