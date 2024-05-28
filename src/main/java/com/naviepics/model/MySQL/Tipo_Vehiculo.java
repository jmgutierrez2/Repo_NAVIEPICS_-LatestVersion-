package com.naviepics.model.MySQL;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name ="Tipo_Vehiculo")
public class Tipo_Vehiculo {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Tipo_Vehiculo")
    private long id;
	
	@Column(name="Descripcion", nullable=false)
	private String descripcion;
	
	@OneToMany(mappedBy="tipo_vehiculo")
	private List<Vehiculo> listaVehiculo;

	public Tipo_Vehiculo(long id, String descripcion, List<Vehiculo> listaVehiculo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.listaVehiculo = listaVehiculo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Vehiculo> getListaVehiculo() {
		return listaVehiculo;
	}

	public void setListaVehiculo(List<Vehiculo> listaVehiculo) {
		this.listaVehiculo = listaVehiculo;
	}
	
	

}
