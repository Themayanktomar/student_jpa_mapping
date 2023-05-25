package com.example.student_jpa_mapping.Repository;

import com.example.student_jpa_mapping.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepo extends JpaRepository<UserProfile,Integer> {
}
