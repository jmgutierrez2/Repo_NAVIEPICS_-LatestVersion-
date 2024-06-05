package com.naviepics.model.MySQL;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Usuario")
public class Usuario {
	
	@Id
	@SequenceGenerator(name="secuencia_101", sequenceName="secuencia_101", initialValue=101, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "secuencia_101")	@Column(name="Id_Usuario")
    private long id;
	
	@Column(name="Nombre", nullable=false)
	private String nombre;
	
	@Column(name="Apellido", nullable=false)
	private String apellido;
	
	@PrePersist
    public void prePersist() {
        fecha_creacion = new Date();
    }
    @Column(name = "Fecha_Creacion",  nullable=false)
    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_creacion;
	
	@Column(name="Email", nullable=false)
	private String email;
	
	@Column(name="Password", nullable=false)
	private String password;
    
    @OneToMany(mappedBy="usuario")
	private List<Reservaciones> listaReservaciones;

    @OneToMany(mappedBy="usuario")
	private List<Vehiculo> listaVehiculo;
    
    public Usuario() {
    	
    }

	public Usuario(long id, String nombre, String apellido, String email, String password
			) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
	}
	
	public Usuario(String nombre, String apellido, String email, String password
			) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public List<Reservaciones> getListaReservaciones() {
		return listaReservaciones;
	}

	public void setListaReservaciones(List<Reservaciones> listaReservaciones) {
		this.listaReservaciones = listaReservaciones;
	}

	public List<Vehiculo> getListaVehiculo() {
		return listaVehiculo;
	}

	public void setListaVehiculo(List<Vehiculo> listaVehiculo) {
		this.listaVehiculo = listaVehiculo;
	}
    
    

}
