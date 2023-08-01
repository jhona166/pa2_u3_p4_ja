package com.example.demo.funcional;

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

}
