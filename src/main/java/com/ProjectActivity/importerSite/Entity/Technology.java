package com.ProjectActivity.importerSite.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "technologies")
public class Technology {

    @Id
    private Long id;

    private String name;



    @OneToMany(mappedBy = "technology")
    private Set<Product_Technology_Unit> products;





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


    public Set<Product_Technology_Unit> getProducts() {
        return products;
    }

    public void setProducts(Set<Product_Technology_Unit> products) {
        this.products = products;
    }



    public Technology(){

    }
}
