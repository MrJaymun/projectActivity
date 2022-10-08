package com.ProjectActivity.importerSite.Dto;

import com.ProjectActivity.importerSite.Entity.Technology;

public class TechnologyDto {

    private Long id;
    private String name;

    public TechnologyDto(Technology tech) {
        this.id = tech.getId();
        this.name = tech.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
