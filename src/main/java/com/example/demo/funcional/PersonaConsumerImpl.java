package com.example.demo.funcional;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonaConsumerImpl implements IPersonaConsumer<String> {
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	

	@Override
	public void accept(String arg) {
		// TODO Auto-generated method stub
		LOG.info(arg);
	}

}
