package com.example.ulbitvspring.entity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.persistence.GenerationType;

@Entity
@Table(name = "user")
public class SumEntity {
    @Autowired
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public static String name;
    private static Integer value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SumEntity() {
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
