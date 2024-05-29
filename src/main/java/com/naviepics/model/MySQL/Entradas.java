package com.naviepics.model.MySQL;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Entradas")
public class Entradas {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Entrada")
    private long id;
	
	@PrePersist
    public void prePersist() {
        fecha_hora_entrada = new Date();
    }
    @Column(name = "Fecha_Hora_Entrada",  nullable=false)
    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_hora_entrada;

    @OneToMany(mappedBy="entradas")
	private List<Recibo> listaRecibo;
    
    @OneToMany(mappedBy="entradas")
	private List<Salida> listaSalida;

    @OneToMany(mappedBy="entradas")
	private List<Reporte_Entrada_Salida> listaReporte_Entrada_Salida;
	
	 
	
	public Entradas() {
	}

	public Entradas(long id, Date fecha_hora_entrada) {
		this.id = id;
		this.fecha_hora_entrada = fecha_hora_entrada;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha_hora_entrada() {
		return fecha_hora_entrada;
	}

	public void setFecha_hora_entrada(Date fecha_hora_entrada) {
		this.fecha_hora_entrada = fecha_hora_entrada;
	}

	public List<Recibo> getListaRecibo() {
		return listaRecibo;
	}

	public void setListaRecibo(List<Recibo> listaRecibo) {
		this.listaRecibo = listaRecibo;
	}

	public List<Salida> getListaSalida() {
		return listaSalida;
	}

	public void setListaSalida(List<Salida> listaSalida) {
		this.listaSalida = listaSalida;
	}

	public List<Reporte_Entrada_Salida> getListaReporte_Entrada_Salida() {
		return listaReporte_Entrada_Salida;
	}

	public void setListaReporte_Entrada_Salida(List<Reporte_Entrada_Salida> listaReporte_Entrada_Salida) {
		this.listaReporte_Entrada_Salida = listaReporte_Entrada_Salida;
	}
	
	
}
