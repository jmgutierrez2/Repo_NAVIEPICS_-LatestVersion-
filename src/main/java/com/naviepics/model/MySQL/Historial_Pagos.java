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
@Table (name ="Historial_Pagos")
public class Historial_Pagos {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Historial_Pagos")
    private long id;
	
	@PrePersist
    public void prePersist() {
        fecha_cancelacion = new Date();
    }
    @Column(name = "Fecha_Cancelacion",  nullable=false)
    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_cancelacion;
    
    @ManyToOne
	@JoinColumn(name="Id_Pago",  nullable=false)
	private Pagos pagos;

	public Historial_Pagos(long id, Date fecha_cancelacion, Pagos pagos) {
		super();
		this.id = id;
		this.fecha_cancelacion = fecha_cancelacion;
		this.pagos = pagos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha_cancelacion() {
		return fecha_cancelacion;
	}

	public void setFecha_cancelacion(Date fecha_cancelacion) {
		this.fecha_cancelacion = fecha_cancelacion;
	}

	public Pagos getPagos() {
		return pagos;
	}

	public void setPagos(Pagos pagos) {
		this.pagos = pagos;
	}
    
    
}
