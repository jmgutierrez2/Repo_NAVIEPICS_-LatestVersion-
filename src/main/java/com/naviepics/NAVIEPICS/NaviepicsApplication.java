package com.naviepics.NAVIEPICS;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.naviepics.model.MySQL.Estacionamiento;
import com.naviepics.model.MySQL.Feedback;
import com.naviepics.model.MySQL.Reporte_Incidencias;
import com.naviepics.model.MySQL.Reservaciones;
import com.naviepics.model.MySQL.Tarifas;
import com.naviepics.model.MySQL.Tipo_Vehiculo;
import com.naviepics.model.MySQL.Usuario;
import com.naviepics.model.MySQL.Vehiculo;
import com.naviepics.model.Oracle.Equipos_Estacionamiento;
import com.naviepics.model.Oracle.Proveedor;
import com.naviepics.service.Equipos_Estacionamiento_Service;
import com.naviepics.service.Estacionamiento_Service;
import com.naviepics.service.Feedback_Service;
import com.naviepics.service.Proveedor_Service;
import com.naviepics.service.Reporte_Incidencias_Service;
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
	@Autowired
	private Feedback_Service feed_S;
	@Autowired
	private Reporte_Incidencias_Service reportS;

	
	
    public void run(String... args) throws Exception {
    	//-------------------------------------INSERTANDO USUARIOS-------------------------------------------------
    	Usuario usuario1 = usu("Mario", "Villanueva", "mario_villanueva@gmail.com","mariovillanueva");
    	Usuario usuario2 = usu("Oscar", "Pineda", "oscar_pineda@gmail.com","oscarpineda");
    	Usuario usuario3 = usu("Rodrigo", "Barrios", "rodrigo_barrios@gmail.com","rodrigobarrios");
    	Usuario usuario4 = usu("Laura", "Martínez", "laura_martinez@gmail.com", "lauramartinez");
    	Usuario usuario5 = usu("Carlos", "López", "carlos_lopez@gmail.com", "carloslopez");
    	Usuario usuario6 = usu("Ana", "García", "ana_garcia@gmail.com", "anagarcia");
    	Usuario usuario7 = usu("José", "Pérez", "jose_perez@gmail.com", "joseperez");
    	Usuario usuario8 = usu("María", "Rodríguez", "maria_rodriguez@gmail.com", "mariarodriguez");
    	Usuario usuario9 = usu("Gustavo", "Fernández", "gustavo_fernandez@gmail.com", "gustavofernandez");
    	Usuario usuario10 = usu("Elena", "Gómez", "elena_gomez@gmail.com", "elenagomez");
    	Usuario usuario11 = usu("Jorge", "Díaz", "jorge_diaz@gmail.com", "jorgediaz");
    	Usuario usuario12 = usu("Sofía", "Morales", "sofia_morales@gmail.com", "sofiamorales");
    	Usuario usuario13 = usu("Pablo", "Hernández", "pablo_hernandez@gmail.com", "pablohernandez");
    	Usuario usuario14 = usu("Marta", "Ruiz", "marta_ruiz@gmail.com", "martaruiz");
    	Usuario usuario15 = usu("Fernando", "Jiménez", "fernando_jimenez@gmail.com", "fernandojimenez");
    	Usuario usuario16 = usu("Isabel", "Sánchez", "isabel_sanchez@gmail.com", "isabelsanchez");
    	Usuario usuario17 = usu("Ricardo", "Torres", "ricardo_torres@gmail.com", "ricardotorres");
    	Usuario usuario18 = usu("Patricia", "Ramírez", "patricia_ramirez@gmail.com", "patriciaramirez");
    	Usuario usuario19 = usu("Andrés", "Flores", "andres_flores@gmail.com", "andresflores");
    	Usuario usuario20 = usu("Hugo", "Castillo", "hugo_castillo@gmail.com", "hugocastillo");
    	System.out.println("USUARIOS INSERTADOS");
    	//------------------------------------------INSERTANDO ESTACIONAMIENTOS------------------------------------------------------------------------------------------------
    	 Estacionamiento est1 = est("Playa de estacionamiento", "Paucarpata 128, Arequipa 04001", 50, "Lunes a viernes - 24 horas", false, "https://g.co/kgs/pY3YzPR");
  	   Estacionamiento est2 = est("Playa de Estacionamiento", "Paucarpata 140, Arequipa 04001", 30, "Lunes a sábado 7:00 - 22:00", false, "https://g.co/kgs/ox4kCex");
  	   Estacionamiento est3 = est("Playa de Estacionamiento", "Tronchadero 209, Arequipa 04001", 45, "Lunes a viernes 6:00 - 20:00", true, "https://g.co/kgs/aj5KYPm");
  	   Estacionamiento est4 = est("Playa de Estacionamiento", "C. San José 131, Arequipa 04001", 40, "Lunes a domingo 9:00 - 20:00", false, "https://g.co/kgs/KQogAtj");
  	   Estacionamiento est5 = est("Playa de Estacionamiento", "C. Rivero 312, Arequipa 04001", 50, "Lunes a sábado 10:00 - 22:30", true, "https://g.co/kgs/vvLwKYB");
  	   Estacionamiento est6 = est("Playa de Estacionamiento", "C. Palacio Viejo 416, Arequipa 04001", 55, "Lunes a domingo 7:00 - 19:00", true, "https://g.co/kgs/ZyBE1Ag");
  	   Estacionamiento est7 = est("Playa de Estacionamiento", "C. Rivero 200, Cercado De Arequipa 04001", 60, "Lunes a sábado 10:00 - 23:00", false, "https://g.co/kgs/FmwAuAC");
  	   Estacionamiento est8 = est("Playa de Estacionamiento", "Calle Nueva 519, Cercado de Arequipa 04001", 60, "Lunes a viernes - 24 horas", true, "https://g.co/kgs/Dwhm6Lf");
  	   Estacionamiento est9 = est("Playa de Estacionamiento", "04001, Arequipa 04001", 100, "Lunes a sábado 9:00 - 21:00", true, "https://g.co/kgs/GC4mFop");
  	   Estacionamiento est10 = est("Playa de Estacionamiento", "Av. Siglo XX 218, Arequipa 04001", 25, "Lunes a sábado 7:00 - 20:00", false, "https://g.co/kgs/Xs524Qr");
  	   Estacionamiento est11 = est("Playa de Estacionamiento Perú", "C. Perú 520a, Arequipa 04001", 30, "Lunes a sábado 7:00 - 22:00", false, "https://g.co/kgs/u78WKTk");
  	   Estacionamiento est12 = est("Playa de Estacionamiento", "Calle Nueva 327- A, Cercado De Arequipa 04001", 45, "Lunes a viernes 8:00 - 20:00", false, "https://g.co/kgs/JHkyz2w");
  	   Estacionamiento est13 = est("Playa de Estacionamiento", "28 de Julio 106, Arequipa 04001", 40, "Lunes a sábado 8:00 - 18:00", true, "https://g.co/kgs/k4oXBjk");
  	   Estacionamiento est14 = est("Playa de Estacionamiento", "C. Álvarez Thomas 462, Cercado De Arequipa 04001", 30, "Lunes a sábado 9:30 - 19:00", false, "https://g.co/kgs/tS9zn1i");
  	   Estacionamiento est15 = est("Playa de Estacionamiento El Sol", "C. Álvarez Thomas 466, Arequipa 04001", 35, "Lunes a domingo - 24 horas", true, "https://g.co/kgs/Nhq5tWi");
  	   Estacionamiento est16 = est("Playa de Estacionamiento", "Pizarro 210, Arequipa 04001", 40,  "Lunes a sábado 10:00 - 22:00", true, "https://g.co/kgs/Q6jmf5Z");
  	   Estacionamiento est17 = est("Playa de Estacionamiento Moral", "C. Moral 403, Arequipa 04001", 45, "Lunes a sábado 7:00 - 21:00", false, "https://g.co/kgs/DNURCP7");
  	   Estacionamiento est18 = est("Playa de Estacionamiento", "C. Palacio Viejo 511, Arequipa 04001", 30, "Lunes a viernes 10:00 - 22:00", false, "https://g.co/kgs/gTxVC3c");
  	   Estacionamiento est19 = est("Playa", "Ricardo Palma 203, Cercado De Arequipa 04013", 55, "Lunes a domingo 6:00 - 23:00", true, "https://g.co/kgs/iptR92e");
  	   Estacionamiento est20 = est("Playa de Estacionamiento", "C. la Merced 509, Arequipa 04001", 50, "Lunes a domingo - 24 horas", false, "https://g.co/kgs/Vj1gQ9y");
  	   Estacionamiento est21 = est("Playa de Estacionamiento Moral / San Francisco", "C. Moral 205, Arequipa 04001", 55, "Lunes a sábado 7:00 - 22:00", false, "https://g.co/kgs/Xaw673M");
  	   Estacionamiento est22 = est("Playa", "C. Santo Domingo 215a, Arequipa 04001", 40, "Lunes a sábado 8:30 - 23:30", true, "https://g.co/kgs/xvzodA3");
  	   Estacionamiento est23 = est("Playa de Estacionamiento", "C. Peral 315, Cercado De Arequipa 04001", 30, "Lunes a domingo 9:30 - 19:30", false, "https://g.co/kgs/BfEsXZC");
  	   Estacionamiento est24 = est("Playa", "Calle, República de Chile 103, Cercado De Arequipa 04001", 35, "Lunes a sábado 7:00 - 22:00", false, "https://g.co/kgs/WBE289a");
  	   Estacionamiento est25 = est("Playa", "Mz, Los Angeles 11, Cercado De Arequipa 04013", 40, "Lunes a sábado 8:00 - 22:00", true, "https://g.co/kgs/uk5acxP");
  	   Estacionamiento est26 = est("Playa", "C. San José 309, Arequipa 04001", 50, "Lunes a viernes 7:00 - 20:00", false, "https://g.co/kgs/StrL5B5");
  	   Estacionamiento est27 = est("Playa de Estacionamiento", "Cuarto Piso, Pje. Sta. Rosa 104, Arequipa 04000", 35, "Lunes a sábado - 24 horas", false, "https://g.co/kgs/1CJ9xNr");
  	   Estacionamiento est28 = est("Playa Paucarpata", "Paucarpata 333, Arequipa 04001", 60, "Lunes a domingo - 24 horas", true, "https://g.co/kgs/jMfTnqC");
  	   Estacionamiento est29 = est("Playa Club Arequipa Cochera Aparcamiento", "C. Álvarez Thomas 111, Arequipa 04001", 40, "Lunes a domingo 7:00 - 22:00", false, "https://g.co/kgs/is6H4x4");
  	   Estacionamiento est30 = est("Playa de Estacionamiento", "Ca. Consuelo 417, Arequipa 04001", 40, "Lunes a domingo 7:00 - 23:00", true, "https://g.co/kgs/f6ZYQPk");
  	   Estacionamiento est31 = est("Playa", "C. el Palomar 109, Cercado Arequipa 04002", 30, "Lunes a sábado 9:00 - 21:00", true, "https://g.co/kgs/EtLwGfQ");
  	   Estacionamiento est32 = est("Playa de Estacionamiento", "Calle Jerusalén 512, Yanahuara, Cercado De Arequipa 04017", 35, "Lunes a viernes 8:00 - 22:30", false, "https://g.co/kgs/9NW1bw5");
  	   Estacionamiento est33 = est("Playa de Estacionamiento Peral", "C. Peral 205, Arequipa 04001", 60, "Lunes a sábado 9:30 - 21:00", false, "https://g.co/kgs/GT9pdRn");
  	   Estacionamiento est34 = est("Playa Nicolás de Piérola", "C. Piérola 117, Arequipa 04001", 55, "Lunes a sábado - 24 horas", false, "https://g.co/kgs/g8mA1GR");
  	   Estacionamiento est35 = est("Playa", "Av.Emmel 216, Yanahuara, Cercado De Arequipa 04013", 25, "Lunes a sábado 8:00 - 20:00", true, "https://g.co/kgs/qRsNUHy");
  	   Estacionamiento est36 = est("Playa Central", "C. Rivero 232, Arequipa 04001", 35, "Lunes a domingo - 24 horas", true, "https://g.co/kgs/HjCHG2o");
  	   Estacionamiento est37 = est("Playa", "JF36+8GP, Villalba, Cercado de Arequipa 04001", 25, "Lunes a viernes - 24 horas", false, "https://g.co/kgs/Zm2Wzao");
  	   Estacionamiento est38 = est("Playa", "Castilla 126, Arequipa 04001", 60, "Lunes a sábado 10:00 - 22:00", true, "https://g.co/kgs/U5hANZa");
  	   Estacionamiento est39 = est("Playa de Estacionamiento LA MERCED Parqueo vehicular", "Calle, Octavio Muñoz Najar 137, Cercado De Arequipa 04001", 50, "Lunes a sábado 8:00 - 20:30", true, "https://g.co/kgs/GT3TJ6i");
  	   Estacionamiento est40 = est("Playa Pública", "Calle Nueva 223, Cercado De Arequipa 04001", 35, "Lunes a viernes 10:00 - 20:00", false, "https://g.co/kgs/ZdQd69q");
  	   Estacionamiento est41 = est("Playa de Estacionamiento ALEMERCED", "HFW6+22H, C. la Merced, Arequipa 04001", 30, "Lunes a domingo - 24 horas", true, "https://g.co/kgs/kPB2UAg");
  	   Estacionamiento est42 = est("Playa", "C. Jerusalén 521, Cercado De Arequipa 04001", 50, "Lunes a domingo 8:00 - 18:00", true, "https://g.co/kgs/htq7d84");
  	   Estacionamiento est43 = est("Playa", "Calle Nueva 415, Arequipa 04001", 35, "Lunes a domingo 8:00 - 21:00", false, "https://g.co/kgs/2ad2diR");
  	   Estacionamiento est44 = est("Playa de Estacionamiento San Nicolás", "C. Piérola 318a, Arequipa 04001", 30, "Lunes a sábado 10:00 - 23:00", false, "https://g.co/kgs/axTfsfV");
  	   System.out.println("ESTACIONAMIENTOS INSERTADOS");
    	//---------------------------------INSERTANDO TIPO VEHICULO ----------------------------------------------
	  	Tipo_Vehiculo t1 = T_Vehiculo("Motocicleta");
	 	Tipo_Vehiculo t2 =T_Vehiculo("Automovil");
	 	System.out.println("TIPOS DE VEHICULOS INSERTADOS");
	 	//-----------------------------------------INSERTANDO TARIFAS-----------------------------------------------------------
	 	tarifas( "6:00 a.m. - 6:00 p.m.", 5.00);
		tarifas( "6:00 a.m. - 8:00 p.m.", 4.00);
		tarifas( "7:00 a.m. - 8:00 p.m.", 4.50);
		tarifas( "8:00 a.m. - 6:00 p.m.", 6.00);
		tarifas( "6:00 a.m. - 5:59 a.m.", 10.00);
	 	System.out.println("TARIFAS INSERTADAS");
	 	//-----------------------------------------------INSERTANDO PROVEEDORES------------------------------
	 	Proveedor carlos = proveedores("Carlos", "Calle Mercaderes 120", "956874124", "carlos8@gmail.com");
    	Proveedor maria = proveedores("María", "Av. Dolores 502", "956874125", "maria9@gmail.com");
    	Proveedor luis = proveedores("Luis", "Av. La Marina 301", "956874127", "luis11@gmail.com");
    	Proveedor jorge = proveedores("Jorge", "Calle Jerusalén 410", "956874128", "jorge12@gmail.com");
    	Proveedor lucia = proveedores("Lucía", "Av. Independencia 212", "956874129", "lucia13@gmail.com");
    	Proveedor pedro = proveedores("Pedro", "Calle Santa Catalina 105", "956874130", "pedro14@gmail.com");
    	Proveedor sofia = proveedores("Sofía", "Av. Venezuela 999", "956874131", "sofia15@gmail.com");
    	Proveedor juan = proveedores("Juan", "Calle San José 312", "956874132", "juan16@gmail.com");
    	Proveedor andrea = proveedores("Andrea", "Av. Parra 123", "956874133", "andrea17@gmail.com");
    	Proveedor miguel = proveedores("Miguel", "Calle Dean Valdivia 456", "956874134", "miguel18@gmail.com");
    	Proveedor diana = proveedores("Diana", "Av. Goyeneche 789", "956874135", "diana19@gmail.com");
    	Proveedor fernando = proveedores("Fernando", "Calle Consuelo 321", "956874136", "fernando20@gmail.com");
    	Proveedor rodrigo = proveedores("Rodrigo", "Av. Ejército 101", "956874123", "rodrigo7@gmail.com");
    	Proveedor laura = proveedores("Laura", "Av. Progreso 654", "956874137", "laura21@gmail.com");
    	Proveedor david = proveedores("David", "Calle Zela 987", "956874138", "david22@gmail.com");
    	Proveedor claudia = proveedores("Claudia", "Av. Juan de la Torre 147", "956874139", "claudia23@gmail.com");
    	Proveedor raul = proveedores("Raúl", "Calle Peral 258", "956874140", "raul24@gmail.com");
    	Proveedor patricia = proveedores("Patricia", "Av. San Juan de Dios 369", "956874141", "patricia25@gmail.com");
    	Proveedor francisco = proveedores("Francisco", "Calle Cruz Verde 741", "956874142", "francisco26@gmail.com");
    	Proveedor elena = proveedores("Elena", "Av. Salaverry 852", "956874143", "elena27@gmail.com");
    	Proveedor antonio = proveedores("Antonio", "Calle Paucarpata 963", "956874144", "antonio28@gmail.com");
    	Proveedor gabriela = proveedores("Gabriela", "Av. Ejército 159", "956874145", "gabriela29@gmail.com");
    	Proveedor hugo = proveedores("Hugo", "Calle Rivero 753", "956874146", "hugo30@gmail.com");
    	Proveedor julio = proveedores("Julio", "Calle Beaterio 951", "956874148", "julio32@gmail.com");
	 	System.out.println("PROVEEDORES INSERTADOS");
    	
    	//-----------------------------INSERTANDO EQUIPOS DE ESTACIONAMIENTO----------------------------------
    	equi_est("Sensores de Ocupación de Plazas", "Nedap", "SENSIT", carlos);
    	equi_est("Plumas Automáticas", "Nice", "M-Bar", maria);
    	equi_est("Sistemas de Videovigilancia", "Hikvision", "DS-2CD2387G2-LU", luis);
    	equi_est("Sistemas de Reconocimiento de Matrículas (LPR)", "Tattile", "Vega Basic", jorge);
    	equi_est("Terminales de Entrada/Salida", "Designa", "PM ABACUS", lucia);
    	equi_est("Sistemas de Pago Móvil", "ParkMobile", "App v9.9", pedro);
    	equi_est("Parquímetros", " Cale", "CWT Compact", sofia);
    	equi_est("Estacionamientos Automatizados", "Wohr", "Multiparker 730", juan);
    	equi_est("Sistemas de Protección contra Colisiones", "A-Safe", "iFlex", andrea);
    	equi_est("Bicicletarios Automáticos", "Bikeep", "B2", miguel);
    	equi_est("Cámaras de Monitoreo de Espacios", "Axis Communications", "P1445-LE", diana);
    	equi_est("Lectoras de Tarjetas RFID", "HID Global", "iCLASS SE", fernando);
    	equi_est("Señalización Digital", "Daktronics", "modelo", rodrigo);
    	equi_est("Estaciones de Carga para Vehículos Eléctricos", "ChargePoint", "CT4000", laura);
    	equi_est("Sistemas de Validación de Tickets", "Amano McGann", "OPUSeries", david);
    	equi_est("Automatización de Barreras de Estacionamiento", "Magnetic Autocontrol", "Access Pro-H", claudia);
    	equi_est("Torniquetes de Acceso", "Gunnebo", "SpeedStile FP", raul);
    	equi_est("Software de Gestión de Estacionamientos", "TIBA Parking", "SmartPark", patricia);
    	equi_est("Detectores de Proximidad", "Indect", "ULD", francisco);
    	equi_est("Plataformas Elevadoras de Vehículos", "Klaus Multiparking", "TrendVario 4300", elena);
    	equi_est("Cámaras Termográficas", "FLIR Systems", "A400/A700", antonio);
    	equi_est("Sistemas de Bloqueo de Estacionamiento", "Parklio", "Smart Parking Barrier", gabriela);
    	equi_est("Paneles de Información LED", "Swarco", "FUTUR LED", hugo);
    	equi_est("Sistemas de Control de Humos y Ventilación", "Colt", "Cyclone", julio);
    	equi_est("Sistemas de Reservas de Estacionamiento", " SpotHero", "SpotHero App", gabriela);    
    	System.out.println("EQUIPOS INSERTADOS");
    	
    	//-----------------INSERTANDO VEHICULOS----------------------------------------
    	Vehiculo v1 =vehiculo("Toyota", "Corolla", "Blanco", "Toyota Motor Corporation", usuario14, t1);
    	Vehiculo v2 =vehiculo("Honda", "Civic", "Negro", "Honda Motor Co., Ltd.", usuario7, t2);
    	Vehiculo v3 =vehiculo("Ford", "Mustang", "Rojo", "Ford Motor Company", usuario18, t1);
    	Vehiculo v4 =vehiculo("Chevrolet", "Camaro", "Azul", "General Motors", usuario5, t2);
    	Vehiculo v5 =vehiculo("Tesla", "Model 3", "Gris", "Tesla, Inc.", usuario12, t1);
    	Vehiculo v6 =vehiculo("Nissan", "Altima", "Plata", "Nissan Motor Corporation", usuario3, t2);
    	Vehiculo v7 =vehiculo("BMW", "X5", "Negro", "Bayerische Motoren Werke AG", usuario9, t1);
    	Vehiculo v8 =vehiculo("Mercedes-Benz", "C-Class", "Blanco", "Daimler AG", usuario16, t2);
    	Vehiculo v9 =vehiculo("Audi", "A4", "Rojo", "Audi AG", usuario11, t1);
    	Vehiculo v10 =vehiculo("Volkswagen", "Jetta", "Azul", "Volkswagen AG", usuario4, t2);
    	Vehiculo v11 =vehiculo("Hyundai", "Elantra", "Gris", "Hyundai Motor Company", usuario8, t1);
    	Vehiculo v12 =vehiculo("Kia", "Optima", "Plata", "Kia Corporation", usuario15, t2);
    	Vehiculo v13 =vehiculo("Subaru", "Impreza", "Blanco", "Subaru Corporation", usuario2, t1);
    	Vehiculo v14 =vehiculo("Mazda", "Mazda3", "Negro", "Mazda Motor Corporation", usuario10, t2);
    	Vehiculo v15 =vehiculo("Lexus", "RX", "Rojo", "Toyota Motor Corporation", usuario6, t1);
    	Vehiculo v16 =vehiculo("Infiniti", "Q50", "Azul", "Nissan Motor Corporation", usuario13, t2);
    	Vehiculo v17 =vehiculo("Jaguar", "XE", "Gris", "Jaguar Land Rover", usuario1, t1);
    	Vehiculo v18 =vehiculo("Land Rover", "Range Rover", "Negro", "Jaguar Land Rover", usuario19, t2);
    	Vehiculo v19 =vehiculo("Volvo", "S60", "Blanco", "Volvo Cars", usuario17, t1);
    	Vehiculo v20 =vehiculo("Porsche", "911", "Rojo", "Porsche AG", usuario20, t2);
    	Vehiculo v21 =vehiculo("Ferrari", "488", "Rojo", "Ferrari N.V.", usuario3, t1);
    	Vehiculo v22 =vehiculo("Lamborghini", "Huracan", "Amarillo", "Automobili Lamborghini S.p.A.", usuario9, t2);
    	Vehiculo v23 =vehiculo("Maserati", "Ghibli", "Azul", "Maserati S.p.A.", usuario14, t1);
    	Vehiculo v24 =vehiculo("Aston Martin", "DB11", "Verde", "Aston Martin Lagonda Global Holdings plc", usuario7, t2);
    	Vehiculo v25 =vehiculo("Bentley", "Continental GT", "Negro", "Bentley Motors Limited", usuario18, t1);
    	Vehiculo v26 =vehiculo("Rolls-Royce", "Phantom", "Blanco", "Rolls-Royce Motor Cars Limited", usuario5, t2);
    	System.out.println("VEHICULOS INSERTADOS");
    	
    	//------------------INSERTANDO REPORTE DE INCIDENCIAS------------------------------------
    	Reporte_Incidencias reporte1 = report("Mal servicio del estacionamiento", java.sql.Date.valueOf("2024-06-07"), java.sql.Time.valueOf("14:30:00"), usuario1, est1);
    	Reporte_Incidencias reporte2 = report("Problema con la tarjeta de pago", java.sql.Date.valueOf("2024-06-08"), java.sql.Time.valueOf("10:45:00"), usuario2, est5);
    	Reporte_Incidencias reporte3 = report("Luz rota en el estacionamiento", java.sql.Date.valueOf("2024-06-09"), java.sql.Time.valueOf("16:15:00"), usuario3, est11);
    	Reporte_Incidencias reporte4 = report("Puerta del estacionamiento atascada", java.sql.Date.valueOf("2024-06-10"), java.sql.Time.valueOf("08:00:00"), usuario4, est7);
    	Reporte_Incidencias reporte5 = report("Falta de seguridad en el estacionamiento", java.sql.Date.valueOf("2024-06-11"), java.sql.Time.valueOf("12:30:00"), usuario5, est3);
    	Reporte_Incidencias reporte6 = report("Problema con la máquina de pago", java.sql.Date.valueOf("2024-06-12"), java.sql.Time.valueOf("14:45:00"), usuario6, est9);
    	Reporte_Incidencias reporte7 = report("Limpieza deficiente en el estacionamiento", java.sql.Date.valueOf("2024-06-13"), java.sql.Time.valueOf("10:15:00"), usuario7, est15);
    	Reporte_Incidencias reporte8 = report("Señalización inadecuada en el estacionamiento", java.sql.Date.valueOf("2024-06-14"), java.sql.Time.valueOf("16:00:00"), usuario8, est2);
    	Reporte_Incidencias reporte9 = report("Falta de espacio para estacionar", java.sql.Date.valueOf("2024-06-15"), java.sql.Time.valueOf("08:45:00"), usuario9, est18);
    	Reporte_Incidencias reporte10 = report("Problema con la iluminación en el estacionamiento", java.sql.Date.valueOf("2024-06-16"), java.sql.Time.valueOf("12:00:00"), usuario10, est6);
    	Reporte_Incidencias reporte11 = report("Mal servicio del personal", java.sql.Date.valueOf("2024-06-17"), java.sql.Time.valueOf("14:15:00"), usuario11, est14);
    	Reporte_Incidencias reporte12 = report("Problema con la tarjeta de membresía", java.sql.Date.valueOf("2024-06-18"), java.sql.Time.valueOf("10:30:00"), usuario12, est10);
    	Reporte_Incidencias reporte13 = report("Falta de mantenimiento en el estacionamiento", java.sql.Date.valueOf("2024-06-19"), java.sql.Time.valueOf("16:45:00"), usuario13, est4);
    	Reporte_Incidencias reporte14 = report("Problema con la señalización de salida", java.sql.Date.valueOf("2024-06-20"), java.sql.Time.valueOf("08:15:00"), usuario14, est17);
    	Reporte_Incidencias reporte15 = report("Limpieza deficiente en los baños", java.sql.Date.valueOf("2024-06-21"), java.sql.Time.valueOf("12:45:00"), usuario15, est8);
    	Reporte_Incidencias reporte16 = report("Problema con la máquina de cambio", java.sql.Date.valueOf("2024-06-22"), java.sql.Time.valueOf("14:00:00"), usuario16, est13);
    	Reporte_Incidencias reporte17 = report("Falta de seguridad en la noche", java.sql.Date.valueOf("2024-06-23"), java.sql.Time.valueOf("10:00:00"), usuario17, est19);
    	Reporte_Incidencias reporte18 = report("Problema con la iluminación en la noche", java.sql.Date.valueOf("2024-06-24"), java.sql.Time.valueOf("16:30:00"), usuario18, est12);
    	Reporte_Incidencias reporte19 = report("Mal servicio del estacionamiento", java.sql.Date.valueOf("2024-06-25"), java.sql.Time.valueOf("08:30:00"), usuario19, est16);
    	System.out.println("REPORTES INSERTADOS");
    	
    	
    	//INSERTANDO RESERVACIONES
    	Reservaciones res1 = reserv(java.sql.Date.valueOf("2024-10-06"), java.sql.Time.valueOf("14:35:00"), est13, usuario7);
    	Reservaciones res2 = reserv(java.sql.Date.valueOf("2024-07-18"), java.sql.Time.valueOf("09:25:00"), est28, usuario12);
    	Reservaciones res3 = reserv(java.sql.Date.valueOf("2024-08-23"), java.sql.Time.valueOf("17:45:00"), est4, usuario18);
    	Reservaciones res4 = reserv(java.sql.Date.valueOf("2024-09-01"), java.sql.Time.valueOf("12:30:00"), est21, usuario5);
    	Reservaciones res5 = reserv(java.sql.Date.valueOf("2024-10-14"), java.sql.Time.valueOf("08:50:00"), est39, usuario10);
    	Reservaciones res6 = reserv(java.sql.Date.valueOf("2024-11-07"), java.sql.Time.valueOf("13:40:00"), est16, usuario3);
    	Reservaciones res7 = reserv(java.sql.Date.valueOf("2024-12-20"), java.sql.Time.valueOf("18:10:00"), est25, usuario14);
    	Reservaciones res8 = reserv(java.sql.Date.valueOf("2024-12-31"), java.sql.Time.valueOf("11:55:00"), est11, usuario9);
    	Reservaciones res9 = reserv(java.sql.Date.valueOf("2024-01-15"), java.sql.Time.valueOf("15:20:00"), est32, usuario2);
    	Reservaciones res10 = reserv(java.sql.Date.valueOf("2024-02-28"), java.sql.Time.valueOf("10:45:00"), est43, usuario15);
    	Reservaciones res11 = reserv(java.sql.Date.valueOf("2024-03-14"), java.sql.Time.valueOf("14:10:00"), est19, usuario6);
    	Reservaciones res12 = reserv(java.sql.Date.valueOf("2024-04-22"), java.sql.Time.valueOf("07:30:00"), est38, usuario11);
    	Reservaciones res13 = reserv(java.sql.Date.valueOf("2024-05-03"), java.sql.Time.valueOf("16:40:00"), est24, usuario8);
    	Reservaciones res14 = reserv(java.sql.Date.valueOf("2024-06-05"), java.sql.Time.valueOf("09:10:00"), est42, usuario4);
    	Reservaciones res15 = reserv(java.sql.Date.valueOf("2024-06-30"), java.sql.Time.valueOf("13:50:00"), est17, usuario13);
    	Reservaciones res16 = reserv(java.sql.Date.valueOf("2024-07-25"), java.sql.Time.valueOf("10:20:00"), est31, usuario16);
    	Reservaciones res17 = reserv(java.sql.Date.valueOf("2024-08-09"), java.sql.Time.valueOf("11:45:00"), est22, usuario1);
    	Reservaciones res18 = reserv(java.sql.Date.valueOf("2024-09-18"), java.sql.Time.valueOf("17:30:00"), est35, usuario19);
    	Reservaciones res19 = reserv(java.sql.Date.valueOf("2024-10-02"), java.sql.Time.valueOf("08:25:00"), est26, usuario7);
    	Reservaciones res20 = reserv(java.sql.Date.valueOf("2024-11-10"), java.sql.Time.valueOf("12:15:00"), est40, usuario12);
    	Reservaciones res21 = reserv(java.sql.Date.valueOf("2024-12-01"), java.sql.Time.valueOf("19:00:00"), est15, usuario18);
    	Reservaciones res22 = reserv(java.sql.Date.valueOf("2024-01-05"), java.sql.Time.valueOf("14:45:00"), est29, usuario5);
    	Reservaciones res23 = reserv(java.sql.Date.valueOf("2024-02-19"), java.sql.Time.valueOf("09:35:00"), est33, usuario10);
    	Reservaciones res24 = reserv(java.sql.Date.valueOf("2024-03-28"), java.sql.Time.valueOf("16:00:00"), est20, usuario3);
    	Reservaciones res25 = reserv(java.sql.Date.valueOf("2024-04-15"), java.sql.Time.valueOf("07:55:00"), est36, usuario14);
    	Reservaciones res26 = reserv(java.sql.Date.valueOf("2024-05-30"), java.sql.Time.valueOf("11:30:00"), est27, usuario9);
    	System.out.println("RESERVACIONES INSERTADAS");
    	
    	//INSERTANDO FEEDBACK
    	Feedback fb1 = feed(3, "Buen servicio.", usuario14, est27);
    	Feedback fb2 = feed(5, "Excelente experiencia.", usuario7, est31);
    	Feedback fb3 = feed(2, "Podría mejorar la limpieza.", usuario18, est13);
    	Feedback fb4 = feed(4, "Muy conveniente.", usuario5, est42);
    	Feedback fb5 = feed(1, "Mal servicio, no lo recomiendo.", usuario12, est25);
    	Feedback fb6 = feed(3, "Precio razonable.", usuario9, est38);
    	Feedback fb7 = feed(4, "Personal amable y atento.", usuario3, est16);
    	Feedback fb8 = feed(2, "Difícil de encontrar estacionamiento libre.", usuario15, est29);
    	Feedback fb9 = feed(5, "Volveré seguro.", usuario2, est40);
    	Feedback fb10 = feed(1, "Mala señalización.", usuario11, est22);
    	Feedback fb11 = feed(3, "Espacios amplios.", usuario8, est35);
    	Feedback fb12 = feed(2, "Precio demasiado alto.", usuario19, est26);
    	Feedback fb13 = feed(4, "Buena ubicación.", usuario6, est33);
    	Feedback fb14 = feed(5, "¡El mejor estacionamiento de la ciudad!", usuario10, est43);
    	Feedback fb15 = feed(3, "Fácil acceso.", usuario4, est20);
    	Feedback fb16 = feed(1, "Estacionamiento lleno, no pude encontrar lugar.", usuario17, est28);
    	Feedback fb17 = feed(4, "Limpio y bien iluminado.", usuario13, est32);
    	Feedback fb18 = feed(2, "Problemas con el sistema de pago.", usuario1, est24);
    	Feedback fb19 = feed(5, "Altamente recomendado.", usuario16, est39);
    	Feedback fb20 = feed(3, "Tarifas competitivas.", usuario9, est41);
    	Feedback fb21 = feed(1, "Servicio al cliente deficiente.", usuario5, est23);
    	Feedback fb22 = feed(2, "Mal olor en el estacionamiento.", usuario12, est30);
    	Feedback fb23 = feed(4, "Rápido y eficiente.", usuario7, est36);
    	Feedback fb24 = feed(5, "¡Increíblemente conveniente!", usuario3, est44);
    	Feedback fb25 = feed(3, "Buenas opciones de seguridad.", usuario14, est21);
    	System.out.println("FEEDBACK INSERTADOS");
    }
       
    public Reporte_Incidencias report(String descripcion, java.sql.Date fecha, Date hora, Usuario usuario,
			Estacionamiento estacionamiento) {
    	Reporte_Incidencias e=new Reporte_Incidencias(descripcion, fecha,hora, estacionamiento, usuario);
		escribir("Objeto creado");
		reportS.saveOrUpdate(e);
		System.out.println("Insercion Exitosa");
		return e;
	}

    
    //ESTACIONAMIENTO
    public Estacionamiento est(String nom, String dir, Integer qEsp, String hor, boolean est, String enlace) {
		Estacionamiento e=new Estacionamiento(nom,dir,qEsp,hor,est,enlace);
		escribir("Objeto creado");
		estS.saveOrUpdate(e);
		System.out.println("Insercion Exitosa");
		return e;
	}
    
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
		System.out.println("Insercion Exitosa");
    }
   
    //PROVEEDORES
    public Proveedor proveedores(String nombre,String dir, String telefono,String correo) {
    	Proveedor e=new Proveedor(nombre,dir,telefono,correo);
    	escribir("Objeto creado");
   		proveedores_S.saveOrUpdate(e);
		System.out.println("Insercion Exitosa");
		return e;
    }
    
    //EQUIPOS_ESTACIONAMIENTO
    public void equi_est(String tip_equip,String marca, String modelo,Proveedor prov) {
    	Equipos_Estacionamiento e=new Equipos_Estacionamiento(tip_equip,marca,modelo,prov);
    	escribir("Objeto creado");
		eq_est_S.saveOrUpdate(e);
		System.out.println("Insercion Exitosa");
    }
    
    //RESERVACIONES
    public Reservaciones reserv(Date fec_res, Date hor_res, Estacionamiento estac, Usuario usua) {
    	Reservaciones e=new Reservaciones(fec_res,hor_res,estac,usua);
    	escribir("Objeto creado");
		reserv_S.saveOrUpdate(e);
		System.out.println("Insercion Exitosa");
		return e;
    }
    
    
    //VEHICULO
    public Vehiculo vehiculo(String placa, String modelo, String color, String fabricante, Usuario usuario,
			Tipo_Vehiculo tipo_vehiculo) {
    	Vehiculo e=new Vehiculo(placa,modelo,color,fabricante,usuario,tipo_vehiculo);
    	escribir("Objeto creado");
		vehi_S.saveOrUpdate(e);
		System.out.println("Insercion Exitosa");
		return e;
    }
    
    
    //Feedback
    public Feedback feed(Integer calificacion, String comentario,Usuario usua, Estacionamiento estac) {
    	Feedback e=new Feedback(calificacion,comentario,usua,estac);
    	escribir("Objeto creado");
		feed_S.saveOrUpdate(e);
		System.out.println("Insercion Exitosa");
		return e;
    }
    
     
    //ESCRITURA EN CONSOLA
    public void escribir(String t) {
    	System.out.println(t);
    }

}
