package com.proyecto.demo.Controllers;


import com.proyecto.demo.Services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping("/formulario")
public class LoanController {

    @Autowired
    private LoanService LoanService;

    @GetMapping("/loan")
    public ModelAndView devolverTodos(){
        //List <Loan> list_loans;
        //lista_notas = NotaService.buscar_notas();
        ModelAndView mav = new ModelAndView("loan");
        //mav.addObject("notas", lista_notas);
        return mav;
    }
}

