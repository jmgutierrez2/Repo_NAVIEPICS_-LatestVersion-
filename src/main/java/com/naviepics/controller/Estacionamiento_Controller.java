package com.naviepics.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naviepics.model.MySQL.Estacionamiento;
import com.naviepics.service.Estacionamiento_Service;


@Controller
@RequestMapping("estacionamientos")
public class Estacionamiento_Controller {
	@Autowired
    private Estacionamiento_Service estS;
	 
	@PostMapping
    public String saveEst(@ModelAttribute("estacionamiento")Estacionamiento est){
		System.out.println("ESTACIONAMIENTO GUARDADO CORRECTAMENTE");
		estS.saveOrUpdate(est);
        System.out.println("ESTACIONAMIENTO GUARDADO CORRECTAMENTE");
        return "redirect:/estacionamientos";
        
    }
	@GetMapping
    public String verYregEst(Model modelo){
        modelo.addAttribute("estacionamiento",new Estacionamiento());
        modelo.addAttribute("listaEstacionamiento",estS.findAll());
        System.out.println("ENTRGANDO ATRIBUTOS");
        return "estacionamiento";
    }
	
}
