package com.ProjectActivity.importerSite.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Table(name = "users")
public class User implements Serializable {

    @Id
    private Long id;

    private String login;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
