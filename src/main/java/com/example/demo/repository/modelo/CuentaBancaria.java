package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cuentaBancaria")
public class CuentaBancaria {
	
	@GeneratedValue(generator = "seq_cuentaBancaria",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_cuentaBancaria",sequenceName = "seq_cuentaBancaria",allocationSize = 1)

	
	@Id
	@Column(name="cta_id")
	private Integer id;
	@Column(name="cta_numero")
	private String numero;
	@Column(name="cta_saldo")
	private BigDecimal saldo;
	@Column(name="cta_tipo")
	private String tipo;
	
	
	@OneToMany(mappedBy = "ctaOrigen",cascade = CascadeType.ALL)
	private List<Transferencia> transferenciaOrigen;
	
	@OneToMany(mappedBy = "ctaDestino",cascade = CascadeType.ALL)
	private List<Transferencia> transferenciaDestino;
	

	
	@ManyToOne
	@JoinColumn(name="propietario_id")
	private Propietario propietario;
	
	
	//setyget
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public BigDecimal getSaldo() {
		return saldo;
	}


	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Propietario getPropietario() {
		return propietario;
	}


	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}


	public List<Transferencia> getTransferenciaOrigen() {
		return transferenciaOrigen;
	}


	public void setTransferenciaOrigen(List<Transferencia> transferenciaOrigen) {
		this.transferenciaOrigen = transferenciaOrigen;
	}


	public List<Transferencia> getTransferenciaDestino() {
		return transferenciaDestino;
	}


	public void setTransferenciaDestino(List<Transferencia> transferenciaDestino) {
		this.transferenciaDestino = transferenciaDestino;
	}


	@Override
	public String toString() {
		return "CuentaBancaria [id=" + id + ", numero=" + numero + ", saldo=" + saldo + ", tipo=" + tipo
				+ ", transferenciaOrigen=" + transferenciaOrigen + ", transferenciaDestino=" + transferenciaDestino
				+ ", propietario=" + propietario + "]";
	}


	


	
	
	
	
	

}