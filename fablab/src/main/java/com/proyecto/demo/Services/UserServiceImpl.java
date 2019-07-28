package com.proyecto.demo.Services;

import com.proyecto.demo.Converter.Convertidor;
import com.proyecto.demo.Models.Group;
import com.proyecto.demo.Models.Typeuser;
import com.proyecto.demo.Models.User;
import com.proyecto.demo.Repository.GroupRepo;
import com.proyecto.demo.Repository.TypeuserRepo;
import com.proyecto.demo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepo userRepo;

    @Autowired
    private TypeuserRepo typeuserRepo;

    @Autowired
    private GroupRepo groupRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

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
        for (Group grupo : groupRepo.findAll()){
                Group aux;
                aux = groupRepo.getOne(0);
                System.out.print(aux);
                user.setGroup(aux);
                Set<User> usuarios = new HashSet<User>();
                usuarios.add(user);
                aux.setUsers(usuarios);
        }
        System.out.println("no entro");

        userRepo.save(user);
    }

    @Override
    public User findByUsername(String username){
        return userRepo.findByUsername(username);

    }

}
