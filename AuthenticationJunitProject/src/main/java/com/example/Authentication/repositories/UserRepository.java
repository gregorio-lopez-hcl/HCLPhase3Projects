package com.example.Authentication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Authentication.entities.UserAuth;

@Repository
public interface UserRepository extends CrudRepository<UserAuth, Integer> {

    public UserAuth findByName(String name);
}