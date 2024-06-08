package com.naviepics.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naviepics.model.MySQL.Usuario;
import com.naviepics.model.MySQL.Vehiculo;
import com.naviepics.service.Vehiculo_Service;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("vehiculo")
public class Vehiculo_Controller {
	@Autowired
	private Vehiculo_Service vS;
	
	
	
	@GetMapping
    public String verUsuario(Model model, HttpSession session){
		List<Vehiculo> vehiculos=extraerVehiculos((Usuario)session.getAttribute("usuarioIniciado"));
		model.addAttribute("listaVehiculos",vehiculos);
        return "vehiculo";
    }
	
	public List<Vehiculo> extraerVehiculos(Usuario u) {
		List<Vehiculo> listVehiculos = new ArrayList<>();
		for(Vehiculo v : vS.findAll()) {
			if(v.getUsuario().getId()==u.getId()) {
				listVehiculos.add(v);
			}
		}
		return listVehiculos;
	}
	
	
}
