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
@Table (name ="Tipo_Espacios")
public class Tipo_Espacios {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Tipo_Espacios")
    private long id;
	
	@Column(name="Descripcion", nullable=false)
	private String descripcion;
	
	@OneToMany(mappedBy="tipo_espacios")
	private List<Espacios> listaEspacios;
	public Tipo_Espacios() {
		
	}
	public Tipo_Espacios(long id, String descripcion, List<Espacios> listaEspacios) {
		this.id = id;
		this.descripcion = descripcion;
		this.listaEspacios = listaEspacios;
	}
	public Tipo_Espacios(String descripcion) {
		this.descripcion = descripcion;
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

	public List<Espacios> getListaEspacios() {
		return listaEspacios;
	}

	public void setListaEspacios(List<Espacios> listaEspacios) {
		this.listaEspacios = listaEspacios;
	}
	
	

}
