package com.example.demo.repository;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepo {
	public void insertar(Estudiante estudiante);
	public void eliminar(Integer id);
	public void actualizar(Estudiante estudiante);
	public Estudiante seleccionar(Integer id);
	public Estudiante seleccionarPorCedula(String cedula); 
		
}
