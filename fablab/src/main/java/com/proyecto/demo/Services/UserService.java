package com.proyecto.demo.Services;

import com.proyecto.demo.Models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
