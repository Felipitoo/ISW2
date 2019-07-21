package com.proyecto.demo.Repository;

import com.proyecto.demo.Models.Typeuser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeuserRepo extends JpaRepository <Typeuser, Integer> {
    
}