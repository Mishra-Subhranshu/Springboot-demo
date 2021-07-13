package com.example.springbootproject.springbootproject.dao;

import com.example.springbootproject.springbootproject.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Integer> {

}
