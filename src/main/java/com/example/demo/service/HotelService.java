package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Hotel;

public interface HotelService {
	public void crear(Hotel hotel);
	public void borrar(Integer id);
	public void actualizar(Hotel hotel);
	public Hotel buscar(Integer id);
	public List<Hotel> seleccionarTodos();
	
	public List<Hotel> buscarInnerJoin();
}
