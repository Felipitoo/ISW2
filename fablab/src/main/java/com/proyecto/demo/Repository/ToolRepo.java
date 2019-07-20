package com.proyecto.demo.Repository;


import com.proyecto.demo.Models.Tool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ToolRepo")
public interface ToolRepo extends JpaRepository <Tool, Integer> {
    List<Tool> findAllByAvailability(int disp);
    Tool findAllById(int Id);
}