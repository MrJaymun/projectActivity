package com.ProjectActivity.importerSite.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "import_export_data")
public class Import_Export_Unit implements Serializable {

    @Id
    private short year;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="country_id")
    private Country importer;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="country_id")
    private Country exporter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="hs96_id")
    private Code_hs96 hs96_id;

    private double value;

    private double quantity;

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

    public Code_hs96 getHs96_id() {
        return hs96_id;
    }

    public void setHs96_id(Code_hs96 hs96_id) {
        this.hs96_id = hs96_id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Import_Export_Unit(){

    }



}
