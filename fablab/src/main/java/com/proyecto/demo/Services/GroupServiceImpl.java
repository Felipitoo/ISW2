package com.proyecto.demo.Services;

import com.proyecto.demo.Converter.Convertidor;
import com.proyecto.demo.Models.Group;
import com.proyecto.demo.Repository.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    GroupRepo groupRepo;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;


    @Override
    public void save(Group group){
        groupRepo.save(group);
    }

    public List<Group> obtener(){
        return convertidor.convertirListaGroup(groupRepo.findAll());
    }

}
