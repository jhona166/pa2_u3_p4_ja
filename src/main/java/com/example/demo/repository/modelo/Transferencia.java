package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="transferencia")
public class Transferencia {
	
	@GeneratedValue(generator = "seq_transferencia",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_transferencia",sequenceName = "seq_transferencia",allocationSize = 1)


	@Id
	@Column(name="trans_id")
	private Integer id;
	@Column(name="trans_fecha")
	private LocalDateTime fecha;
	@Column(name="trans_monton")
	private BigDecimal monton;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ctaOrigen_id")
	private CuentaBancaria ctaOrigen;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ctaDestino_id")
	private CuentaBancaria ctaDestino;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getMonton() {
		return monton;
	}

	public void setMonton(BigDecimal monton) {
		this.monton = monton;
	}

	public CuentaBancaria getCtaOrigen() {
		return ctaOrigen;
	}

	public void setCtaOrigen(CuentaBancaria ctaOrigen) {
		this.ctaOrigen = ctaOrigen;
	}

	public CuentaBancaria getCtaDestino() {
		return ctaDestino;
	}

	public void setCtaDestino(CuentaBancaria ctaDestino) {
		this.ctaDestino = ctaDestino;
	}

	@Override
	public String toString() {
		return "Transferencia [id=" + id + ", fecha=" + fecha + ", monton=" + monton + ", ctaOrigen=" + ctaOrigen
				+ ", ctaDestino=" + ctaDestino + "]";
	}

	

	


	//setyget

	
	

	
	
	
}