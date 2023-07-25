package com.example.demo.service;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class PruebaService implements IPruebaService {

	@Override
	
	public void prueba() {
		// TODO Auto-generated method stub
		
		org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive();
		System.out.println(org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("metodo de prueba");
		
	}

	@Override
	@Transactional(value=TxType.MANDATORY)
	public void prueba2() {
		// TODO Auto-generated method stub
		org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive();
		System.out.println(org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("metodo de prueba2");
	}

	@Override
	@Transactional(value=TxType.SUPPORTS)
	public void pruebaSupports() {
		// TODO Auto-generated method stub
		org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive();
		System.out.println("metodo2"+org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("metodo prueba suports");
		
	}

	@Override
	@Transactional(value=TxType.NOT_SUPPORTED)
	public void pruebaNotSuported() {
		// TODO Auto-generated method stub
		org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive();
		System.out.println(org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("metodo prueba not suported");
	}

	@Override
	@Transactional(value=TxType.REQUIRED)
	public void pruebaRequiered() {
		// TODO Auto-generated method stub
		org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive();
		System.out.println(org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("metodo prueba required");
	}

	@Override
	@Transactional(value=TxType.REQUIRES_NEW)
	public void pruebaRequieresNew() {
		// TODO Auto-generated method stub
		org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive();
		System.out.println(org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive());
		System.out.println("metodo prueba requires new");
		
	}

}
