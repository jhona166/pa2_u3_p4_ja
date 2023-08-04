package com.example.demo.funcional;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosReferenciados {
	
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	public Integer getId() {
	return 8;
	}
	public void aceptar(String arg) {
		String cadena ="Jhonatan";
		LOG.info(cadena+" "+arg);
	}
	public String aceptar1(String arg) {
		String cadena ="Fuction Metodos referenciados";
		LOG.info(cadena+" "+arg);
		return cadena;
	}
	
	public static String getIdHO() {
		LOG.info("Metodos referenciados y HO");
		return "Jhonatan Altamirano";
	}
	
	public Integer aceptar1(Integer arg) {
		Integer numero =8;
		numero = numero*5;
		LOG.info("Unary Operator"+" "+numero);
		return numero;
	}
	
	public static void aceptar4(String arg) {
		String cadena ="Jhonatan";
		LOG.info(cadena+" "+arg);
	}
	  public static Boolean getPredicateHo(Integer dato){
	        LOG.info("metodos referenciado predicate HO");
	        return (9 >= dato);
	    }
	    public static String getFunctionHo(Integer dato){
	        LOG.info("metodos referenciado function HO");
	        return "ret met ref Funtion: "+dato;
	    }
	    public static Integer getUnaryOperatorHo(Integer dato){
	        LOG.info("metodos referenciado unary Operator HO");
	        return Math.subtractExact(dato, 9);
	    }

}
