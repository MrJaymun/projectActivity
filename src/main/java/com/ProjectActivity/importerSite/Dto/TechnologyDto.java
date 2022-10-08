package com.ProjectActivity.importerSite.Dto;

import com.ProjectActivity.importerSite.Entity.Technology;

public class TechnologyDto {

    private Long id;
    private String title;

    public TechnologyDto(Technology tech) {
        this.id = tech.getId();
        this.title = tech.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
