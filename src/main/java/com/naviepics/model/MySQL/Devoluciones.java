package com.naviepics.model.MySQL;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Size;
import jakarta.persistence.JoinColumn;


@Entity
@Table (name ="Devoluciones")
public class Devoluciones {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY/*, generator = "secuencia_mi_entidad"*/)
    //@SequenceGenerator(name = "secuencia_mi_entidad", sequenceName = "secuencia_mi_entidad", allocationSize = 1, initialValue = 10000)
    @Column(name="Id_Devoluciones", nullable=false )
    private long id;
	
	@ManyToOne
	@JoinColumn(name="Id_Usuario",  nullable=false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="Id_Estacionamiento",  nullable=false)
	private Estacionamiento estacionamiento;
	
	@Column(name="Descripcion", nullable=false)
    @Size(min = 5, max = 150)
	private String descripción;
	
	@PrePersist
    public void prePersist() {
        fecha_hora = new Date();
    }
    @Column(name = "Fecha_Hora_Devolucion",  nullable=false)
    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_hora;
    
    @Column(name="Monto_Devolucion", nullable=false)
    private double monto_devolucion;
    
	public Devoluciones(long id, Usuario usuario, Estacionamiento estacionamiento, String descripción, Date fecha_hora,
			double monto_devolucion) {
		this.id = id;
		this.usuario = usuario;
		this.estacionamiento = estacionamiento;
		this.descripción = descripción;
		this.fecha_hora = fecha_hora;
		this.monto_devolucion = monto_devolucion;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public Date getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public double getMonto_devolucion() {
		return monto_devolucion;
	}
	public void setMonto_devolucion(double monto_devolucion) {
		this.monto_devolucion = monto_devolucion;
	}
    
    
    
}
