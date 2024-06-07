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
@Table(name="Feedback")
public class Feedback {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Feedback")
    private long id;
	
	@PrePersist
    public void prePersist() {
        fecha = new Date();
    }
    @Column(name = "Fecha",  nullable=false)
    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    @Column(name="Calificacion", nullable=false)
    private Integer calificacion;
    
    @Column(name="Comentario", nullable=false)
	private String comentario;
    
    @ManyToOne
	@JoinColumn(name="Id_Usuario",  nullable=false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="Id_Estacionamiento",  nullable=false)
	private Estacionamiento estacionamiento;
	
	public Feedback() {
		
	}

	public Feedback(long id, Date fecha, Integer calificacion, String comentario, Usuario usuario,
			Estacionamiento estacionamiento) {
		this.id = id;
		this.fecha = fecha;
		this.calificacion = calificacion;
		this.comentario = comentario;
		this.usuario = usuario;
		this.estacionamiento = estacionamiento;
	}

	public Feedback(Date fecha, Integer calificacion, String comentario, Usuario usuario,
			Estacionamiento estacionamiento) {
		this.fecha = fecha;
		this.calificacion = calificacion;
		this.comentario = comentario;
		this.usuario = usuario;
		this.estacionamiento = estacionamiento;
	}
	
	public Feedback(Integer calificacion, String comentario, Usuario usuario, Estacionamiento estacionamiento) {
		super();
		this.calificacion = calificacion;
		this.comentario = comentario;
		this.usuario = usuario;
		this.estacionamiento = estacionamiento;
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

	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Estacionamiento getEstacionamiento() {
		return estacionamiento;
	}

	public void setEstacionamiento(Estacionamiento estacionamiento) {
		this.estacionamiento = estacionamiento;
	}
	
	
}
