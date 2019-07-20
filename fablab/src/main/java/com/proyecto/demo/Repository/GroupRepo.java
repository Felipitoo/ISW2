package com.proyecto.demo.Repository;

import com.proyecto.demo.Models.Group;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("GroupRepo")
public interface GroupRepo extends JpaRepository <Group, Integer> {

}