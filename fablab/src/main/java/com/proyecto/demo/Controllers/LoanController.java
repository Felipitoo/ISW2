package com.proyecto.demo.Controllers;

import com.proyecto.demo.Models.External;
import com.proyecto.demo.Models.Loan;
import com.proyecto.demo.Models.Tool;

import com.proyecto.demo.Repository.LoanRepo;
import com.proyecto.demo.Services.LoanService;
import com.proyecto.demo.Services.ToolService;
import com.proyecto.demo.Services.ExternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller

@RequestMapping("/formulario")
public class LoanController {

    @Autowired
    private LoanService LoanService;
    @Autowired
    private ToolService ToolService;
    @Autowired
    private ExternalService ExternalService;

    @Autowired
    private LoanRepo loanRepo;


    @RequestMapping("/login")
    public String login_loan(){
        return "redirect:/login";
    }

    @RequestMapping("/signup")
    public String signup(){
        return "redirect:/signup";
    }

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
    public String GuardarPrestamo(@ModelAttribute ("full_name") String full_name, @ModelAttribute ("rut") String rut,
                                  @ModelAttribute ("date") String date, @ModelAttribute ("tool_id") int tool_id) throws ParseException {
        //System.out.println(full_name);
        //System.out.println(rut);
        //System.out.println(date);
        //System.out.println(tool_id);
        // creacion de nuevo external

        External new_external = new External();
        new_external.setName(full_name);
        new_external.setRut(rut);

        // creacion de nuevo loan prestamo
        Tool used_tool = ToolService.getById(tool_id);
        System.out.println(Tool.class.getName());
        Loan new_loan = new Loan();

        SimpleDateFormat parse_aux =new SimpleDateFormat("yyyy-MM-dd");
        Date aux_date = parse_aux.parse(date);
        new_loan.setDate(aux_date);
        Set aux1 = new HashSet<External>();
        aux1.add(new_external);
        //new_loan.setTool(aux1);
        Set aux2 = new HashSet<Tool>();
        aux2.add(used_tool);
        new_loan.setTool(aux2);
        LoanService.crear(new_loan);
        new_external.setLoan(loanRepo.getOne(new_loan.getLoan_number()));
        ExternalService.crear(new_external);

        // redireccionamiento


        return "redirect:/formulario/loan";


    }



}

