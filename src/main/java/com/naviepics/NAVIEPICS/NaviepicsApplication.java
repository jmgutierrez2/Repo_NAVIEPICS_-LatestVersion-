package com.naviepics.NAVIEPICS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.naviepics.model.MySQL.Estacionamiento;
import com.naviepics.model.MySQL.Tipo_Espacios;
import com.naviepics.model.MySQL.Tipo_Vehiculo;
import com.naviepics.model.MySQL.Usuario;
import com.naviepics.service.Estacionamiento_Service;
import com.naviepics.service.Tipo_Espacios_Service;
import com.naviepics.service.Tipo_Vehiculo_Service;
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
	private Tipo_Espacios_Service t_Esp;
	@Autowired
	private Tipo_Vehiculo_Service t_Vehi;
	
    public void run(String... args) throws Exception {
    	insertarEstacionamientos();
    	insertarUsuarios();
    	  
    }
    //ESTACIONAMIENTOS---------------------------------- 
    public void insertarEstacionamientos() {
    	est("Playa de estacionamiento", "Paucarpata 128, Arequipa 04001", 50, "Lunes a viernes - 24 horas", false);
    	est("Playa de Estacionamiento", "Paucarpata 140, Arequipa 04001", 30, "Lunes a sábado 7:00 - 22:00", false);
    	est("Playa de Estacionamiento", "Tronchadero 209, Arequipa 04001", 45, "Lunes a viernes 6:00 - 20:00", true);
    	est("Playa de Estacionamiento", "C. San José 131, Arequipa 04001", 40, "Lunes a domingo 9:00 - 20:00", false);
    	est("Playa de Estacionamiento", "C. Rivero 312, Arequipa 04001", 50, "Lunes a sábado 10:00 - 22:30", true);
    	est("Playa de Estacionamiento", "C. Palacio Viejo 416, Arequipa 04001", 55, "Lunes a domingo 7:00 - 19:00", true);
    	est("Playa de Estacionamiento", "C. Rivero 200, Cercado De Arequipa 04001", 60, "Lunes a sábado 10:00 - 23:00", false);
    	est("Playa de Estacionamiento", "Calle Nueva 519, Cercado de Arequipa 04001", 60, "Lunes a viernes - 24 horas", true);
    	est("Playa de Estacionamiento", "04001, Arequipa 04001", 100, "Lunes a sábado 9:00 - 21:00", true);
    	est("Playa de Estacionamiento", "Av. Siglo XX 218, Arequipa 04001", 25, "Lunes a sábado 7:00 - 20:00", false);
    	est("Playa de Estacionamiento Perú", "C. Perú 520a, Arequipa 04001", 30, "Lunes a sábado 7:00 - 22:00", false);
    	est("Playa de Estacionamiento", "Calle Nueva 327- A, Cercado De Arequipa 04001", 45, "Lunes a viernes 8:00 - 20:00", false);
    	est("Playa de Estacionamiento", "28 de Julio 106, Arequipa 04001", 40, "Lunes a sábado 8:00 - 18:00", true);
    	est("Playa de Estacionamiento", "C. Álvarez Thomas 462, Cercado De Arequipa 04001", 30, "Lunes a sábado 9:30 - 19:00", false);
    	est("Playa de Estacionamiento El Sol", "C. Álvarez Thomas 466, Arequipa 04001", 35, "Lunes a domingo - 24 horas", true);
    	est("Playa de Estacionamiento", "Pizarro 210, Arequipa 04001", 40, "Lunes a sábado 10:00 - 22:00", true);
    	est("Playa de Estacionamiento Moral", "C. Moral 403, Arequipa 04001", 45, "Lunes a sábado 7:00 - 21:00", false);
    	est("Playa de Estacionamiento", "C. Palacio Viejo 511, Arequipa 04001", 30, "Lunes a viernes 10:00 - 22:00", false);
    	est("Playa", "Ricardo Palma 203, Cercado De Arequipa 04013", 55, "Lunes a domingo 6:00 - 23:00", true);
    	est("Playa de Estacionamiento", "C. la Merced 509, Arequipa 04001", 50, "Lunes a domingo - 24 horas", false);
    	est("Playa de Estacionamiento Moral / San Francisco", "C. Moral 205, Arequipa 04001", 55, "Lunes a sábado 7:00 - 22:00", false);
    	est("Playa", "C. Santo Domingo 215a, Arequipa 04001", 40, "Lunes a sábado 8:30 - 23:30", true);
    	est("Playa de Estacionamiento", "C. Peral 315, Cercado De Arequipa 04001", 30, "Lunes a domingo 9:30 - 19:30", false);
    	est("Playa", "Calle, República de Chile 103, Cercado De Arequipa 04001", 35, "Lunes a sábado 7:00 - 22:00", false);
    	est("Playa", "Mz, Los Angeles 11, Cercado De Arequipa 04013", 40, "Lunes a sábado 8:00 - 22:00", true);
    	est("Playa", "C. San José 309, Arequipa 04001", 50, "Lunes a viernes 7:00 - 20:00", false);
    	est("Playa de Estacionamiento", "Cuarto Piso, Pje. Sta. Rosa 104, Arequipa 04000", 35, "Lunes a sábado - 24 horas", false);
    	est("Playa Paucarpata", "Paucarpata 333, Arequipa 04001", 60, "Lunes a domingo - 24 horas", true);
    	est("Playa Club Arequipa Cochera Aparcamiento", "C. Álvarez Thomas 111, Arequipa 04001", 40, "Lunes a domingo 7:00 - 22:00", false);
    	est("Playa de Estacionamiento", "Ca. Consuelo 417, Arequipa 04001", 40, "Lunes a domingo 7:00 - 23:00", true);
    	est("Playa", "C. el Palomar 109, Cercado Arequipa 04002", 30, "Lunes a sábado 9:00 - 21:00", true);
    	est("Playa de Estacionamiento", "Calle Jerusalén 512, Yanahuara, Cercado De Arequipa 04017", 35, "Lunes a viernes 8:00 - 22:30", false);
    	est("Playa de Estacionamiento Peral", "C. Peral 205, Arequipa 04001", 60, "Lunes a sábado 9:30 - 21:00", false);
    	est("Playa Nicolás de Piérola", "C. Piérola 117, Arequipa 04001", 55, "Lunes a sábado - 24 horas", false);
    	est("Playa", "Av.Emmel 216, Yanahuara, Cercado De Arequipa 04013", 25, "Lunes a sábado 8:00 - 20:00", true);
    	est("Playa Central", "C. Rivero 232, Arequipa 04001", 35, "Lunes a domingo - 24 horas", true);
    	est("Playa", "JF36+8GP, Villalba, Cercado de Arequipa 04001", 25, "Lunes a viernes - 24 horas", false);
    	est("Playa", "Castilla 126, Arequipa 04001", 60, "Lunes a sábado 10:00 - 22:00", true);
    	est("Playa de Estacionamiento LA MERCED Parqueo vehicular", "Calle, Octavio Muñoz Najar 137, Cercado De Arequipa 04001", 50, "Lunes a sábado 8:00 - 20:30", true);
    	est("Playa Pública", "Calle Nueva 223, Cercado De Arequipa 04001", 35, "Lunes a viernes 10:00 - 20:00", false);
    	est("Playa de Estacionamiento ALEMERCED", "HFW6+22H, C. la Merced, Arequipa 04001", 30, "Lunes a domingo - 24 horas", true);
    	est("Playa", "C. Jerusalén 521, Cercado De Arequipa 04001", 50, "Lunes a domingo 8:00 - 18:00", true);
    	est("Playa", "Calle Nueva 415, Arequipa 04001", 35, "Lunes a domingo 8:00 - 21:00", false);
    	est("Playa de Estacionamiento San Nicolás", "C. Piérola 318a, Arequipa 04001", 30, "Lunes a sábado 10:00 - 23:00", false);
    	
    }
    
    //USUARIO -------------------------------------------
    public void insertarUsuarios() {
    	usu("Mario", "Villanueva", "mario_villanueva@gmail.com","mariovillanueva");
    	usu("Oscar", "Pineda", "oscar_pineda@gmail.com","oscarpineda");
    	usu("Rodrigo", "Barrios", "rodrigo_barrios@gmail.com","rodrigobarrios");
    	usu("Laura", "Martínez", "laura_martinez@gmail.com", "lauramartinez");
    	usu("Carlos", "López", "carlos_lopez@gmail.com", "carloslopez");
    	usu("Ana", "García", "ana_garcia@gmail.com", "anagarcia");
    	usu("José", "Pérez", "jose_perez@gmail.com", "joseperez");
    	usu("María", "Rodríguez", "maria_rodriguez@gmail.com", "mariarodriguez");
    	usu("Gustavo", "Fernández", "gustavo_fernandez@gmail.com", "gustavofernandez");
    	usu("Elena", "Gómez", "elena_gomez@gmail.com", "elenagomez");
    	usu("Jorge", "Díaz", "jorge_diaz@gmail.com", "jorgediaz");
    	usu("Sofía", "Morales", "sofia_morales@gmail.com", "sofiamorales");
    	usu("Pablo", "Hernández", "pablo_hernandez@gmail.com", "pablohernandez");
    	usu("Marta", "Ruiz", "marta_ruiz@gmail.com", "martaruiz");
    	usu("Fernando", "Jiménez", "fernando_jimenez@gmail.com", "fernandojimenez");
    	usu("Isabel", "Sánchez", "isabel_sanchez@gmail.com", "isabelsanchez");
    	usu("Ricardo", "Torres", "ricardo_torres@gmail.com", "ricardotorres");
    	usu("Patricia", "Ramírez", "patricia_ramirez@gmail.com", "patriciaramirez");
    	usu("Andrés", "Flores", "andres_flores@gmail.com", "andresflores");
    	usu("Hugo", "Castillo", "hugo_castillo@gmail.com", "hugocastillo");
    }
    
    public void insertarTipoVehiculo() {
    	T_Vehiculo("Motocicleta");
    	T_Vehiculo("Motocicleta");
    }
    public void insertarTipoEspacio() {
    	T_Espacio("Estandar");
    	T_Espacio("Para motocicletas");
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
    public void T_Vehiculo(String des) {
    	Tipo_Vehiculo e=new Tipo_Vehiculo(des);
		escribir("Objeto creado");
		System.out.println("Insercion Exitosa");
	}
    public void T_Espacio(String des) {
    	Tipo_Espacios e=new Tipo_Espacios(des);
		escribir("Objeto creado");
		System.out.println("Insercion Exitosa");
    }
    
    
    public void escribir(String t) {
    	System.out.println(t);
    }

}
