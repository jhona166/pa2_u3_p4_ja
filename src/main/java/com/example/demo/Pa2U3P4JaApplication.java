package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		Propietario prop = new Propietario();
		prop.setNombre("J");
		prop.setApellido("A");
		prop.setCedula("1");
		
		this.iPropietarioService.agregar(prop);
		
	}
}
