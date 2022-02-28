package com.homemaker.pantry.services;


import com.homemaker.pantry.entities.AppUser;

import java.util.List;

public interface AppUserService {

    AppUser getUser(String username);

    void createUser(String username, String role);

    void deleteUser(String username);

    AppUser updateUser(String username, String role);

    List<AppUser> getAllUsers();
}
