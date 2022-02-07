package com.homemaker.pantry.services;


import com.homemaker.pantry.entities.Users;

import java.util.List;

public interface UserService {

    Users getUser(String username);

    void createUser(String username, String role);

    void deleteUser(String username);

    void updateUser(String username, String role);

    List<Users> getAllUsers();
}
