package com.proyecto.demo.Repository;


import com.proyecto.demo.Models.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepo extends JpaRepository <Storage, Integer> {
    
}