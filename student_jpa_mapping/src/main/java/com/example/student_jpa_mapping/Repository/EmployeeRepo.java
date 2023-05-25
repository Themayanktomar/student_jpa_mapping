package com.example.student_jpa_mapping.Repository;

import com.example.student_jpa_mapping.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
