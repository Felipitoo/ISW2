package com.proyecto.demo.Controllers;

import com.proyecto.demo.Models.Tool;
import com.proyecto.demo.Services.LoanService;
import com.proyecto.demo.Services.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller

@RequestMapping("/formulario")
public class LoanController {

    @Autowired
    private LoanService LoanService;
    @Autowired
    private ToolService ToolService;

    @GetMapping("/loan")
    public ModelAndView devolverDisponibles(){
        int num = 1;
        List<Tool> list_tools = ToolService.obtenerDisponibles(num);
        //List<Tool> list_tools = ToolService.obtener();
        ModelAndView mav = new ModelAndView("loan");
        mav.addObject("tools", list_tools);
        return mav;
    }
    @PostMapping("/enviar")
    public String GuardarPrestamo(@ModelAttribute ("full_name") String full_name,@ModelAttribute ("rut") String rut,
    @ModelAttribute ("date") String date,@ModelAttribute ("tool_id") String tool_id){
        System.out.println(full_name);
        System.out.println(rut);
        System.out.println(date);
        System.out.println(tool_id);
        return "redirect:/formulario/loan";
    }



}

