package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.service.HotelService;

@SpringBootApplication
public class Pa2U3P4JaApplication implements CommandLineRunner{

	
	
	@Autowired
	private HotelService hotelService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		List<Hotel> listaHotel =this.hotelService.buscarOuterRightJoin();
		List<Habitacion> habitaciones = new ArrayList();
		Habitacion habi = new Habitacion();
		habi.setNumero("HA4");
		habi.setValor(new BigDecimal(80));
		
		Habitacion habi1 = new Habitacion();
		habi1.setNumero("HA5");
		habi1.setValor(new BigDecimal(90));

		habitaciones.add(habi);
		habitaciones.add(habi1);
		
		Hotel hote1= new Hotel();
		
		hote1.setNombre("Marriot2");
		hote1.setDireccion("D4");
		hote1.setHabitaciones(habitaciones);
		this.hotelService.crear(hote1);
		System.out.println("Buscar Habitacion INNER Join");
		List<Hotel> listaHotelF =this.hotelService.buscarJoinFetch();
		for (Hotel h : listaHotelF) {
			System.out.println(h.getNombre());
			System.out.println("FETCH Tiene las siguientes habitaciones");
			for (Habitacion ha : h.getHabitaciones()) {
				System.out.println(ha.getNumero()+"con"+ha.getValorIncluidoIva());
			}
			
		}
		
	}
}
