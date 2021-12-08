package com.example.ulbitvspring.model;

import com.example.ulbitvspring.entity.SumEntity;

public class Sum {

    private Long id;
    private String name;
    private Integer value;

    public Sum() {
    }

    public static Sum toModel(SumEntity entity) {
        Sum sumModel = new Sum();
        sumModel.setName(entity.getName());
        sumModel.setValue(entity.getValue());
        return sumModel;
    }

    public String getUsername() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
