package com.proyecto.demo.Repository;


import com.proyecto.demo.Models.External;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ExternalRepo")
public interface ExternalRepo extends JpaRepository <External, Integer> {
    List<External> findAllById(int id);
}