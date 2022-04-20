package com.ProjectActivity.importerSite.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "product_codes_hs96")
public class Code_hs96 {

    @Id
    private String hs96_id;

    private String hs96_name;





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


    public Code_hs96(){

    }

}
