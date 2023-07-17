package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Conseccionaria;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

public interface HotelService {
	public void crear(Hotel hotel);
	public void borrar(Integer id);
	public void actualizar(Hotel hotel);
	public Hotel buscar(Integer id);
	public List<Hotel> seleccionarTodos();
	
	public List<Hotel> buscarInnerJoin();
	public List<Hotel> buscarOuterRightJoin();
	public List<Hotel> buscarLeftJoin();
	public List<Habitacion> seleccionarHabitacionLeftJoin();
	
	public List<Hotel> buscarFullJoin();
	public List<Hotel> buscarWhereJoin();
}
