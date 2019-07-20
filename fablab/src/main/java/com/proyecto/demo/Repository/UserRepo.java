package com.proyecto.demo.Repository;

import com.proyecto.demo.Models.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("UserRepo")
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);

    List<User> findAll();
}