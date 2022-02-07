package com.homemaker.pantry.controllers;

import com.homemaker.pantry.entities.Users;
import com.homemaker.pantry.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestParam(value = "username") String username,
                                        @RequestParam(value = "role", required = false) String role) {
        //create user
        userService.createUser(username, role);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers() {
       return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

}
