package com.example.SpringSecApp1.dao;

import org.springframework.stereotype.Component;

@Component
public class Courses {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
