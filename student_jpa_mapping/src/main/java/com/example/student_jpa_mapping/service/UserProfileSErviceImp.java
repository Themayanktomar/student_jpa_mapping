package com.example.student_jpa_mapping.service;

import com.example.student_jpa_mapping.Repository.UserProfileRepo;
import com.example.student_jpa_mapping.entity.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserProfileSErviceImp implements UserProfileService{

    @Autowired
    UserProfileRepo userProfileRepo;

    @Override
    public UserProfile addUser(UserProfile userProfile) {
        return userProfileRepo.save(userProfile);
    }

    @Override
    public List<UserProfile> getUserProfile() {
        return userProfileRepo.findAll();
    }
}
