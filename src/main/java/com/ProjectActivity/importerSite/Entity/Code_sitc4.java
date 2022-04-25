package com.ProjectActivity.importerSite.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sitc4")
public class Code_sitc4 {

    @Id
    private String sitc4_id;

    private String sitc4_name;

    public String getSitc4_id() {
        return sitc4_id;
    }

    public void setSitc4_id(String sitc4_id) {
        this.sitc4_id = sitc4_id;
    }

    public String getSitc4_name() {
        return sitc4_name;
    }

    public void setSitc4_name(String sitc4_name) {
        this.sitc4_name = sitc4_name;
    }



    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Sitc4toHS96",
            joinColumns = {@JoinColumn(name = "sitc4_id", referencedColumnName = "sitc4_id")},
            inverseJoinColumns = {@JoinColumn(name = "hs96_id", referencedColumnName = "hs96_id")}
    )
    private Set<Code_hs96> hs96_elements;


}
