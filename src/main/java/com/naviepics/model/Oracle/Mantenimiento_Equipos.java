package com.naviepics.model.Oracle;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.naviepics.model.MySQL.Estacionamiento;

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
@Table(name="Mantenimiento_Equipos")
public class Mantenimiento_Equipos {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Mantenimiento_Equipo")
    private long id;
	
	@PrePersist
    public void prePersist() {
        fecha = new Date();
    }
    @Column(name = "Fecha",  nullable=false)
    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    @Column(name="Descripcion", nullable=false)
	private String descripcion;
    
    @Column(name="Tecnico_Responsable", nullable=false)
	private String tecnico_responsable;
    
    @ManyToOne
	@JoinColumn(name="Id_Equipos_Estacionamiento",  nullable=false)
	private Equipos_Estacionamiento equipos_estacionamiento;

	public Mantenimiento_Equipos(long id, Date fecha, String descripcion, String tecnico_responsable,
			Equipos_Estacionamiento equipos_estacionamiento) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.tecnico_responsable = tecnico_responsable;
		this.equipos_estacionamiento = equipos_estacionamiento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTecnico_responsable() {
		return tecnico_responsable;
	}

	public void setTecnico_responsable(String tecnico_responsable) {
		this.tecnico_responsable = tecnico_responsable;
	}

	public Equipos_Estacionamiento getEquipos_estacionamiento() {
		return equipos_estacionamiento;
	}

	public void setEquipos_estacionamiento(Equipos_Estacionamiento equipos_estacionamiento) {
		this.equipos_estacionamiento = equipos_estacionamiento;
	}
    
    

}
