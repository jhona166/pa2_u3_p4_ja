package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Conseccionaria;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.ConseccionariaService;

@SpringBootApplication
public class Pa2U3P4JaApplication implements CommandLineRunner{

	@Autowired
	private ConseccionariaService conseccionariaService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Conseccionaria> listaConseccionarias = this.conseccionariaService.buscarInnerJoin();
		System.out.println("Buscar INNER JOIN");
		for (Conseccionaria conseccionaria : listaConseccionarias) {
		       	System.out.println(conseccionaria);
		       	for (Vehiculo vehiculo:conseccionaria.getVehiculos()) {
					System.out.println(vehiculo.getNombre());
				}
		}
		
		List<Conseccionaria> listaConseccionarias1 = this.conseccionariaService.buscarInnerJoin();
		System.out.println("Buscar INNER JOIN");
		for (Conseccionaria conseccionaria : listaConseccionarias1) {
		       	System.out.println(conseccionaria.getNombre());
		}
		
		
		List<Conseccionaria> listaConseccionarias2 = this.conseccionariaService.buscarOuterRightJoin();
		System.out.println("Buscar OUTER RIGHT JOIN");
		for (Conseccionaria conseccionaria : listaConseccionarias2) {
		    	if(conseccionaria==null) {
		    		System.out.println("Tengo un valor nulo");
		    		
		    	}else {
		    		System.out.println(conseccionaria.getNombre());
		    	} 
		    
		}
	
		List<Conseccionaria> listaConseccionarias3 = this.conseccionariaService.buscarOuterRightJoin();
		System.out.println("Buscar OUTER RIGHT JOIN");
		for (Conseccionaria conseccionaria : listaConseccionarias3) {
		    	if(conseccionaria==null) {
		    		System.out.println("Tengo un valor nulo");
		    		
		    	}else {
		    		System.out.println(conseccionaria.getDireccion());
		    	} 
		    
		}
		

		List<Conseccionaria> listaConseccionarias4 = this.conseccionariaService.buscarOuterLeftJoin();
		System.out.println("Buscar OUTER LEFT JOIN");
		for (Conseccionaria conseccionaria : listaConseccionarias4) {
		    	System.out.println(conseccionaria.getNombre());
	
		}
		
		List<Conseccionaria> listaConseccionarias5 = this.conseccionariaService.buscarOuterLeftJoin();
		System.out.println("Buscar OUTER LEFT JOIN");
		for (Conseccionaria conseccionaria : listaConseccionarias5) {
		    	System.out.println(conseccionaria.getNombre());
		    	for (Vehiculo vehi : conseccionaria.getVehiculos()) {
					System.out.println(vehi.getNombre());
				}
		}
		
		List<Conseccionaria> listaConseccionarias6 = this.conseccionariaService.buscarFullJoin();
		System.out.println("Buscar FULL JOIN");
		for (Conseccionaria conseccionaria : listaConseccionarias6) {
			if(conseccionaria==null) {
				System.out.println("Tengo un valor nulo");
			}else {
				System.out.println(conseccionaria.getNombre());
				
			}
		}
		
		
		List<Conseccionaria> listaConseccionarias7 = this.conseccionariaService.buscarFullJoin();
		System.out.println("Buscar FULL JOIN");
		for (Conseccionaria conseccionaria : listaConseccionarias7) {
			if(conseccionaria==null) {
				System.out.println("Tengo un valor nulo");
			}else {
				System.out.println(conseccionaria.getDireccion());
			}
		}
		
	
		List<Conseccionaria> listaConseccionarias8 = this.conseccionariaService.buscarWhereJoin();
		System.out.println("Buscar Where JOIN");
		for (Conseccionaria conseccionaria : listaConseccionarias8) {
			if(conseccionaria==null) {
				System.out.println("Tengo un valor nulo");
			}else {
				System.out.println(conseccionaria.getNombre());
			}
		}
	
		
		List<Conseccionaria> listaConseccionarias9 = this.conseccionariaService.buscarFetchJoin();
		System.out.println("Buscar Fetch JOIN");
		for (Conseccionaria conseccionaria : listaConseccionarias9) {
			if(conseccionaria==null) {
				System.out.println("Tengo un valor nulo");
			}else {
				System.out.println(conseccionaria.getNombre());
			}
		}

		List<Conseccionaria> listaConseccionarias10 = this.conseccionariaService.buscarFetchJoin();
		System.out.println("Buscar Fetch JOIN");
		for (Conseccionaria conseccionaria : listaConseccionarias10) {
			if(conseccionaria==null) {
				System.out.println("Tengo un valor nulo");
			}else {
				System.out.println(conseccionaria.getTelefono());
			}
		}

		
	}
	
	

}
