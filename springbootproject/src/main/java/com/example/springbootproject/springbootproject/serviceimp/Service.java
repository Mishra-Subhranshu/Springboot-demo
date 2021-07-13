package com.example.springbootproject.springbootproject.serviceimp;

import com.example.springbootproject.springbootproject.dao.CourseRepository;
import com.example.springbootproject.springbootproject.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
@Transactional
public class Service {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> listAllCourse() {
        return courseRepository.findAll();
    }
    public void saveCourse(Course course){
        courseRepository.save(course);
    }
    public Course getCourse(Integer id) {
        return courseRepository.findById(id).get();
    }
    public void deleteCourse(Integer id){
        courseRepository.deleteById(id);
    }
}
