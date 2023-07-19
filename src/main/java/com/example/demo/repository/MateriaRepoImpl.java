package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MateriaRepoImpl implements MateriaRepo{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Materia materia) {
		this.entityManager.persist(materia);

	}

	@Override
	public Materia seleccionar(Integer id) {
		return this.entityManager.find(Materia.class, id);
	}


	
	@Override
	public void actualizar(Materia materia) {
		this.entityManager.merge(materia);

	}

	@Override
	public void eliminar(Integer id) {
		Materia materia = this.seleccionar(id);
		this.entityManager.remove(materia);

	}
	
	@Override
	public Materia seleccionarPorCodigo(String codigo) {
		TypedQuery<Materia> myQuery = this.entityManager.createQuery("SELECT e FROM Materia e WHERE e.codigo= :datoCodigo", Materia.class);
		myQuery.setParameter("datoCodigo", codigo);
		return myQuery.getSingleResult();
	}
}
