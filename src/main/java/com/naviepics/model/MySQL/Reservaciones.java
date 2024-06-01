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
@Table (name ="Reservaciones")
public class Reservaciones {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Reserva")
    private long id;

	@PrePersist
    public void prePersist() {
        fecha_reserva = new Date();
        hora_reserva = new Date();
    }
	
    @Column(name = "Fecha_Reserva",  nullable=false)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date fecha_reserva;
    
    @Column(name = "Hora_Reserva",  nullable=false)
    @DateTimeFormat(pattern = "hh:mm:ss")
    @Temporal(TemporalType.TIME)
    private Date hora_reserva;
    
    @ManyToOne
	@JoinColumn(name="Id_Estacionamiento",  nullable=false)
	private Estacionamiento estacionamiento;
    
    @ManyToOne
	@JoinColumn(name="Id_Espacio",  nullable=false)
	private Espacios espacios;
    
    @ManyToOne
	@JoinColumn(name="Id_Usuario",  nullable=false)
	private Usuario usuario;
    public Reservaciones() {
    	
    }
	public Reservaciones(long id, Date fecha_reserva, Date hora_reserva, Estacionamiento estacionamiento,
			Espacios espacios, Usuario usuario) {
		this.id = id;
		this.fecha_reserva = fecha_reserva;
		this.hora_reserva = hora_reserva;
		this.estacionamiento = estacionamiento;
		this.espacios = espacios;
		this.usuario = usuario;
	}
	public Reservaciones(Date fecha_reserva, Date hora_reserva, Estacionamiento estacionamiento,
			Espacios espacios, Usuario usuario) {
		this.fecha_reserva = fecha_reserva;
		this.hora_reserva = hora_reserva;
		this.estacionamiento = estacionamiento;
		this.espacios = espacios;
		this.usuario = usuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha_reserva() {
		return fecha_reserva;
	}

	public void setFecha_reserva(Date fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}

	public Date getHora_reserva() {
		return hora_reserva;
	}

	public void setHora_reserva(Date hora_reserva) {
		this.hora_reserva = hora_reserva;
	}

	public Estacionamiento getEstacionamiento() {
		return estacionamiento;
	}

	public void setEstacionamiento(Estacionamiento estacionamiento) {
		this.estacionamiento = estacionamiento;
	}

	public Espacios getEspacios() {
		return espacios;
	}

	public void setEspacios(Espacios espacios) {
		this.espacios = espacios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
    
    
}
