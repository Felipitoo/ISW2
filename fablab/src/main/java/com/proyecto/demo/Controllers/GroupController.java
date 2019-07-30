package com.proyecto.demo.Controllers;

import com.proyecto.demo.Models.Group;
import com.proyecto.demo.Models.User;
import com.proyecto.demo.Repository.GroupRepo;
import com.proyecto.demo.Services.GroupService;
import com.proyecto.demo.Services.GroupServiceImpl;
import com.proyecto.demo.Services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller

@RequestMapping("/group")
public class GroupController {

    @Autowired
    GroupRepo groupRepo;

    @Autowired
    GroupServiceImpl groupService;

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/login")
    public String login(){
        return "redirect:/login";
    }

    @RequestMapping("/signup")
    public String signup(){
        return "redirect:/signup";
    }


    @GetMapping("/add")
    public String agregar(Model model){
        model.addAttribute("groupForm", new Group());
        return "group_add";
    }

    @PostMapping("/add")
    public String agregar(@ModelAttribute("groupForm") Group groupForm, RedirectAttributes redirectAttributes){
        groupService.save(groupForm);
        redirectAttributes.addFlashAttribute("message", "El grupo ha sido creado correctamente");
        redirectAttributes.addFlashAttribute("alertClass", "alert-success");
        return "redirect:/index";
    }

    @GetMapping("/participant")
    public String integrar(Model model){
        model.addAttribute("participantForm", new User());
        List<Group> list_groups = groupService.obtener();
        model.addAttribute("grupos",list_groups);
        return "group_participant";

    }

    @PostMapping("/participant")
    public String integrar(@ModelAttribute("participantForm") User participantForm, RedirectAttributes redirectAttributes){
        userService.save(participantForm);
        redirectAttributes.addFlashAttribute("message", "El integrante ha sido agregado correctamente");
        redirectAttributes.addFlashAttribute("alertClass", "alert-success");
        return "redirect:/index";

    }

}
