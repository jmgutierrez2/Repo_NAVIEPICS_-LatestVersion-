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
@Table (name ="Salida")
public class Salida {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Salida")
    private long id;
	
	@PrePersist
    public void prePersist() {
        fecha_hora_salida = new Date();
    }
    @Column(name = "Fecha_Hora_Salida",  nullable=false)
    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_hora_salida;
    
    @ManyToOne
	@JoinColumn(name="Id_Entrada",  nullable=false)
	private Entradas entradas;
    
    @OneToMany(mappedBy="salida")
	private List<Recibo> listaRecibo;
    
    @OneToMany(mappedBy="salida")
	private List<Reporte_Entrada_Salida> listaReporte_Entrada_Salida;
	public Salida() {
		
	}
	public Salida(long id, Date fecha_hora_salida, Entradas entradas) {
		this.id = id;
		this.fecha_hora_salida = fecha_hora_salida;
		this.entradas = entradas;
	}
	public Salida(Date fecha_hora_salida, Entradas entradas) {
		this.fecha_hora_salida = fecha_hora_salida;
		this.entradas = entradas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha_hora_salida() {
		return fecha_hora_salida;
	}

	public void setFecha_hora_salida(Date fecha_hora_salida) {
		this.fecha_hora_salida = fecha_hora_salida;
	}

	public Entradas getEntradas() {
		return entradas;
	}

	public void setEntradas(Entradas entradas) {
		this.entradas = entradas;
	}

	public List<Recibo> getListaRecibo() {
		return listaRecibo;
	}

	public void setListaRecibo(List<Recibo> listaRecibo) {
		this.listaRecibo = listaRecibo;
	}

	public List<Reporte_Entrada_Salida> getListaReporte_Entrada_Salida() {
		return listaReporte_Entrada_Salida;
	}

	public void setListaReporte_Entrada_Salida(List<Reporte_Entrada_Salida> listaReporte_Entrada_Salida) {
		this.listaReporte_Entrada_Salida = listaReporte_Entrada_Salida;
	}
	
	

}
