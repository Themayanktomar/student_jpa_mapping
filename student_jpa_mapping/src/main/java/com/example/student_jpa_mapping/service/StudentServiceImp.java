package com.example.student_jpa_mapping.service;

import com.example.student_jpa_mapping.Repository.StudentRepo;
import com.example.student_jpa_mapping.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImp implements StudentService{


    @Autowired
    StudentRepo studentRepo;

    @Override
    public Student addUser(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getStudent() {
        return studentRepo.findAll();
    }
}
