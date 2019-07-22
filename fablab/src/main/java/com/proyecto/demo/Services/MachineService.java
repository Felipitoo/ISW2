package com.proyecto.demo.Services;

import com.proyecto.demo.Converter.MachineConverter;
import com.proyecto.demo.Models.Machine;
import com.proyecto.demo.Repository.MachineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("MachineService")
public class MachineService {
    @Autowired
    @Qualifier("MachineRepo")
    private MachineRepo rmach;

    @Autowired
    @Qualifier("MachineConverter")
    private MachineConverter cmach;

    public boolean crear(Machine machines){
        try{
            rmach.save(machines);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Machine machines){
        try{
            rmach.save(machines);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean borrar(String name){
        try{
            Machine mach = rmach.findByName(name);
            rmach.delete(mach);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public List<Machine> obtenerPorLista(){
        return cmach.convertirListaMachine(rmach.findAll());

    }

    public List<Machine> obtenerAlgunos(){
        List<Machine> aux = cmach.convertirListaMachine(rmach.findAll());
        List<Machine> retorno = new ArrayList<Machine>();
        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).getAvailability() == 1) {
                retorno.add(aux.get(i));
            }
        }
        return retorno;
    }




}