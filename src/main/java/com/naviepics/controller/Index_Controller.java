package com.naviepics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naviepics.model.MySQL.Estacionamiento;
import com.naviepics.model.MySQL.Usuario;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class Index_Controller {
	
	
	@GetMapping
    public String inicio(HttpSession session, Model model){
		Usuario u= (Usuario)session.getAttribute("usuarioIniciado");
		model.addAttribute("usu",u);
        return "index";
    }
}
