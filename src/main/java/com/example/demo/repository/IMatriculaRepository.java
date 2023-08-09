package com.example.demo.repository;


import com.example.demo.repository.modelo.Matricula;

public interface IMatriculaRepository {
	public void insertar(Matricula matricula);
	public void actualizar(Matricula matricula);
	public void eliminar(String id);
	public Matricula buscar(String id);

}