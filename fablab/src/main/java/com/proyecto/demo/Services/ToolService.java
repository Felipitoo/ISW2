package com.proyecto.demo.Services;

import com.proyecto.demo.Converter.Convertidor;
import com.proyecto.demo.Models.Tool;
import com.proyecto.demo.Repository.ToolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ToolService")
public class ToolService {
    @Autowired
    @Qualifier("ToolRepo")
    private ToolRepo ToolRepo;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean crear(Tool Tool){
        try{
            ToolRepo.save(Tool);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean actualizar(Tool tool){
        try{
            ToolRepo.save(tool);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    /*
    public boolean borrar(String status, long id2){
        try{
            Nota nota = repositorio.findByStatusAndId2(status, id2);
            repositorio.delete(nota);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    */

    public List<Tool> obtener(){
        return convertidor.convertirListaTool(ToolRepo.findAll());
    }
    public List<Tool> obtenerDisponibles(int num){
        return convertidor.convertirListaTool(ToolRepo.findAllByAvailability(num));
    }
}