package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional

public class HotelRepoImpl implements IHotelRepo {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Hotel hote = this.seleccionar(id);
		this.entityManager.remove(hote);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hotel);
	}

	@Override
	public Hotel seleccionar(Integer id) {
		// TODO Auto-generated method stub
		
		return this.entityManager.find(Hotel.class, id);
	}

	@Override
	public List<Hotel> seleccionarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery("SELECT e FROM Hotel e",Hotel.class);
		List<Hotel> hoteles =  myQuery.getResultList();
		for (Hotel hotel : hoteles) {
			hotel.getHabitaciones().get(2);
			
			System.out.println(hotel.getHabitaciones().size());
		}
		return hoteles;
	}

	@Override
	public List<Hotel> seleccionarInnerJoin() {
		// TODO Auto-generated method stub
		//select * from hotel h right join habitacion ha on h.htl_id = ha.habi_id_hotel
		//SELECT h from Hotel h JOIN h.habitaciones ha 
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery("SELECT h from Hotel h JOIN h.habitaciones ha",Hotel.class);
		List<Hotel> hoteles =  myQuery.getResultList();
		for (Hotel hotel : hoteles) {
			//hotel.getHabitaciones().size();
			
			System.out.println(hotel.getHabitaciones().size());
		}
				return myQuery.getResultList();
	}

}
