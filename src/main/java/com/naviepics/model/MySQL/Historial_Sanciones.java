package com.naviepics.model.MySQL;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table (name ="Historial_Sanciones")
public class Historial_Sanciones {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Historial")
    private long id;
	
	@Column(name="Descripcion", nullable=false)
	private String descripcion;
	
	@PrePersist
    public void prePersist() {
        fecha_hora_incidencia = new Date();
    }
    @Column(name = "Fecha_Hora_Incidencia",  nullable=false)
    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_hora_incidencia;
    
    @Column(name="Monto_Sancion", nullable=false)
    private double monto_sancion;
    
    @ManyToOne
	@JoinColumn(name="Cod_Vehiculo",  nullable=false)
	private Vehiculo vehiculo;
	
	@ManyToOne
	@JoinColumn(name="Id_Estacionamiento",  nullable=false)
	private Estacionamiento estacionamiento;
	
	

	public Historial_Sanciones() {
	}

	public Historial_Sanciones(long id, String descripcion, Date fecha_hora_incidencia, double monto_sancion,
			Vehiculo vehiculo, Estacionamiento estacionamiento) {
		this.id = id;
		this.descripcion = descripcion;
		this.fecha_hora_incidencia = fecha_hora_incidencia;
		this.monto_sancion = monto_sancion;
		this.vehiculo = vehiculo;
		this.estacionamiento = estacionamiento;
	}
	
	public Historial_Sanciones(String descripcion, Date fecha_hora_incidencia, double monto_sancion,
			Vehiculo vehiculo, Estacionamiento estacionamiento) {
		this.descripcion = descripcion;
		this.fecha_hora_incidencia = fecha_hora_incidencia;
		this.monto_sancion = monto_sancion;
		this.vehiculo = vehiculo;
		this.estacionamiento = estacionamiento;
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

	public Date getFecha_hora_incidencia() {
		return fecha_hora_incidencia;
	}

	public void setFecha_hora_incidencia(Date fecha_hora_incidencia) {
		this.fecha_hora_incidencia = fecha_hora_incidencia;
	}

	public double getMonto_sancion() {
		return monto_sancion;
	}

	public void setMonto_sancion(double monto_sancion) {
		this.monto_sancion = monto_sancion;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Estacionamiento getEstacionamiento() {
		return estacionamiento;
	}

	public void setEstacionamiento(Estacionamiento estacionamiento) {
		this.estacionamiento = estacionamiento;
	}
	
	
}
