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
@Table (name ="Pagos")
public class Pagos {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Pago")
    private long id;
	
	@PrePersist
    public void prePersist() {
        fecha_pago = new Date();
    }
    @Column(name = "Fecha_Pago",  nullable=false)
    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_pago;
    
    @Column(name="Metodo_Pago", nullable=false)
	private String metodo_pago;
    
    @Column(name="Estado", nullable=false)
    private Integer estado;
    
    @Column(name="Monto", nullable=false)
    private double monto;
    
    @ManyToOne
	@JoinColumn(name="Id_Recibo",  nullable=false)
	private Recibo recibo;
    
    @OneToMany(mappedBy="pagos")
	private List<Historial_Pagos> listaHistorial_Pagos;
	
	public Pagos() {
		
	}

	public Pagos(long id, Date fecha_pago, String metodo_pago, Integer estado, double monto, Recibo recibo) {
		super();
		this.id = id;
		this.fecha_pago = fecha_pago;
		this.metodo_pago = metodo_pago;
		this.estado = estado;
		this.monto = monto;
		this.recibo = recibo;
	}
	public Pagos(Date fecha_pago, String metodo_pago, Integer estado, double monto, Recibo recibo) {
		this.fecha_pago = fecha_pago;
		this.metodo_pago = metodo_pago;
		this.estado = estado;
		this.monto = monto;
		this.recibo = recibo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha_pago() {
		return fecha_pago;
	}

	public void setFecha_pago(Date fecha_pago) {
		this.fecha_pago = fecha_pago;
	}

	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Recibo getRecibo() {
		return recibo;
	}

	public void setRecibo(Recibo recibo) {
		this.recibo = recibo;
	}

	public List<Historial_Pagos> getListaHistorial_Pagos() {
		return listaHistorial_Pagos;
	}

	public void setListaHistorial_Pagos(List<Historial_Pagos> listaHistorial_Pagos) {
		this.listaHistorial_Pagos = listaHistorial_Pagos;
	}
	
	
}
