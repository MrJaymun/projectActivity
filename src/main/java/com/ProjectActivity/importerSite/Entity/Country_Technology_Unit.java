package com.ProjectActivity.importerSite.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "technologies_countries")
public class Country_Technology_Unit implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="country_id")
    private Country country;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="technology_id")
    private Technology technology;

    private short year;

    private double its;

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

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public double getIts() {
        return its;
    }

    public void setIts(double its) {
        this.its = its;
    }

    public Country_Technology_Unit(){

    }




}
