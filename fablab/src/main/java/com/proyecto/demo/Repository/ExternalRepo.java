package com.proyecto.demo.Repository;


import com.proyecto.demo.Models.External;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ExternalRepo")
public interface ExternalRepo extends JpaRepository <External, Integer> {
    
}