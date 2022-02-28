package com.homemaker.pantry.controllers;

import com.homemaker.pantry.entities.AppUser;
import com.homemaker.pantry.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/appuser")
public class AppUserController {

    @Autowired
    AppUserService appUserService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestParam(value = "name") String name,
                                        @RequestParam(value = "accessType", required = false) String role) {
        appUserService.createUser(name, role);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<AppUser>> getAllUsers() {
       return new ResponseEntity<>(appUserService.getAllUsers(), HttpStatus.OK);
    }

    @PutMapping(value = "/edit/{name}")
    public ResponseEntity<AppUser> editUser(
            @PathVariable(value = "name") String name,
            @RequestParam(value = "accessType") String accessType) {
        return new ResponseEntity<>(appUserService.updateUser(name, accessType), HttpStatus.OK);
    }

}
