package com.naviepics.model.MySQL;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table (name ="Recibo")
public class Recibo {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Recibo")
    private long id;
	
	@PrePersist
    public void prePersist() {
        fecha_emision = new Date();
    }
    @Column(name = "Fecha_Emision",  nullable=false)
    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_emision;
    
    @Column(name="Monto", nullable=false)
    private double monto;
    
    @ManyToOne
	@JoinColumn(name="Cod_Vehiculo",  nullable=false)
	private Vehiculo vehiculo;
    
    @ManyToOne
	@JoinColumn(name="Id_Entrada",  nullable=false)
	private Entradas entradas;
    
    @ManyToOne
	@JoinColumn(name="Id_Salida",  nullable=false)
	private Salida salida;
    
    @ManyToOne
	@JoinColumn(name="Id_Espacio",  nullable=false)
	private Espacios espacios;
    
    @OneToMany(mappedBy="recibo")
	private List<Pagos> listaPagos;

	public Recibo(long id, Date fecha_emision, double monto, Vehiculo vehiculo, Entradas entradas, Salida salida,
			Espacios espacios, List<Pagos> listaPagos) {
		super();
		this.id = id;
		this.fecha_emision = fecha_emision;
		this.monto = monto;
		this.vehiculo = vehiculo;
		this.entradas = entradas;
		this.salida = salida;
		this.espacios = espacios;
		this.listaPagos = listaPagos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha_emision() {
		return fecha_emision;
	}

	public void setFecha_emision(Date fecha_emision) {
		this.fecha_emision = fecha_emision;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
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

	public Espacios getEspacios() {
		return espacios;
	}

	public void setEspacios(Espacios espacios) {
		this.espacios = espacios;
	}

	public List<Pagos> getListaPagos() {
		return listaPagos;
	}

	public void setListaPagos(List<Pagos> listaPagos) {
		this.listaPagos = listaPagos;
	}
    
    

}
