package com.ProjectActivity.importerSite.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class RawTechnologyITS {

    @Id
    String name;

    Double its;

    String products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIts() {
        return its;
    }

    public void setIts(Double its) {
        this.its = its;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

}
