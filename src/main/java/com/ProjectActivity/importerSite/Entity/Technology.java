package com.ProjectActivity.importerSite.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "technologies")
public class Technology {

    @Id
    private Long technology_id;

    private String technology_name;

    public Long getTechnology_id() {
        return technology_id;
    }

    public void setTechnology_id(Long technology_id) {
        this.technology_id = technology_id;
    }

    public String getTechnology_name() {
        return technology_name;
    }

    public void setTechnology_name(String technology_name) {
        this.technology_name = technology_name;
    }

    public Technology(){

    }
}
