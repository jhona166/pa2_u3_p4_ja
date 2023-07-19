package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;

public interface MatriculaService {
	public void insertar(Matricula matricula);
	public void realizar(String cedula, List<Materia>codigosMateria);
}
