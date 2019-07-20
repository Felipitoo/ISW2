package com.proyecto.demo.Controllers;

import com.proyecto.demo.Models.Tool;
import com.proyecto.demo.Services.LoanService;
import com.proyecto.demo.Services.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
}

