package com.example.demo.funcional;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosReferenciados {
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	Random genNumb = new Random();
	
	public Integer getId() {
		return 1752083905;
	}
	
	public static String getIdHo() {
		LOG.info("Supplier metodos de refencia");
		return "1752083905";
	}

	//consumer
	
	public void mensaje(Integer arg) {
		LOG.info("" + arg);

	};
	
	public String provincia(String arg) {
		return "nombre provincia: " +arg+"codigo provinca:"+ genNumb.nextInt(1,24);
	};
	
	public void acceptar(String arg) {
		String cadena="Augusto";
		LOG.info(cadena+" "+arg);
	};
	
	
	public void acceptarConsumer(String arg) {
		String cadena="Augusto programacion ";
		LOG.info(cadena+" "+arg);
	};
	//predicate
	public boolean contieneP(String arg) {
		
		if (arg.contains("u")) {
			return true;
		} else {
			return false;
		}
		
	};
	
	public boolean bit(Integer num) {
		if (num==1) {
			LOG.info("encendido");
			return true;
		} else {
			LOG.info("apagado");
			return false;
		}
		
	};
	
	//function
	
	public Integer aplicaF(String arg) {
		if(arg.length()<4) {
			return 1;
		}else {
			return 0;
		}
		
	};
	
	public String concatenarF(Integer arg) {
		return arg + "concatenar";
		
		
	}
	
	
   // unary operator
	//unary operator
	
		public Integer aplicarPesoU(Integer arg) {
			Integer pesoPeligroso = arg +23;
			return pesoPeligroso;
		}



	
	
}
