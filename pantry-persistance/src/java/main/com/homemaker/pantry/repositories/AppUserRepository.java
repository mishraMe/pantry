package com.homemaker.pantry.repositories;

import com.homemaker.pantry.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppUserRepository extends JpaRepository<AppUser, String> {



}
