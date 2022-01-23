package com.homemaker.pantry.entities;
import org.springframework.lang.NonNull;

import java.util.List;

public class User {
    @NonNull
    private String username;
    private List<String> roles;

    public User (String username, List<String> roles) {
        this.username = username;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
