package com.example.demo.service;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	public void crear(Estudiante estudiante);
	public void borrar(Integer id);
	public void actualizar(Estudiante estudiante);
	public Estudiante buscar(Integer id);
	public Estudiante buscarPorCedula(String cedula); 
}
