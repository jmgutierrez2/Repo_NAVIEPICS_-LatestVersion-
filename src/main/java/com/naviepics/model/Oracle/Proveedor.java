package com.naviepics.model.Oracle;

import java.util.List;

import com.naviepics.model.MySQL.Historial_Sanciones;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Proveedor")
public class Proveedor {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY/*, generator = "secuencia_mi_entidad"*/)
    //@SequenceGenerator(name = "secuencia_mi_entidad", sequenceName = "secuencia_mi_entidad", allocationSize = 1, initialValue = 10000)
    @Column(name="Id_Proveedor", nullable=false )
    private long id;
	
	@Column(name="Nombre", nullable=false)
	private String nombre;
	
	@Column(name="Direccion", nullable=false)
	private String direccion;
	
	@Column(name="Telefono", nullable=false)
	private String telefono;
	
	@Column(name="Correo", nullable=false)
	private String correo;
	
	@OneToMany(mappedBy="proveedor")
	private List<Equipos_Estacionamiento> listaEquipos_Estacionamiento;

	public Proveedor(long id, String nombre, String direccion, String telefono, String correo,
			List<Equipos_Estacionamiento> listaEquipos_Estacionamiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.listaEquipos_Estacionamiento = listaEquipos_Estacionamiento;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<Equipos_Estacionamiento> getListaEquipos_Estacionamiento() {
		return listaEquipos_Estacionamiento;
	}

	public void setListaEquipos_Estacionamiento(List<Equipos_Estacionamiento> listaEquipos_Estacionamiento) {
		this.listaEquipos_Estacionamiento = listaEquipos_Estacionamiento;
	}
	
	/*
	 @OneToMany(mappedBy="usuario")
	 private List<Noticias> listaNoticia;*/
	

	

	
}
