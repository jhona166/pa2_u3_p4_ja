package com.example.demo.service;

import com.example.demo.repository.modelo.Materia;

public interface MateriaService {
	public void crear(Materia materia);
	public void borrar(Integer id);
	public void actualizar(Materia materia);
	public Materia buscar(Integer id);
	public Materia buscarPorCodigo(String codigo); 
	}
