package com.proyecto.demo.Repository;


import com.proyecto.demo.Models.Tool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToolRepo extends JpaRepository <Tool, Integer> {
    
}