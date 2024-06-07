package com.naviepics.model.Oracle;

import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Equipos_Estacionamiento")
public class Equipos_Estacionamiento {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Equipos_Estacionamiento")
    private long id;
	
	@Column(name="Tipo_Equipo", nullable=false)
	private String tipo_equipo;
	
	@Column(name="Marca_Equipo", nullable=false)
	private String marca_equipo;
	
	@Column(name="Modelo_Equipo", nullable=false)
	private String modelo_equipo;
	
	
	@ManyToOne
	@JoinColumn(name="Id_Proveedor",nullable=false)
	private Proveedor proveedor;
	
	public Equipos_Estacionamiento() {
		
	}

	
	public Equipos_Estacionamiento(long id, String tipo_equipo, String marca_equipo, String modelo_equipo,
			Proveedor proveedor) {
		this.id = id;
		this.tipo_equipo = tipo_equipo;
		this.marca_equipo = marca_equipo;
		this.modelo_equipo = modelo_equipo;
		this.proveedor = proveedor;
	}
	
	public Equipos_Estacionamiento(String tipo_equipo, String marca_equipo, String modelo_equipo,
			Proveedor proveedor) {
		this.tipo_equipo = tipo_equipo;
		this.marca_equipo = marca_equipo;
		this.modelo_equipo = modelo_equipo;
		this.proveedor = proveedor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo_equipo() {
		return tipo_equipo;
	}

	public void setTipo_equipo(String tipo_equipo) {
		this.tipo_equipo = tipo_equipo;
	}

	public String getMarca_equipo() {
		return marca_equipo;
	}

	public void setMarca_equipo(String marca_equipo) {
		this.marca_equipo = marca_equipo;
	}

	public String getModelo_equipo() {
		return modelo_equipo;
	}

	public void setModelo_equipo(String modelo_equipo) {
		this.modelo_equipo = modelo_equipo;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

}
