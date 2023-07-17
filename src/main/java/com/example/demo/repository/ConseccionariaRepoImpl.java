package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Conseccionaria;
import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ConseccionariaRepoImpl implements IConseccionariaRepo{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Conseccionaria conseccionaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(conseccionaria);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Conseccionaria con = this.seleccionar(id);
		this.entityManager.remove(con);
	}

	@Override
	public void actualizar(Conseccionaria conseccionaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(conseccionaria);
	}

	@Override
	public Conseccionaria seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Conseccionaria.class, id);
	}

	@Override
	public List<Conseccionaria> seleccionarInnerJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Conseccionaria> myQuery = this.entityManager.createQuery("SELECT c FROM Conseccionaria c JOIN c.vehiculos ve",Conseccionaria.class);
		List<Conseccionaria> conseccionarias = myQuery.getResultList();
		for (Conseccionaria conseccionaria : conseccionarias) {
			conseccionaria.getVehiculos().size();
		}
		return myQuery.getResultList();
	}

	@Override
	public List<Conseccionaria> seleccionarOuterRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Conseccionaria> myQuery = this.entityManager.createQuery("SELECT c FROM Conseccionaria c RIGHT JOIN c.vehiculos ve",Conseccionaria.class);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Conseccionaria> seleccionarOuterLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Conseccionaria> myQuery = this.entityManager.createQuery("SELECT c FROM Conseccionaria c LEFT JOIN c.vehiculos ve",Conseccionaria.class);
		List<Conseccionaria> conseccionarias =myQuery.getResultList();
		for (Conseccionaria conseccionaria : conseccionarias) {
			conseccionaria.getVehiculos().size();
		}
		
		return myQuery.getResultList();

	}

	@Override
	public List<Conseccionaria> seleccionarFullJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Conseccionaria> myQuery = this.entityManager.createQuery("SELECT h from Conseccionaria h FULL JOIN h.vehiculos ha",Conseccionaria.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Conseccionaria> seleccionarWhereJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Conseccionaria> myQuery = this.entityManager.createQuery("select h FROM Conseccionaria h, Vehiculo ha WHERE h=ha.conseccionaria",Conseccionaria.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Conseccionaria> seleccionarFetchJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Conseccionaria> myQuery=this.entityManager.createQuery("select h from Conseccionaria h join fetch h.vehiculos ha",Conseccionaria.class);

		return myQuery.getResultList();
	
	}





}
