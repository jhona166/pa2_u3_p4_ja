package com.example.demo.repository.modelo;

import java.math.BigDecimal;

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
@Table(name="vehiculo")

public class Vehiculo {
	@Id
	@SequenceGenerator(name = "seq_vehiculo", sequenceName = "seq_vehiculo", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vehiculo")
	@Column(name = "vehi_id")
	private Integer id;
	
	@Column(name="vehi_nombre")
	private String nombre;
	
	@Column(name="vehi_precio")
	private BigDecimal precio;
	
	@Column(name="vehi_color")
	private String color;
	
	@ManyToOne()
	@JoinColumn(name="vehi_id_conseccionaria")
	private Conseccionaria conseccionaria;

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", color=" + color
				+ ", conseccionaria=" + conseccionaria + "]";
	}
	
	
	//Set and Get
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the precio
	 */
	public BigDecimal getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the conseccionaria
	 */
	public Conseccionaria getConseccionaria() {
		return conseccionaria;
	}

	/**
	 * @param conseccionaria the conseccionaria to set
	 */
	public void setConseccionaria(Conseccionaria conseccionaria) {
		this.conseccionaria = conseccionaria;
	}
	
	
	
	
	
	
	
	
}
