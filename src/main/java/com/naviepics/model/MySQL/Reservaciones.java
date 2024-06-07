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
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table (name ="Reservaciones")
public class Reservaciones {
	
	@Id
    @SequenceGenerator(name="secuencua_201", sequenceName="secuencia_201", initialValue=201, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "secuencia_201")	@Column(name="Id_Reserva")
    private long id;

    @Column(name = "Fecha_Reserva",  nullable=false)
    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_reserva;
    
    @Column(name = "Hora_Reserva",  nullable=false)
    @DateTimeFormat(pattern = "hh:mm:ss")
    @Temporal(TemporalType.TIME)
    private Date hora_reserva;
    
    @ManyToOne
	@JoinColumn(name="Id_Estacionamiento",  nullable=false)
	private Estacionamiento estacionamiento;
    
    @ManyToOne
	@JoinColumn(name="Id_Usuario",  nullable=false)
	private Usuario usuario;
    public Reservaciones() {
    	
    }
	public Reservaciones(long id, Date fecha_reserva, Date hora_reserva, Estacionamiento estacionamiento,
			Usuario usuario) {
		this.id = id;
		this.fecha_reserva = fecha_reserva;
		this.hora_reserva = hora_reserva;
		this.estacionamiento = estacionamiento;
		this.usuario = usuario;
	}
	public Reservaciones(Date fecha_reserva, Date hora_reserva, Estacionamiento estacionamiento,
			Usuario usuario) {
		this.fecha_reserva = fecha_reserva;
		this.hora_reserva = hora_reserva;
		this.estacionamiento = estacionamiento;
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


	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
    
    
}
