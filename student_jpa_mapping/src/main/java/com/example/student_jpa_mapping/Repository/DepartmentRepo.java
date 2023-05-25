package com.example.student_jpa_mapping.Repository;

import com.example.student_jpa_mapping.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
