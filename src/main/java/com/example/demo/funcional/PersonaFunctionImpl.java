package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonaFunctionImpl implements IPersonaFunction<String, Integer> {
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);



	@Override
	public String aplicar(Integer arg) {
		// TODO Auto-generated method stub
		
		if (arg % 2==0) {
			
			return "es par";
		} else {
			return "es impar";

		}
	
	}

}
