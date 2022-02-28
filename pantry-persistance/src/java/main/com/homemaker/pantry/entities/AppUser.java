package com.homemaker.pantry.entities;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appuser")
public class AppUser {

    @Id @NotNull
    @Column
    private String name;

    @Column(name = "accesstype")
    private String accessType;

    public AppUser() {}

    public AppUser(String username, String role) {
        this.name = username;
        this.accessType = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String role) {
        this.accessType = accessType;
    }

}
