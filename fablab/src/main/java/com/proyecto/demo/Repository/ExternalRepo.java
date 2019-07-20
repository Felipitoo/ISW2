package com.proyecto.demo.Repository;


import com.proyecto.demo.Models.External;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExternalRepo extends JpaRepository <External, Integer> {
    
}