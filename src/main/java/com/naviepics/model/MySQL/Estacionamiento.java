package com.naviepics.model.MySQL;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Estacionamiento")
public class Estacionamiento {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY/*, generator = "secuencia_mi_entidad"*/)
    //@SequenceGenerator(name = "secuencia_mi_entidad", sequenceName = "secuencia_mi_entidad", allocationSize = 1, initialValue = 10000)
	@Column(name="Id_Estacionamiento")
    private long id;
	
	@Column(name="Nombre", nullable=false)
    private String nombre;
	
	@Column(name="Direccion", nullable=false)
    private String direccion;
	
	@Column(name="Capacidad", nullable=false)
    private Integer capacidad;
	
	@Column(name="Horario_Funcionamiento", nullable=false)
    private String horario_funcionamiento;
	
	@Column(name="Estado", nullable=false)
    private boolean estado;
	
	@OneToMany(mappedBy="estacionamiento")
	private List<Tarifas> listaTarifas;
	/*
	@OneToMany(mappedBy="estacionamiento")
	private List<Espacios> listaEspacios;
	
	@OneToMany(mappedBy="estacionamiento")
	private List<Devoluciones> listaDevoluciones;
	
	@OneToMany(mappedBy="estacionamiento")
	private List<Historial_Sanciones> listaHistorial_Sanciones;
	
	@OneToMany(mappedBy="estacionamiento")
	private List<Reservaciones> listaResevaciones;*/

	public Estacionamiento(long id, String nombre, String direccion, Integer capacidad, String horario_funcionamiento,
			boolean estado) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.capacidad = capacidad;
		this.horario_funcionamiento = horario_funcionamiento;
		this.estado = estado;
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

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getHorario_funcionamiento() {
		return horario_funcionamiento;
	}

	public void setHorario_funcionamiento(String horario_funcionamiento) {
		this.horario_funcionamiento = horario_funcionamiento;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
