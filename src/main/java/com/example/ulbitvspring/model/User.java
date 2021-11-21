package com.example.ulbitvspring.model;

import com.example.ulbitvspring.entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public class User {
    private Long id;
    private String name;
    private Integer value;

    public static User toModel(String entity) {
        User model = new User();
        model.setUsername(entity.get());
        return model;
    }


    public User() {
    }

    public String getUsername() {
        return name;
    }

    public void setUsername(String name) {
        this.name = name;
    }
}
