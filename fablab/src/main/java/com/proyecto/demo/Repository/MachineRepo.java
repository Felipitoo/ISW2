package com.proyecto.demo.Repository;


import com.proyecto.demo.Models.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepo extends JpaRepository <Machine, Integer> {
    
}