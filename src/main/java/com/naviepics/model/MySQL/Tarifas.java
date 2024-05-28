package com.naviepics.model.MySQL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Tarifas")
public class Tarifas {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY/*, generator = "secuencia_mi_entidad"*/)
    //@SequenceGenerator(name = "secuencia_mi_entidad", sequenceName = "secuencia_mi_entidad", allocationSize = 1, initialValue = 10000)
	@Column(name="Id_Tarifa")
    private long id;
	
	@Column(name="Franja_Horaria", nullable=false)
    private String franja_Horario;
	
	@Column(name="Valor_Hora", nullable=false)
    private Double valor_Hora;
	
	@ManyToOne
	@JoinColumn(name="Id_Estacionamiento", nullable=false)
	private Estacionamiento estacionamiento;

	public Tarifas(long id, String franja_Horario, Double valor_Hora, Estacionamiento estacionamiento) {
		this.id = id;
		this.franja_Horario = franja_Horario;
		this.valor_Hora = valor_Hora;
		this.estacionamiento = estacionamiento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFranja_Horario() {
		return franja_Horario;
	}

	public void setFranja_Horario(String franja_Horario) {
		this.franja_Horario = franja_Horario;
	}

	public Double getValor_Hora() {
		return valor_Hora;
	}

	public void setValor_Hora(Double valor_Hora) {
		this.valor_Hora = valor_Hora;
	}

	public Estacionamiento getEstacionamiento() {
		return estacionamiento;
	}

	public void setEstacionamiento(Estacionamiento estacionamiento) {
		this.estacionamiento = estacionamiento;
	}
	
	
	
}