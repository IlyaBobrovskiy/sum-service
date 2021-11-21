package com.example.ulbitvspring.entity;

import javax.persistence.*;




@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    private Long id;
    private String name;
    private static Integer value;


    public UserEntity() {
    }



    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = username;
    }

    public static Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


}
