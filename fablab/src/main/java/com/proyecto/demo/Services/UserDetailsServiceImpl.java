package com.proyecto.demo.Services;

import com.proyecto.demo.Models.Typeuser;
import com.proyecto.demo.Models.User;
import com.proyecto.demo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String user_name){
        User user = userRepo.findByUsername(user_name);
        if(user == null){
            throw new UsernameNotFoundException(user_name);
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for(Typeuser typeuser : user.getTypeusers()){
            grantedAuthorities.add(new SimpleGrantedAuthority(typeuser.getType_name()));
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),grantedAuthorities);

    }

}
