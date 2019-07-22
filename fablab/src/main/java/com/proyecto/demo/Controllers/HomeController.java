package com.proyecto.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class HomeController {

    @RequestMapping(value="/",method= RequestMethod.GET)
    public String helloWorld(Model model,RedirectAttributes redirectAttributes){
        model.addAttribute("hello","HelloWorld");
        return "index";
    }

    @RequestMapping(value="/index")
    public String aprueba(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message", "El usuario ha sido creado correctamente");
        redirectAttributes.addFlashAttribute("alertClass", "alert-success");
        return "index";
    }

    @GetMapping(value="/secret")
    public String secret(RedirectAttributes redirectAttributes){
        //redirectAttributes.addFlashAttribute("message", "Success");
        //redirectAttributes.addFlashAttribute("alertClass", "alert-success");
        return "secret";
    }
}