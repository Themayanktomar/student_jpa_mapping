package com.example.student_jpa_mapping.Repository;

import com.example.student_jpa_mapping.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer>{
}
