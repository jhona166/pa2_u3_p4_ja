package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Conseccionaria;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.Vehiculo;

public interface IConseccionariaRepo {
	public void insertar(Conseccionaria conseccionaria);
	public void eliminar(Integer id);
	public void actualizar(Conseccionaria conseccionaria);
	public Conseccionaria seleccionar(Integer id);
	
//	INNER JOIN
	public List<Conseccionaria> seleccionarInnerJoin();
//	RIGTH JOIN
	public List<Conseccionaria> seleccionarOuterRightJoin();
//	LEFT JOIN
	public List<Conseccionaria> seleccionarOuterLeftJoin();

//	FULL JOIN
	public List<Conseccionaria> seleccionarFullJoin();
	
//	JOIN WHERE
	public List<Conseccionaria> seleccionarWhereJoin();
	
//	JOIN FECTH
	public List<Conseccionaria> seleccionarFetchJoin();
}
