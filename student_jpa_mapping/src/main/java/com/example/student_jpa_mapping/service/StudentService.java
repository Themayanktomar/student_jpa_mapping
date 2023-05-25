package com.example.student_jpa_mapping.service;

import com.example.student_jpa_mapping.entity.Student;
import com.example.student_jpa_mapping.entity.User;

import java.util.List;

public interface StudentService {
    public Student addUser(Student student);
    public List<Student> getStudent();

}
