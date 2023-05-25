package com.example.student_jpa_mapping.Repository;

import com.example.student_jpa_mapping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
