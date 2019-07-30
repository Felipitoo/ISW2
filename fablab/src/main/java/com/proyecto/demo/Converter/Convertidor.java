package com.proyecto.demo.Converter;

import com.proyecto.demo.Models.External;
import com.proyecto.demo.Models.Group;
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

    public List<External> convertirListaExternal(List<External> externals) {
        List<External> list_external = new ArrayList<>();
        for(External external : externals){
            list_external.add(new External(external));
        }
        return list_external;
    }

    public List<Group> convertirListaGroup(List<Group> groups) {
        List<Group> list_group = new ArrayList<>();
        for(Group grupo : groups){
            list_group.add(new Group (grupo));
        }
        return list_group;
    }

}
