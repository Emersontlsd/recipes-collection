package com.college.recipes_collection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.recipes_collection.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}