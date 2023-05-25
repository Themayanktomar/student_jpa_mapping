package com.example.student_jpa_mapping.service;

import com.example.student_jpa_mapping.Repository.EmployeeRepo;
import com.example.student_jpa_mapping.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImp implements EmployeeSErvice{

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getEmp() {
        return employeeRepo.findAll();
    }
}
