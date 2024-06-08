package com.naviepics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naviepics.model.MySQL.Usuario;
import com.naviepics.service.Usuario_Service;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("inicioSesion")
public class InicioSesion_Controller {
	@Autowired
	private Usuario_Service uSvc;
	@GetMapping
    public String verUsuario(Model model){
		model.addAttribute("usuarioInicioSesion",new Usuario());
		model.addAttribute("usuarioRegistro",new Usuario());
        return "inicioSesion.html";
    }
	
	@PostMapping("/iniciar")
    public String iniciarSesion(@ModelAttribute("usuarioInicio")Usuario usuario, Model model, HttpSession session){
        System.out.println("METODO EJECUTANDOSE");
        if(uSvc.buscarEmail(usuario)){
            //model.addAttribute("usuarioIniciado",uSvc.buscarXEmail(usuario));
            session.setAttribute("usuarioIniciado", uSvc.buscarXEmail(usuario));
            return "redirect:/estacionamientos";
        }else{
            model.addAttribute("error","Credenciales incorrectas");
            return "redirect:/inicioSesion";
        }
    }
	@PostMapping("/crear")
    public String registrarSesion(@ModelAttribute("usuarioCreacion")Usuario usuario, Model model, HttpSession session){
		System.out.println("Usuario ingresado");
    	uSvc.saveOrUpdate(usuario);
    	return "redirect:/estacionamientos";
       
    }
	
}
