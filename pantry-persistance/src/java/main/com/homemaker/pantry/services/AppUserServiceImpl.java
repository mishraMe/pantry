package com.homemaker.pantry.services;

import com.homemaker.pantry.entities.AppUser;
import com.homemaker.pantry.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    AppUserRepository appUsersRepository;

    @Override
    public AppUser getUser(String username) {
        return null;
    }

    @Override
    public void createUser(String username, String role) {

        AppUser newUser = new AppUser(username, role);
        appUsersRepository.save(newUser);
    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public AppUser updateUser(String username, String role) {
        Optional<AppUser> existingUser = appUsersRepository.findById(username);
        if(existingUser.isPresent()) {
            existingUser.get().setAccessType(role);
            appUsersRepository.save(existingUser.get());
        }
        return existingUser.get();
    }

    @Override
    public List<AppUser> getAllUsers() {
        return appUsersRepository.findAll();
    }
}
