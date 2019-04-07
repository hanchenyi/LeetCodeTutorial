package com.example.demo.repository;

import com.example.demo.repository.model.RUserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<RUserProfile,Long> {
}