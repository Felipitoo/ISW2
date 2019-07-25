package com.proyecto.demo.Converter;

import com.proyecto.demo.Models.Machine;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("MachineConverter")
public class MachineConverter {
    public List<Machine> convertirListaMachine(List<Machine> machines){
        List<Machine> L_machines = new ArrayList<>();
        for (Machine Mach : machines){
            L_machines.add(new Machine(Mach));
        }
        return L_machines;
    }


}
