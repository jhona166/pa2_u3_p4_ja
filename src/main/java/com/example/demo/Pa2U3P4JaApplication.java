package com.example.demo;

import java.util.List;

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
		List<Hotel> listaHotel1 =this.hotelService.buscarInnerJoin();


	       
        System.out.println("Buscar Habitacion INNER Join");
		for (Hotel hotel : listaHotel1) {
			System.out.println(hotel);
		}
		
		
		List<Hotel> listaHotel =this.hotelService.buscarFullJoin();


       
        System.out.println("Buscar Habitacion FULL Join");
		for (Hotel hotel : listaHotel) {
			if(hotel==null) {
				System.out.println("No existe aun un hotel");
			}else {
				System.out.println(hotel.getNombre());
				
			}
		}
		
		
		List<Habitacion> listaHabi =this.hotelService.seleccionarHabitacionLeftJoin();


	       
        System.out.println("Buscar Habitacion LeftJoin");
		for (Habitacion habitacion : listaHabi) {
			System.out.println(habitacion);
		}
		
		
		System.out.println("Buscar con Join Where");
		
		List<Hotel> listaHotel4 =this.hotelService.buscarWhereJoin();

        System.out.println("Buscar Habitacion WHERE Join");
		for (Hotel hotel : listaHotel4) {
			System.out.println(hotel);
		}
		
		
		List<Hotel> listaHotel6 =this.hotelService.buscarLeftJoin();


	       
        System.out.println("Buscar Habitacion Left Join");
		for (Hotel hotel : listaHotel6) {
			System.out.println(hotel);
		}
		
		List<Hotel> listaHotel7 =this.hotelService.buscarOuterRightJoin();


	       
        System.out.println("Buscar Habitacion Right Join");
		for (Hotel hotel : listaHotel7) {
			System.out.println(hotel);
		}
		
	}

}
