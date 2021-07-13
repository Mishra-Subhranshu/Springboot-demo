package com.example.springbootproject.springbootproject.controller;

import com.example.springbootproject.springbootproject.entities.Course;
import com.example.springbootproject.springbootproject.serviceimp.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class MyController {
    @Autowired
    Service service;

    //get all the data
    @GetMapping("/courses")
    public List<Course> getCourse() {
        return service.listAllCourse();
    }

    //get the course details by
    //ID
    @GetMapping("/courses/{id}")
    public ResponseEntity<Course> get(@PathVariable Integer id) {
        try {
            Course course = service.getCourse(id);
            return new ResponseEntity<Course>(course, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Course>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/courses")
    public void add(@RequestBody Course course) {
        service.saveCourse(course);
    }
    /*@PutMapping("/{id}")
    public ResponseEntity<?>*/





}
