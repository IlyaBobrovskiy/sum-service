package com.example.ulbitvspring.entity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

import static javax.persistence.GenerationType;


@Entity
@Table(name = "sum_values")
public class SumEntity {

    @Autowired
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public  String name;
    public static Integer value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SumEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    public static Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
