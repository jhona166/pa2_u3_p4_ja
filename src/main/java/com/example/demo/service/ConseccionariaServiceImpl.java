package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IConseccionariaRepo;
import com.example.demo.repository.modelo.Conseccionaria;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class ConseccionariaServiceImpl implements ConseccionariaService{

	@Autowired
	private IConseccionariaRepo conseccionariaRepo;
	
	@Override
	public void crear(Conseccionaria conseccionaria) {
		// TODO Auto-generated method stub
		this.conseccionariaRepo.insertar(conseccionaria);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.conseccionariaRepo.eliminar(id);
	}

	@Override
	public void actualizar(Conseccionaria conseccionaria) {
		// TODO Auto-generated method stub
		this.conseccionariaRepo.actualizar(conseccionaria);
	}

	@Override
	public Conseccionaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.conseccionariaRepo.seleccionar(id);
	}

	@Override
	public List<Conseccionaria> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.conseccionariaRepo.seleccionarInnerJoin();
	}

	@Override
	public List<Conseccionaria> buscarOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.conseccionariaRepo.seleccionarOuterRightJoin();
	}

	@Override
	public List<Conseccionaria> buscarOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.conseccionariaRepo.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Conseccionaria> buscarFullJoin() {
		// TODO Auto-generated method stub
		return this.conseccionariaRepo.seleccionarFullJoin();
	}

	@Override
	public List<Conseccionaria> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.conseccionariaRepo.seleccionarWhereJoin();
	}

	@Override
	public List<Conseccionaria> buscarFetchJoin() {
		// TODO Auto-generated method stub
		return this.conseccionariaRepo.seleccionarFetchJoin();
	}

	
}
