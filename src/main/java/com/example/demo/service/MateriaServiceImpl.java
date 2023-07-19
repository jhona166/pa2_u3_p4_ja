package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MateriaRepo;
import com.example.demo.repository.modelo.Materia;

@Service
public class MateriaServiceImpl implements MateriaService{
	@Autowired
	private MateriaRepo materiaRepo;
	@Override
	public void crear(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepo.insertar(null);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.materiaRepo.eliminar(id);
	}

	@Override
	public void actualizar(Materia estudiante) {
		// TODO Auto-generated method stub
		this.materiaRepo.actualizar(estudiante);
	}

	@Override
	public Materia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.materiaRepo.seleccionar(id);
	}

	@Override
	public Materia buscarPorCodigo(String cedula) {
		// TODO Auto-generated method stub
		return this.materiaRepo.seleccionarPorCodigo(cedula);
	}

}
