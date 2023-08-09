package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonaPredicateImpl implements IPersonaPredicate<String> {
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	@Override
	public boolean evaluar(String arg) {
		// TODO Auto-generated method stub
		if (arg.contains("a")) {
			return true;
		} else {
			return false;
		}
		
		
	
	}

}
