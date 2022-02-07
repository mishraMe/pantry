package com.homemaker.pantry.repositories;

import com.homemaker.pantry.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, String> {

}
