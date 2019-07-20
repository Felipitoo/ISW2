package com.proyecto.demo.Services;

import com.proyecto.demo.Models.Typeuser;
import com.proyecto.demo.Models.User;
import com.proyecto.demo.Repository.TypeuserRepo;
import com.proyecto.demo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private TypeuserRepo typeuserRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        for (Typeuser tipo : typeuserRepo.findAll()){
            if (tipo.getId_type_user()== 0){
                HashSet aux = new HashSet<Typeuser>();
                aux.add(tipo);
                user.setTypeusers(aux);
            }
        }
        userRepo.save(user);
    }
    @Override
    public User findByUsername(String username){
        return userRepo.findByUsername(username);

    }

}
