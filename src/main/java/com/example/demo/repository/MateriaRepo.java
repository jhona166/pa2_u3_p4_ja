package com.example.demo.repository;

import com.example.demo.repository.modelo.Materia;

public interface MateriaRepo {
	public void insertar(Materia materia);
	public void eliminar(Integer id);
	public void actualizar(Materia materia);
	public Materia seleccionar(Integer id);
	public Materia seleccionarPorCodigo(String ceodigo); 
		
}
