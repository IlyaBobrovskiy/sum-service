package com.example.ulbitvspring.repository;

import com.example.ulbitvspring.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo<List, sql> extends CrudRepository<UserEntity, Long> {

    UserEntity findByUsername(String name);

        String sql = "select value from project where name ;";
    }
