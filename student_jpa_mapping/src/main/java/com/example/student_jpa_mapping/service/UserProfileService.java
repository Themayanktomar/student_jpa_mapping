package com.example.student_jpa_mapping.service;

import com.example.student_jpa_mapping.entity.User;
import com.example.student_jpa_mapping.entity.UserProfile;

import java.util.List;

public interface UserProfileService {
    public UserProfile addUser(UserProfile userProfile);
    public List<UserProfile> getUserProfile();
}
