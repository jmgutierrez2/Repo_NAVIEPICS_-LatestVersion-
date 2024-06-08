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
@RequestMapping("/inicioSesion")
public class Usuario_Controller {
	@Autowired
	private Usuario_Service uSvc;
	@GetMapping
    public String verUsuario(Model model){
		model.addAttribute("usuario1",new Usuario());
		model.addAttribute("usuario2",new Usuario());
        return "usuario";
    }
	
	@PostMapping("/iniciar")
    public String iniciarSesion(@ModelAttribute("usuario")Usuario usuario, Model model, HttpSession session){
        System.out.println("METODO EJECUTANDOSE");
        if(uSvc.buscarEmail(usuario)){
            System.out.println("VALIDANDO CUENTA");
            //model.addAttribute("usuarioIniciado",uSvc.buscarXEmail(usuario));
            session.setAttribute("usuarioIniciado", uSvc.buscarXEmail(usuario));
            System.out.println("CUENTA VALIDADA");
            return "redirect:/estacionamientos";
        }else{
            model.addAttribute("error","Credenciales incorrectas");
            return "redirect:/inicioSesion";
        }
    }
	@PostMapping("/crear")
    public String registrarSesion(@ModelAttribute("usuario")Usuario usuario, Model model, HttpSession session){
        System.out.println("METODO EJECUTANDOSE");
        if(uSvc.buscarEmail(usuario)){
            System.out.println("VALIDANDO CUENTA");
            //model.addAttribute("usuarioIniciado",uSvc.buscarXEmail(usuario));
            session.setAttribute("usuarioIniciado", uSvc.buscarXEmail(usuario));
            System.out.println("CUENTA VALIDADA");
            return "redirect:/estacionamientos";
        }else{
            model.addAttribute("error","Credenciales incorrectas");
            return "redirect:/usuario";
        }
    }
	
}
