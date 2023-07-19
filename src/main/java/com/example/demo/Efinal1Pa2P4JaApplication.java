package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.CitaMedicaService;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.MatriculaService;
import com.example.demo.service.PacienteService;

@SpringBootApplication
public class Efinal1Pa2P4JaApplication implements CommandLineRunner {
	@Autowired
	private PacienteService pacienteService;

	@Autowired
	private EstudianteService estudianteService;

	@Autowired
	private CitaMedicaService citaMedicaService;
	
	@Autowired 
	private MatriculaService matriculaService;
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estudiante = new Estudiante();
		estudiante.setCedula("1727501515");
		estudiante.setNombre("Daniel");
		estudiante.setApellido("Lopez");
	
		this.estudianteService.crear(estudiante);
		
		List<Materia> materias = new ArrayList<>();
		
		Materia mat1 = new Materia();
		mat1.setCodigo("A1");
		mat1.setCreditos(new BigDecimal(10));
		mat1.setNivel("Sexto");
		

		Materia mat2 = new Materia();
		mat2.setCodigo("A2");
		mat2.setCreditos(new BigDecimal(15));
		mat2.setNivel("Sexto");
		
		materias.add(mat1);
		materias.add(mat2);
		
		
		this.matriculaService.realizar("1727501515", materias);
				

		
		
	}

}
