package com.example.student_jpa_mapping.service;

import com.example.student_jpa_mapping.entity.Employee;
import com.example.student_jpa_mapping.entity.User;

import java.util.List;

public interface EmployeeSErvice {
    public Employee addEmployee(Employee employee);
    public List<Employee> getEmp();
}
