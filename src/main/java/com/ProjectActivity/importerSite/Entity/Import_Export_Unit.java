package com.ProjectActivity.importerSite.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "import_export_data")
@IdClass(Import_Export_Unit_PK.class)
public class Import_Export_Unit implements Serializable {

    @Id
    private short year;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="id")
    private Country importer;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="id")
    private Country exporter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="hs96")
    private Code_hs96 hs96;

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

    public Code_hs96 getHs96id() {
        return hs96;
    }

    public void setHs96(Code_hs96 hs96) {
        this.hs96 = hs96;
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
