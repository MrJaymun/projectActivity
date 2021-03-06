package com.ProjectActivity.importerSite.Entity;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class Country_Technology_PK implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
   // @JoinColumn(name="id")
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
   // @JoinColumn(name="id")
    private Technology technology;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }



}
