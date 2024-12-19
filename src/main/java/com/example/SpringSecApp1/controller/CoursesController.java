package com.example.SpringSecApp1.controller;

import com.example.SpringSecApp1.dao.Courses;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {

    @GetMapping("/login")
    public String login(HttpServletRequest req){


        return req.getSession().getId();
    }

    @PostMapping("/addcourses")
    public Courses getCourse2(){
        Courses courses = new Courses();
        courses.setName("Python");

        return courses;
    }

    @GetMapping("/getcourse")
    public Courses getCourse(){
        Courses courses = new Courses();
        courses.setName("Python");

        return courses;
    }

    @GetMapping("/csrf")
    public CsrfToken getcsrfToken(HttpServletRequest request)
    {
        return (CsrfToken) request.getAttribute("_csrf");
    }

}
