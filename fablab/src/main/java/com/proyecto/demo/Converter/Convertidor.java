package com.proyecto.demo.Converter;

import com.proyecto.demo.Models.Loan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("convertidor")
public class Convertidor {
    public List<Loan> convertirLista(List<Loan> loans){
        List<Loan> list_loans = new ArrayList<>();
        for(Loan loan : loans){
            list_loans.add(new Loan(loan));
        }
        return list_loans;
    }
}
