package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

public class Main {
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
	IPersona per = new PersonaImpl();
	per.caminar();
	
	//1. SUPPLIER
	//Clases:
	IPersonaSupplier<String> supplier1 = new PersonaSupplierImpl();
	LOG.info("Supplier clase: "+supplier1.getId());
	supplier1.getId();
	LOG.info("Supplier lambda: "+supplier1.getId());
	
	//Lambdas
	IPersonaSupplier<String> supplier2 = ()->  "1727501510";
	LOG.info("Supplier lambda: "+supplier2.getId());
	
	IPersonaSupplier<String> supplier3 = ()-> {	
	String cedula ="1727501510";
	cedula=cedula+"zzzzz";
	return cedula; 
		
	};
	
	
	LOG.info("Supplier lambda: "+supplier3.getId());
	
	
	}
}
