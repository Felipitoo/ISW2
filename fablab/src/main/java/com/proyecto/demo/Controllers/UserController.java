package com.proyecto.demo.Controllers;

import com.proyecto.demo.Models.User;
import com.proyecto.demo.Services.SecurityService;
import com.proyecto.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;


    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("userForm", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute("userForm") User userForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "signup";
        }
        System.out.print(userForm);
        userService.save(userForm);
        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/secret";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout){
        if (error != null){
            model.addAttribute("error","Contraseña o Password invalida");
        }
        if(logout != null){
            model.addAttribute("message","Cerraste Sesión");
        }
        return "login";
    }

