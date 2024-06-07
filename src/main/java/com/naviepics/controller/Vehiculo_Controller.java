package com.naviepics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vehiculo")
public class Vehiculo_Controller {
	@GetMapping
    public String verUsuario(){
        return "vehiculo";
        
    }
}
