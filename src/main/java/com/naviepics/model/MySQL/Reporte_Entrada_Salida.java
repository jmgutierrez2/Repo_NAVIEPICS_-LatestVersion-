package com.naviepics.model.MySQL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name ="Reporte_Entrada_Salida")
public class Reporte_Entrada_Salida {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Reporte_Entrada_Salida")
    private long id;
	
	@Column(name="Metodo_Pago", nullable=false)
	private String metodo_pago;
	
	@ManyToOne
	@JoinColumn(name="Id_Entrada",  nullable=false)
	private Entradas entradas;
	
	@ManyToOne
	@JoinColumn(name="Id_Salida",  nullable=false)
	private Salida salida;
	
	@ManyToOne
	@JoinColumn(name="Cod_Vehiculo",  nullable=false)
	private Vehiculo vehiculo;

	public Reporte_Entrada_Salida() {
		
	}
	public Reporte_Entrada_Salida(long id, String metodo_pago, Entradas entradas, Salida salida, Vehiculo vehiculo) {
		this.id = id;
		this.metodo_pago = metodo_pago;
		this.entradas = entradas;
		this.salida = salida;
		this.vehiculo = vehiculo;
	}
	public Reporte_Entrada_Salida(String metodo_pago, Entradas entradas, Salida salida, Vehiculo vehiculo) {
		this.metodo_pago = metodo_pago;
		this.entradas = entradas;
		this.salida = salida;
		this.vehiculo = vehiculo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	public Entradas getEntradas() {
		return entradas;
	}

	public void setEntradas(Entradas entradas) {
		this.entradas = entradas;
	}

	public Salida getSalida() {
		return salida;
	}

	public void setSalida(Salida salida) {
		this.salida = salida;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	

}
