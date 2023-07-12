package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHotelRepo;
import com.example.demo.repository.modelo.Habitacion;
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

	@Override
	public List<Hotel> buscarOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionarOuterRightJoin();
	}

	@Override
	public List<Hotel> buscarLeftJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Habitacion> seleccionarHabitacionLeftJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionarHabitacionLeftJoin();
	}

	@Override
	public List<Hotel> buscarFullJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionarFullJoin();
	}

	@Override
	public List<Hotel> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionarWhereJoin();
	}



}
