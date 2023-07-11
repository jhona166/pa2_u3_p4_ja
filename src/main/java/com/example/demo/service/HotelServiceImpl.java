package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHotelRepo;

import com.example.demo.repository.modelo.Hotel;

@Service 
public class HotelServiceImpl implements HotelService{
	@Autowired 
	private IHotelRepo hotelRepo;
	@Override
	public void crear(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.insertar(hotel);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepo.eliminar(id);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
	this.hotelRepo.actualizar(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionar(id);
	}

	@Override
	public List<Hotel> seleccionarTodos() {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionarTodos();
	}

	@Override
	public List<Hotel> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionarInnerJoin();
	}



}
