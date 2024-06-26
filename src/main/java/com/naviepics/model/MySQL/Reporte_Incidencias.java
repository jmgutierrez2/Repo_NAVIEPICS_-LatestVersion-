package com.naviepics.model.MySQL;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

@Entity
@Table(name="Reporte_Incidencias")
public class Reporte_Incidencias {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Reporte")
    private long id;
	
	@Column(name="Descripcion", nullable=false)
	private String descripcion;
	
    @Column(name = "Fecha_Hora_Incidencia",  nullable=false)
    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_incidencia;
    
    @Column(name = "Hora_Incidencia",  nullable=false)
    @DateTimeFormat(pattern = "hh:mm:ss")
    @Temporal(TemporalType.TIME)
    private Date hora_incidencia;
    
    @ManyToOne
	@JoinColumn(name="Id_Estacionamiento",  nullable=false)
	private Estacionamiento estacionamiento;
    
    @ManyToOne
	@JoinColumn(name="Id_Usuario",  nullable=false)
	private Usuario usuario;
    
    public Reporte_Incidencias() {
		
	}

	public Reporte_Incidencias(long id, String descripcion, Date fecha_incidencia,Date hora_incidencia, Estacionamiento estacionamiento,
			Usuario usuario) {
		this.id = id;
		this.descripcion = descripcion;
		this.fecha_incidencia = fecha_incidencia;
		this.hora_incidencia=hora_incidencia;
		this.estacionamiento = estacionamiento;
		this.usuario = usuario;
	}

	public Reporte_Incidencias(String descripcion, Date fecha_incidencia,Date hora_incidencia,Estacionamiento estacionamiento, Usuario usuario) {
		this.descripcion = descripcion;
		this.fecha_incidencia = fecha_incidencia;
		this.hora_incidencia=hora_incidencia;
		this.estacionamiento = estacionamiento;
		this.usuario = usuario;
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

	public Date getFecha_incidencia() {
		return fecha_incidencia;
	}

	public void setFecha_incidencia(Date fecha_hora_incidencia) {
		this.fecha_incidencia = fecha_hora_incidencia;
	}

	
	public Date getHora_incidencia() {
		return hora_incidencia;
	}

	public void setHora_incidencia(Date hora_incidencia) {
		this.hora_incidencia = hora_incidencia;
	}

	public Estacionamiento getEstacionamiento() {
		return estacionamiento;
	}

	public void setEstacionamiento(Estacionamiento estacionamiento) {
		this.estacionamiento = estacionamiento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
