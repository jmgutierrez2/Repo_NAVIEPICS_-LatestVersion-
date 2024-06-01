package com.naviepics.model.Oracle;

import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Equipos_Estacionamiento")
public class Equipos_Estacionamiento {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Equipos_Estacionamiento")
    private long id;
	
	@Column(name="Tipo_Equipo", nullable=false)
	private String tipo_equipo;
	
	@Column(name="Marca_Equipo", nullable=false)
	private String marca_equipo;
	
	@Column(name="Modelo_Equipo", nullable=false)
	private String modelo_equipo;
	
	@Column(name="Numero_Equipo")
	private String numero_equipo;
	
	@ManyToOne
	@JoinColumn(name="Id_Proveedor",  nullable=false)
	private Proveedor proveedor;
	
	@OneToMany(mappedBy="equipos_estacionamiento")
	private List<Mantenimiento_Equipos> listaMantenimiento_Equipos;

	public Equipos_Estacionamiento(long id, String tipo_equipo, String marca_equipo, String modelo_equipo,
			String numero_equipo, Proveedor proveedor, List<Mantenimiento_Equipos> listaMantenimiento_Equipos) {
		super();
		this.id = id;
		this.tipo_equipo = tipo_equipo;
		this.marca_equipo = marca_equipo;
		this.modelo_equipo = modelo_equipo;
		this.numero_equipo = numero_equipo;
		this.proveedor = proveedor;
		this.listaMantenimiento_Equipos = listaMantenimiento_Equipos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo_equipo() {
		return tipo_equipo;
	}

	public void setTipo_equipo(String tipo_equipo) {
		this.tipo_equipo = tipo_equipo;
	}

	public String getMarca_equipo() {
		return marca_equipo;
	}

	public void setMarca_equipo(String marca_equipo) {
		this.marca_equipo = marca_equipo;
	}

	public String getModelo_equipo() {
		return modelo_equipo;
	}

	public void setModelo_equipo(String modelo_equipo) {
		this.modelo_equipo = modelo_equipo;
	}

	public String getNumero_equipo() {
		return numero_equipo;
	}

	public void setNumero_equipo(String numero_equipo) {
		this.numero_equipo = numero_equipo;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public List<Mantenimiento_Equipos> getListaMantenimiento_Equipos() {
		return listaMantenimiento_Equipos;
	}

	public void setListaMantenimiento_Equipos(List<Mantenimiento_Equipos> listaMantenimiento_Equipos) {
		this.listaMantenimiento_Equipos = listaMantenimiento_Equipos;
	}
	
	
}
