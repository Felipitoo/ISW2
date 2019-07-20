package com.proyecto.demo.Repository;

import com.proyecto.demo.Models.Type_User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Type_UserRepo extends JpaRepository <Type_User, Integer> {
    
}