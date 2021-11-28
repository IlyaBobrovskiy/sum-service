package com.example.ulbitvspring;

import com.fasterxml.jackson.annotation.JsonGetter;

public final class Views {
    private int code;
    private String description;

    @JsonGetter("name")
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
@JsonGetter("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
