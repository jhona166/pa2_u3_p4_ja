package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.service.ICuentaBancariaService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.ITransferenciaService;

@SpringBootApplication
public class Pa2U3P4JaApplication implements CommandLineRunner{

	
	@Autowired
	private ITransferenciaService transferenciaService;

	@Autowired
	private ICuentaBancariaService bancariaService;

	@Autowired
	private IPropietarioService iPropietarioService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive();
		System.out.println("main"+org.springframework.transaction.support.TransactionSynchronizationManager.isActualTransactionActive());
		/*
		CuentaBancaria ctaOrigen = new CuentaBancaria();
		ctaOrigen.setNumero("1");
		ctaOrigen.setSaldo(new BigDecimal(100));
		ctaOrigen.setTipo("A");
		this.bancariaService.agregar(ctaOrigen);
		

		CuentaBancaria ctaDestino= new CuentaBancaria();
		ctaDestino.setNumero("2");
		ctaDestino.setSaldo(new BigDecimal(200));
		ctaDestino.setTipo("A");
		this.bancariaService.agregar(ctaDestino);
		*/
		this.transferenciaService.realizarTransferencia("1", "2",new BigDecimal(10));
		
	}
}
