package com.example.student_jpa_mapping.service;

import com.example.student_jpa_mapping.Repository.DepartmentRepo;
import com.example.student_jpa_mapping.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentServiceImp implements DepartmentService {
    @Autowired
    DepartmentRepo departmentRepo;
    @Override
    public Department addDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public List<Department> getDepartment() {
        return departmentRepo.findAll();
    }
}
