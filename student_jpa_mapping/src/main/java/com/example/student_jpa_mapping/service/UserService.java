package com.example.student_jpa_mapping.service;

import com.example.student_jpa_mapping.entity.User;

import java.util.List;

public interface UserService {
    public User addUser(User user);
    public List<User> getUser();
}
