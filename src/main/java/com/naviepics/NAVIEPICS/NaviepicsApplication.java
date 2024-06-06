package com.naviepics.NAVIEPICS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.naviepics.model.MySQL.Estacionamiento;
import com.naviepics.model.MySQL.Tarifas;
import com.naviepics.model.MySQL.Tipo_Vehiculo;
import com.naviepics.model.MySQL.Usuario;
import com.naviepics.model.MySQL.Vehiculo;
import com.naviepics.model.Oracle.Equipos_Estacionamiento;
import com.naviepics.model.Oracle.Proveedor;
import com.naviepics.service.Equipos_Estacionamiento_Service;
import com.naviepics.service.Estacionamiento_Service;
import com.naviepics.service.Proveedor_Service;
import com.naviepics.service.Reservaciones_Service;
import com.naviepics.service.Tarifas_Service;
import com.naviepics.service.Tipo_Vehiculo_Service;
import com.naviepics.service.Usuario_Service;
import com.naviepics.service.Vehiculo_Service;


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
	private Tipo_Vehiculo_Service t_Vehi;
	@Autowired
	private Tarifas_Service tarifas_S;
	@Autowired
	private Proveedor_Service proveedores_S;
	@Autowired
	private Equipos_Estacionamiento_Service eq_est_S;
	@Autowired
	private Vehiculo_Service vehi_S;
	@Autowired
	private Reservaciones_Service reserv_S;
	
	
    public void run(String... args) throws Exception {
    	insertarEstacionamientos();
    	insertarUsuarios();
    	insertarTipoVehiculo();
    	  
    }
    //ESTACIONAMIENTOS---------------------------------- 
   public void insertarEstacionamientos() {
    	est("Playa de estacionamiento", "Paucarpata 128, Arequipa 04001", 50, "Lunes a viernes - 24 horas", false, "https://g.co/kgs/pY3YzPR");
    	est("Playa de Estacionamiento", "Paucarpata 140, Arequipa 04001", 30, "Lunes a sábado 7:00 - 22:00", false, "https://g.co/kgs/ox4kCex");
    	est("Playa de Estacionamiento", "Tronchadero 209, Arequipa 04001", 45, "Lunes a viernes 6:00 - 20:00", true, "https://g.co/kgs/aj5KYPm");
    	est("Playa de Estacionamiento", "C. San José 131, Arequipa 04001", 40, "Lunes a domingo 9:00 - 20:00", false, "https://g.co/kgs/KQogAtj");
    	est("Playa de Estacionamiento", "C. Rivero 312, Arequipa 04001", 50, "Lunes a sábado 10:00 - 22:30", true, "https://g.co/kgs/vvLwKYB");
    	est("Playa de Estacionamiento", "C. Palacio Viejo 416, Arequipa 04001", 55, "Lunes a domingo 7:00 - 19:00", true, "https://g.co/kgs/ZyBE1Ag");
    	est("Playa de Estacionamiento", "C. Rivero 200, Cercado De Arequipa 04001", 60, "Lunes a sábado 10:00 - 23:00", false, "https://g.co/kgs/FmwAuAC");
    	est("Playa de Estacionamiento", "Calle Nueva 519, Cercado de Arequipa 04001", 60, "Lunes a viernes - 24 horas", true, "https://g.co/kgs/Dwhm6Lf");
    	est("Playa de Estacionamiento", "04001, Arequipa 04001", 100, "Lunes a sábado 9:00 - 21:00", true, "https://g.co/kgs/GC4mFop");
    	est("Playa de Estacionamiento", "Av. Siglo XX 218, Arequipa 04001", 25, "Lunes a sábado 7:00 - 20:00", false, "https://g.co/kgs/Xs524Qr");
    	est("Playa de Estacionamiento Perú", "C. Perú 520a, Arequipa 04001", 30, "Lunes a sábado 7:00 - 22:00", false, "https://g.co/kgs/u78WKTk");
    	est("Playa de Estacionamiento", "Calle Nueva 327- A, Cercado De Arequipa 04001", 45, "Lunes a viernes 8:00 - 20:00", false, "https://g.co/kgs/JHkyz2w");
    	est("Playa de Estacionamiento", "28 de Julio 106, Arequipa 04001", 40, "Lunes a sábado 8:00 - 18:00", true, "https://g.co/kgs/k4oXBjk");
    	est("Playa de Estacionamiento", "C. Álvarez Thomas 462, Cercado De Arequipa 04001", 30, "Lunes a sábado 9:30 - 19:00", false, "https://g.co/kgs/tS9zn1i");
    	est("Playa de Estacionamiento El Sol", "C. Álvarez Thomas 466, Arequipa 04001", 35, "Lunes a domingo - 24 horas", true, "https://g.co/kgs/Nhq5tWi");
    	est("Playa de Estacionamiento", "Pizarro 210, Arequipa 04001", 40, "Lunes a sábado 10:00 - 22:00", true, "https://g.co/kgs/Q6jmf5Z");
    	est("Playa de Estacionamiento Moral", "C. Moral 403, Arequipa 04001", 45, "Lunes a sábado 7:00 - 21:00", false, "https://g.co/kgs/DNURCP7");
    	est("Playa de Estacionamiento", "C. Palacio Viejo 511, Arequipa 04001", 30, "Lunes a viernes 10:00 - 22:00", false, "https://g.co/kgs/gTxVC3c");
    	est("Playa", "Ricardo Palma 203, Cercado De Arequipa 04013", 55, "Lunes a domingo 6:00 - 23:00", true, "https://g.co/kgs/iptR92e");
    	est("Playa de Estacionamiento", "C. la Merced 509, Arequipa 04001", 50, "Lunes a domingo - 24 horas", false, "https://g.co/kgs/Vj1gQ9y");
    	est("Playa de Estacionamiento Moral / San Francisco", "C. Moral 205, Arequipa 04001", 55, "Lunes a sábado 7:00 - 22:00", false, "https://g.co/kgs/Xaw673M");
    	est("Playa", "C. Santo Domingo 215a, Arequipa 04001", 40, "Lunes a sábado 8:30 - 23:30", true, "https://g.co/kgs/xvzodA3");
    	est("Playa de Estacionamiento", "C. Peral 315, Cercado De Arequipa 04001", 30, "Lunes a domingo 9:30 - 19:30", false, "https://g.co/kgs/BfEsXZC");
    	est("Playa", "Calle, República de Chile 103, Cercado De Arequipa 04001", 35, "Lunes a sábado 7:00 - 22:00", false, "https://g.co/kgs/WBE289a");
    	est("Playa", "Mz, Los Angeles 11, Cercado De Arequipa 04013", 40, "Lunes a sábado 8:00 - 22:00", true, "https://g.co/kgs/uk5acxP");
    	est("Playa", "C. San José 309, Arequipa 04001", 50, "Lunes a viernes 7:00 - 20:00", false, "https://g.co/kgs/StrL5B5");
    	est("Playa de Estacionamiento", "Cuarto Piso, Pje. Sta. Rosa 104, Arequipa 04000", 35, "Lunes a sábado - 24 horas", false, "https://g.co/kgs/1CJ9xNr");
    	est("Playa Paucarpata", "Paucarpata 333, Arequipa 04001", 60, "Lunes a domingo - 24 horas", true, "https://g.co/kgs/jMfTnqC");
    	est("Playa Club Arequipa Cochera Aparcamiento", "C. Álvarez Thomas 111, Arequipa 04001", 40, "Lunes a domingo 7:00 - 22:00", false, "https://g.co/kgs/is6H4x4");
    	est("Playa de Estacionamiento", "Ca. Consuelo 417, Arequipa 04001", 40, "Lunes a domingo 7:00 - 23:00", true, "https://g.co/kgs/f6ZYQPk");
    	est("Playa", "C. el Palomar 109, Cercado Arequipa 04002", 30, "Lunes a sábado 9:00 - 21:00", true, "https://g.co/kgs/EtLwGfQ");
    	est("Playa de Estacionamiento", "Calle Jerusalén 512, Yanahuara, Cercado De Arequipa 04017", 35, "Lunes a viernes 8:00 - 22:30", false, "https://g.co/kgs/9NW1bw5");
    	est("Playa de Estacionamiento Peral", "C. Peral 205, Arequipa 04001", 60, "Lunes a sábado 9:30 - 21:00", false, "https://g.co/kgs/GT9pdRn");
    	est("Playa Nicolás de Piérola", "C. Piérola 117, Arequipa 04001", 55, "Lunes a sábado - 24 horas", false, "https://g.co/kgs/g8mA1GR");
    	est("Playa", "Av.Emmel 216, Yanahuara, Cercado De Arequipa 04013", 25, "Lunes a sábado 8:00 - 20:00", true, "https://g.co/kgs/qRsNUHy");
    	est("Playa Central", "C. Rivero 232, Arequipa 04001", 35, "Lunes a domingo - 24 horas", true, "https://g.co/kgs/HjCHG2o");
    	est("Playa", "JF36+8GP, Villalba, Cercado de Arequipa 04001", 25, "Lunes a viernes - 24 horas", false, "https://g.co/kgs/Zm2Wzao");
    	est("Playa", "Castilla 126, Arequipa 04001", 60, "Lunes a sábado 10:00 - 22:00", true, "https://g.co/kgs/U5hANZa");
    	est("Playa de Estacionamiento LA MERCED Parqueo vehicular", "Calle, Octavio Muñoz Najar 137, Cercado De Arequipa 04001", 50, "Lunes a sábado 8:00 - 20:30", true, "https://g.co/kgs/GT3TJ6i");
    	est("Playa Pública", "Calle Nueva 223, Cercado De Arequipa 04001", 35, "Lunes a viernes 10:00 - 20:00", false, "https://g.co/kgs/ZdQd69q");
    	est("Playa de Estacionamiento ALEMERCED", "HFW6+22H, C. la Merced, Arequipa 04001", 30, "Lunes a domingo - 24 horas", true, "https://g.co/kgs/kPB2UAg");
    	est("Playa", "C. Jerusalén 521, Cercado De Arequipa 04001", 50, "Lunes a domingo 8:00 - 18:00", true, "https://g.co/kgs/htq7d84");
    	est("Playa", "Calle Nueva 415, Arequipa 04001", 35, "Lunes a domingo 8:00 - 21:00", false, "https://g.co/kgs/2ad2diR");
    	est("Playa de Estacionamiento San Nicolás", "C. Piérola 318a, Arequipa 04001", 30, "Lunes a sábado 10:00 - 23:00", false, "https://g.co/kgs/axTfsfV");
    	
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
    
    //TIPOS DE VEHICULO -------------------------------------------
    public void insertarTipoVehiculo() {
    	T_Vehiculo("Motocicleta");
    	T_Vehiculo("Automovil");
    }
    
    //TARIFAS
    public void insertarTarifas() {
    	tarifas( "6:00 a.m. - 6:00 p.m.", 5.00);
    }
    
    //PROVEEDORES
    public void insertarProveedores() {
    	proveedores("Carlos", "Calle Mercaderes 120", "956874124", "carlos8@gmail.com");
    	proveedores("María", "Av. Dolores 502", "956874125", "maria9@gmail.com");
    	proveedores("Ana", "Calle San Francisco 219", "956874126", "ana10@gmail.com");
    	proveedores("Luis", "Av. La Marina 301", "956874127", "luis11@gmail.com");
    	proveedores("Jorge", "Calle Jerusalén 410", "956874128", "jorge12@gmail.com");
    	proveedores("Lucía", "Av. Independencia 212", "956874129", "lucia13@gmail.com");
    	proveedores("Pedro", "Calle Santa Catalina 105", "956874130", "pedro14@gmail.com");
    	proveedores("Sofía", "Av. Venezuela 999", "956874131", "sofia15@gmail.com");
    	proveedores("Juan", "Calle San José 312", "956874132", "juan16@gmail.com");
    	proveedores("Andrea", "Av. Parra 123", "956874133", "andrea17@gmail.com");
    	proveedores("Miguel", "Calle Dean Valdivia 456", "956874134", "miguel18@gmail.com");
    	proveedores("Diana", "Av. Goyeneche 789", "956874135", "diana19@gmail.com");
    	proveedores("Fernando", "Calle Consuelo 321", "956874136", "fernando20@gmail.com");
    	proveedores("Rodrigo", "Av. Ejército 101", "956874123", "rodrigo7@gmail.com");
    	proveedores("Laura", "Av. Progreso 654", "956874137", "laura21@gmail.com");
    	proveedores("David", "Calle Zela 987", "956874138", "david22@gmail.com");
    	proveedores("Claudia", "Av. Juan de la Torre 147", "956874139", "claudia23@gmail.com");
    	proveedores("Raúl", "Calle Peral 258", "956874140", "raul24@gmail.com");
    	proveedores("Patricia", "Av. San Juan de Dios 369", "956874141", "patricia25@gmail.com");
    	proveedores("Francisco", "Calle Cruz Verde 741", "956874142", "francisco26@gmail.com");
    	proveedores("Elena", "Av. Salaverry 852", "956874143", "elena27@gmail.com");
    	proveedores("Antonio", "Calle Paucarpata 963", "956874144", "antonio28@gmail.com");
    	proveedores("Gabriela", "Av. Ejército 159", "956874145", "gabriela29@gmail.com");
    	proveedores("Hugo", "Calle Rivero 753", "956874146", "hugo30@gmail.com");
    	proveedores("Julio", "Calle Beaterio 951", "956874148", "julio32@gmail.com");
    }
    
    //EQUIPOS_ESTACIONAMIENTO
    public void insertarEquipos_Estacionamiento(Proveedor p) {
    	equi_est("tipos equipo", "marca", "modelo", p);
    }
    
    //VEHICULO
    public void insertarVehiculos(Usuario u, Tipo_Vehiculo t_Vehi) {
    	vehiculo("marca", "modelo", "color", "fabricante", u, t_Vehi);
    }
    
    
    
    
    
    
    
    
    //METODOS DE INSERCION DE DATOS
    
    //ESTACIONAMIENTO
    public Estacionamiento est(String nom, String dir, Integer qEsp, String hor, boolean est, String enlace) {
		Estacionamiento e=new Estacionamiento(nom,dir,qEsp,hor,est,enlace);
		escribir("Objeto creado");
		estS.saveOrUpdate(e);
		System.out.println("Insercion Exitosa");
		return e;
	}
    
    //USUARIO
    public Usuario usu(String nom, String ape, String email,String pass) {
		Usuario e=new Usuario(nom,ape,email,pass);
		escribir("Objeto creado");
		usS.saveOrUpdate(e);
		System.out.println("Insercion Exitosa");
		return e;
	}
    
    //TIPO DE VEHICULO
    public Tipo_Vehiculo T_Vehiculo(String des) {
    	Tipo_Vehiculo e=new Tipo_Vehiculo(des);
		escribir("Objeto creado");
    	t_Vehi.saveOrUpdate(e);
		System.out.println("Insercion Exitosa");
		return e;
	}
           
    //TARIFAS
    public void tarifas(String franja_Horario, Double valor_Hora) {
    	Tarifas e=new Tarifas(franja_Horario,valor_Hora);
		escribir("Objeto creado");
		tarifas_S.saveOrUpdate(e);
		escribir("Objeto creado");
    }
   
    
    //PROVEEDORES
    public Proveedor proveedores(String nombre,String dir, String telefono,String correo) {
    	Proveedor e=new Proveedor(nombre,dir,telefono,correo);
    	escribir("Objeto creado");
    	//AQUI LLAMO AL METODO DIRECTAMENTE PARA QUE ADICIONEN LOS DATOS
    	insertarEquipos_Estacionamiento(e);
		proveedores_S.saveOrUpdate(e);
		escribir("Objeto creado");
		return e;
    }
    
    //EQUIPOS_ESTACIONAMIENTO
    public void equi_est(String tip_equip,String marca, String modelo,Proveedor prov) {
    	Equipos_Estacionamiento e=new Equipos_Estacionamiento(tip_equip,marca,modelo,prov);
    	escribir("Objeto creado");
		eq_est_S.saveOrUpdate(e);
		escribir("Objeto creado");
    }
    
    //RESERVACIONES
    public void reserv(String tip_equip,String marca, String modelo,Proveedor prov) {
    	Equipos_Estacionamiento e=new Equipos_Estacionamiento(tip_equip,marca,modelo,prov);
    	escribir("Objeto creado");
		eq_est_S.saveOrUpdate(e);
		escribir("Objeto creado");
    }
    
    
    //VEHICULO
    public void vehiculo(String placa, String modelo, String color, String fabricante, Usuario usuario,
			Tipo_Vehiculo tipo_vehiculo) {
    	Vehiculo e=new Vehiculo(placa,modelo,color,fabricante,usuario,tipo_vehiculo);
    	escribir("Objeto creado");
		vehi_S.saveOrUpdate(e);
		escribir("Objeto creado");
    }
    
     
    //ESCRITURA EN CONSOLA
    public void escribir(String t) {
    	System.out.println(t);
    }

}
