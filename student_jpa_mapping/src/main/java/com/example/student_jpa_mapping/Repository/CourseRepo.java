package com.example.student_jpa_mapping.Repository;

import com.example.student_jpa_mapping.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
