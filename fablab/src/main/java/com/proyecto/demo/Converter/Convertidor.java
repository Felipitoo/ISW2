package com.proyecto.demo.Converter;

import com.proyecto.demo.Models.Loan;
import com.proyecto.demo.Models.Tool;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("convertidor")
public class Convertidor {
    public List<Loan> convertirListaLoan(List<Loan> loans){
        List<Loan> list_loans = new ArrayList<>();
        for(Loan loan : loans){
            list_loans.add(new Loan(loan));
        }
        return list_loans;
    }
    public List<Tool> convertirListaTool(List<Tool> tools){
        List<Tool> list_tools = new ArrayList<>();
        for(Tool tool : tools){
            list_tools.add(new Tool(tool));
        }
        return list_tools;
    }
}
