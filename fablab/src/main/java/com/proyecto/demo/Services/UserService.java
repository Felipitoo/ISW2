package com.proyecto.demo.Services;

import com.proyecto.demo.Models.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
