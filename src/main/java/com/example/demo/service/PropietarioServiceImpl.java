package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository propietarioRepository;

	
	@Autowired
	private IPruebaService pruebaService;
	@Override
	//@Transactional(value = TxType.REQUIRED)//sin poner required sin poner value da por defecto
	public void guardar(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("service: "+TransactionSynchronizationManager.isActualTransactionActive());

		//this.propietarioRepository.insertar(propietario);
		this.pruebaService.prueba();
		//this.pruebaService.prueba2();
		//this.pruebaService.pruebaSupports();
		//this.pruebaService.pruebaNotSupported();
		//this.pruebaService.pruebaRequired();
		//this.pruebaService.pruebaRequiresNew();
	
	}
	
	@Transactional(value = TxType.NEVER)
	public void prueba() {
		System.out.println();
		System.out.println(TransactionSynchronizationManager.isActualTransactionActive());

	}

	
	
	
}