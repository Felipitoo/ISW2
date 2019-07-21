package com.proyecto.demo.Services;

import com.proyecto.demo.Converter.Convertidor;
import com.proyecto.demo.Models.Loan;
import com.proyecto.demo.Repository.LoanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("LoanService")
public class LoanService {
    @Autowired
    @Qualifier("LoanRepo")
    private LoanRepo repositorio;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor;

    public boolean crear(Loan loan){
        try{
            repositorio.save(loan);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean actualizar(Loan loan){
        try{
            repositorio.save(loan);
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

    public List<Loan> obtener(){
        return convertidor.convertirListaLoan(repositorio.findAll());
    }

}