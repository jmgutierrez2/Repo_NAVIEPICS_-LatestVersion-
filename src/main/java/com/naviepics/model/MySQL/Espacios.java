package com.naviepics.model.MySQL;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name ="Espacios")
public class Espacios {
	
	@Id
	@SequenceGenerator(name="secuencia_3001", sequenceName="secuencia_3001", initialValue=3001, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "secuencia_3001")		
	@Column(name="Id_Espacio")
    private long id;
	
	@Column(name="Estado", nullable=false)
    private Integer estado;
	
	@ManyToOne
	@JoinColumn(name="Id_Estacionamiento",  nullable=false)
	private Estacionamiento estacionamiento;
	
	@ManyToOne
	@JoinColumn(name="Id_Tipo_Espacios",  nullable=false)
	private Tipo_Espacios tipo_espacios;
	
	@OneToMany(mappedBy="espacios")
	private List<Recibo> listaRecibo;
	
	@OneToMany(mappedBy="espacios")
	private List<Reservaciones> listaReservaciones;
	
	public Espacios() {
		
	}

	public Espacios(long id, Integer estado, Estacionamiento estacionamiento, Tipo_Espacios tipo_espacios) {
		this.id = id;
		this.estado = estado;
		this.estacionamiento = estacionamiento;
		this.tipo_espacios = tipo_espacios;
	}
	public Espacios(Integer estado, Estacionamiento estacionamiento, Tipo_Espacios tipo_espacios) {
		this.estado = estado;
		this.estacionamiento = estacionamiento;
		this.tipo_espacios = tipo_espacios;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Estacionamiento getEstacionamiento() {
		return estacionamiento;
	}

	public void setEstacionamiento(Estacionamiento estacionamiento) {
		this.estacionamiento = estacionamiento;
	}

	public Tipo_Espacios getTipo_espacios() {
		return tipo_espacios;
	}

	public void setTipo_espacios(Tipo_Espacios tipo_espacios) {
		this.tipo_espacios = tipo_espacios;
	}

	public List<Recibo> getListaRecibo() {
		return listaRecibo;
	}

	public void setListaRecibo(List<Recibo> listaRecibo) {
		this.listaRecibo = listaRecibo;
	}

	public List<Reservaciones> getListaReservaciones() {
		return listaReservaciones;
	}

	public void setListaReservaciones(List<Reservaciones> listaReservaciones) {
		this.listaReservaciones = listaReservaciones;
	}
	
	
}
