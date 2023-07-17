package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;


public interface IHotelRepo {
	public void insertar(Hotel hotel);
	public void eliminar(Integer id);
	public void actualizar(Hotel hotel);
	public Hotel seleccionar(Integer id);
	
	public List<Hotel> seleccionarTodos();
	//JOIN
	public List<Hotel> seleccionarInnerJoin();
	public List<Hotel> seleccionarOuterRightJoin();
	public List<Hotel> seleccionarOuterLeftJoin();
	public List<Habitacion> seleccionarHabitacionLeftJoin();
	
	public List<Hotel> seleccionarFullJoin();
	
	//Join Where
	public List<Hotel> seleccionarWhereJoin();
	
	
}
