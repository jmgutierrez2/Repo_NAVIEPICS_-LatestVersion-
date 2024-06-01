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
import jakarta.persistence.Table;

@Entity
@Table(name="Vehiculo")
public class Vehiculo {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Cod_Vehiculo")
    private long id;
	
	@Column(name="Placa", nullable=false)
	private String placa;
	
	@Column(name="Modelo", nullable=false)
	private String modelo;
	
	@Column(name="Color", nullable=false)
	private String color;
	
	@Column(name="Fabricante")
	private String fabricante;
	
	@ManyToOne
	@JoinColumn(name="Id_Usuario",  nullable=false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="Id_Tipo_Vehiculo",  nullable=false)
	private Tipo_Vehiculo tipo_vehiculo;
	
	@OneToMany(mappedBy="vehiculo")
	private List<Historial_Sanciones> listaHistorial_Sanciones;
    
    @OneToMany(mappedBy="vehiculo")
	private List<Recibo> listaRecibo;

    @OneToMany(mappedBy="vehiculo")
	private List<Reporte_Entrada_Salida> listaReporte_Entrada_Salida;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(long id, String placa, String modelo, String color, String fabricante, Usuario usuario,
			Tipo_Vehiculo tipo_vehiculo) {
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.color = color;
		this.fabricante = fabricante;
		this.usuario = usuario;
		this.tipo_vehiculo = tipo_vehiculo;
	}
	
	public Vehiculo(String placa, String modelo, String color, String fabricante, Usuario usuario,
			Tipo_Vehiculo tipo_vehiculo) {
		this.placa = placa;
		this.modelo = modelo;
		this.color = color;
		this.fabricante = fabricante;
		this.usuario = usuario;
		this.tipo_vehiculo = tipo_vehiculo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Tipo_Vehiculo getTipo_vehiculo() {
		return tipo_vehiculo;
	}

	public void setTipo_vehiculo(Tipo_Vehiculo tipo_vehiculo) {
		this.tipo_vehiculo = tipo_vehiculo;
	}

	public List<Historial_Sanciones> getListaHistorial_Sanciones() {
		return listaHistorial_Sanciones;
	}

	public void setListaHistorial_Sanciones(List<Historial_Sanciones> listaHistorial_Sanciones) {
		this.listaHistorial_Sanciones = listaHistorial_Sanciones;
	}

	public List<Recibo> getListaRecibo() {
		return listaRecibo;
	}

	public void setListaRecibo(List<Recibo> listaRecibo) {
		this.listaRecibo = listaRecibo;
	}

	public List<Reporte_Entrada_Salida> getListaReporte_Entrada_Salida() {
		return listaReporte_Entrada_Salida;
	}

	public void setListaReporte_Entrada_Salida(List<Reporte_Entrada_Salida> listaReporte_Entrada_Salida) {
		this.listaReporte_Entrada_Salida = listaReporte_Entrada_Salida;
	}
	
	

}
