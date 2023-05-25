package com.example.student_jpa_mapping.service;

import com.example.student_jpa_mapping.entity.Course;
import com.example.student_jpa_mapping.entity.User;

import java.util.List;

public interface CourseService {

    public Course addCourse(Course course);
    public List<Course> getCourse();
}
