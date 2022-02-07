package com.homemaker.pantry.services;

import com.homemaker.pantry.entities.Users;
import com.homemaker.pantry.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public Users getUser(String username) {
        return null;
    }

    @Override
    public void createUser(String username, String role) {

        Users newUser = new Users(username, role);
        userRepository.save(newUser);
    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public void updateUser(String username, String role) {

    }

    @Override
    public List<Users> getAllUsers() {
        Iterable<Users> allUsersItr = userRepository.findAll();
        List<Users> allUsers = StreamSupport.stream(Spliterators.spliteratorUnknownSize(allUsersItr.iterator(),
                Spliterator.ORDERED), false).collect(Collectors.toList());
        return allUsers;
    }
}
