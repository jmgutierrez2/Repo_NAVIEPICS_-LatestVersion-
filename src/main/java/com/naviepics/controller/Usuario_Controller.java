package com.naviepics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naviepics.model.MySQL.Estacionamiento;

@Controller
@RequestMapping("usuario")
public class Usuario_Controller {
	@GetMapping
    public String verUsuario(){
        return "usuario";
    }
}
