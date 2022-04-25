package com.ProjectActivity.importerSite.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "product_codes_hs96")
public class Code_hs96 implements Serializable {

    @Id
    private String hs96_id;

    private String hs96_name;


    @ManyToMany(mappedBy = "hs96_elements")
    private Set<Code_sitc4> sitc4;







    public String getHs96_id() {
        return hs96_id;
    }

    public void setHs96_id(String hs96_id) {
        this.hs96_id = hs96_id;
    }

    public String getHs96_name() {
        return hs96_name;
    }

    public void setHs96_name(String hs96_name) {
        this.hs96_name = hs96_name;
    }


    public Set<Code_sitc4> getSitc4() {
        return sitc4;
    }

    public void setSitc4(Set<Code_sitc4> sitc4) {
        this.sitc4 = sitc4;
    }





    public Code_hs96(){

    }

}
