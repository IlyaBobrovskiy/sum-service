package com.example.ulbitvspring.model;

import org.springframework.beans.factory.annotation.Autowired;
public class Sum {
    @Autowired
    private Long id;
    private String name;
    private Integer value;

    public Sum() {
    }

    public static int toModel(String user) {
        return 0;
    }

    public String getUsername() {
        return name;
    }

    public void setUsername(String name) {
        this.name = name;
    }
}
