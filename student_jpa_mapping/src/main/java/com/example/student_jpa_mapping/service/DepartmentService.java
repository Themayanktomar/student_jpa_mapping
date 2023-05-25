package com.example.student_jpa_mapping.service;

import com.example.student_jpa_mapping.entity.Department;
import com.example.student_jpa_mapping.entity.User;

import java.util.List;

public interface DepartmentService {
    public Department addDepartment(Department department);
    public List<Department> getDepartment();
}
