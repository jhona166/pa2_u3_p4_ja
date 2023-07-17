package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Conseccionaria;
import com.example.demo.repository.modelo.Vehiculo;

public interface ConseccionariaService {
	public void crear(Conseccionaria conseccionaria);
	public void borrar(Integer id);
	public void actualizar(Conseccionaria conseccionaria);
	public Conseccionaria buscar(Integer id);
	
	public List<Conseccionaria> buscarInnerJoin();
	public List<Conseccionaria> buscarOuterRightJoin();
	public List<Conseccionaria> buscarOuterLeftJoin();
	
	public List<Conseccionaria> buscarFullJoin();
	public List<Conseccionaria> buscarWhereJoin();
	public List<Conseccionaria> buscarFetchJoin();
}
