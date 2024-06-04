package com.naviepics.NAVIEPICS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.naviepics.model.MySQL.Estacionamiento;
import com.naviepics.model.MySQL.Usuario;
import com.naviepics.service.Estacionamiento_Service;
import com.naviepics.service.Tipo_Espacios_Service;
import com.naviepics.service.Usuario_Service;
import com.naviepics.serviceImpl.Estacionamiento_ServiceImpl;


@SpringBootApplication
@ComponentScan(basePackages = "com.naviepics")  // Asegúrate de que el paquete base sea correcto
public class NaviepicsApplication implements CommandLineRunner{

	public static void main(String[] args){
		SpringApplication.run(NaviepicsApplication.class, args);
	}
		
	@Autowired
	private Estacionamiento_Service estS;
	@Autowired
	private Usuario_Service usS;
	@Autowired
	private Tipo_Espacios_Service tespS;
	
    public void run(String... args) throws Exception {
    	insertarEstacionamientos();
    	insertarUsuarios();
    	  
    }
    //ESTACIONAMIENTOS---------------------------------- 
    public void insertarEstacionamientos() {
    	est("Playa de estacionamiento", "Paucarpata 128, Arequipa 04001", 50, "Lunes a viernes  - 24 horas", false);

    }
    
    //USUARIO -------------------------------------------
    public void insertarUsuarios() {
    	usu("Mario", "Villanueva", "mario_villanueva@gmail.com","mariovillanueva");
    	usu("Oscar", "Pineda", "oscar_pineda@gmail.com","oscarpineda");
    }
    
          
    //METODOS DE INSERCION DE DATOS
    public void est(String nom, String dir, Integer qEsp, String hor, boolean est) {
		Estacionamiento e=new Estacionamiento(nom,dir,qEsp,hor,est);
		escribir("Objeto creado");
		estS.saveOrUpdate(e);
		System.out.println("Insercion Exitosa");
	}
    public void usu(String nom, String ape, String email,String pass) {
		Usuario e=new Usuario(nom,ape,email,pass);
		escribir("Objeto creado");
		usS.saveOrUpdate(e);
		System.out.println("Insercion Exitosa");
	}
       
    
    
    public void escribir(String t) {
    	System.out.println(t);
    }

}
