package com.example.student_jpa_mapping.service;

import com.example.student_jpa_mapping.Repository.UserRepo;
import com.example.student_jpa_mapping.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImp implements UserService{


    @Autowired
    UserRepo userRepo;

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getUser() {
        return userRepo.findAll();
    }
}
