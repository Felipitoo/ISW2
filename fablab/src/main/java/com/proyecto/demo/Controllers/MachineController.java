package com.proyecto.demo.Controllers;




import com.proyecto.demo.Models.Machine;
import com.proyecto.demo.Services.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/machine")
public class MachineController {

    @Autowired
    @Qualifier("MachineService")
    private MachineService smach;

    @RequestMapping("/index")
    public String index_machine(){
        return "redirect:/index";
    }

    @GetMapping("/listado_maquinas")
    public ModelAndView listado(){
        List<Machine> mach = smach.obtenerPorLista();
        ModelAndView vista = new ModelAndView("machines");
        vista.addObject("mach", mach);
        return vista;
    }

    @GetMapping("/maquinas_disponibles")
    public ModelAndView disponibles(){
        List<Machine> mach = smach.obtenerAlgunos();
        ModelAndView vista = new ModelAndView("machines");
        vista.addObject("machin", mach);
        return vista;
    }





}
