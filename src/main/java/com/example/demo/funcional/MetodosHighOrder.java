package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosHighOrder {
	
	private static final Logger LOG = LoggerFactory.getLogger(MetodosHighOrder.class);
	
	
	public void metodo(IPersonaSupplier<String> funcion) {
		funcion.getId();
		LOG.info("High Order Suplier"+funcion.getId());
	}
	
	public static void metodoConsumer(IPersonaConsumer<String> funcion,String cadena) {
		funcion.accept(cadena);
	}

    public Boolean metodoPredicate(IPersonaPredicate<Integer> funcion,Integer dato){
        LOG.info("High order predicate ");
        funcion.evaluar(dato);
        return dato <= 9;
    }

    public Integer metodoUnaryOperator(IPersonaUnaryOperatorFunction<Integer> funcion,Integer dato){
        LOG.info("High order unary Operator ");
        funcion.aplicar(dato);
        LOG.info("ret high order");
        return Math.floorMod(dato, 3);
    }
    public static String getFunctionHo(Integer dato){
        LOG.info("metodos referenciado function HO");
        return "ret met ref Funtion: "+dato;
    }
    public String metodoFunction(IPersonaFunction<String,Integer> funcion,Integer dato){
        LOG.info("High order function ");
        funcion.aplicar(dato);
        return "ret high order" + dato;
    }
}
