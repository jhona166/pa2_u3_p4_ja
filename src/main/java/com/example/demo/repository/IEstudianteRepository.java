package com.example.demo.repository;

import java.util.List;



import com.example.demo.repository.modelo.Estudiante;



public interface IEstudianteRepository {
	

	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante); 
	public void eliminar(String cedula);
	public Estudiante buscar(String cedula);

}
