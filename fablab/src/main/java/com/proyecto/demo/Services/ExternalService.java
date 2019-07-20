package com.proyecto.demo.Services;

import com.proyecto.demo.Converter.Convertidor;
import com.proyecto.demo.Models.External;
import com.proyecto.demo.Repository.ExternalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("ExternalService")
public class ExternalService {
    @Autowired
    @Qualifier("ExternalRepo")
    private com.proyecto.demo.Repository.ExternalRepo ExternalRepo;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean crear(External external){
        try{
            ExternalRepo.save(external);
            return true;
        }catch(Exception e){
            return false;
        }
    }


    public boolean actualizar(External external){
        try{
            ExternalRepo.save(external);
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

    public List<External> obtener(){
        return convertidor.convertirListaExternal(ExternalRepo.findAll());
    }

}