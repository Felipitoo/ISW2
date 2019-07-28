package com.proyecto.demo.Services;

import com.proyecto.demo.Models.Group;
import com.proyecto.demo.Repository.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    GroupRepo groupRepo;
    @Override
    public void save(Group group){
        groupRepo.save(group);
    }
}
