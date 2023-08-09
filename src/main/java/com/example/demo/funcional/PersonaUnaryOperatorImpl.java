package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonaUnaryOperatorImpl implements IPersonaUnaryOperator<Integer> {
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	@Override
	public Integer aplicar(Integer arg) {
		// TODO Auto-generated method stub
		
		
		return 593+arg ;
	}

}
