package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonaPredicateImpl  implements IPersonaPredicate<Integer> {
    private static final Logger LOG = LoggerFactory.getLogger(PersonaPredicateImpl.class);

    @Override
    public boolean evaluar(Integer arg) {
        LOG.info("Predicate Class:");
        LOG.info(" "+arg+"Es menor que 20");
        return arg<=20;
    }
}
