package com.example.demo.funcional;

import java.util.function.Supplier;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosHighOrder  {
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	
	
	public void metodo(IPersonaSupplier<String> funcion){
		funcion.getId();
		LOG.info("High Order Suplier"+ funcion.getId());
	}


	public void metodoConsumer(IPersonaConsumer<String> funcionConsumer,String consumer){
		
		
		funcionConsumer.accept(consumer);
		LOG.info("High Order Consumer: ");
	}
	
	public void metodoPredicate(IPersonaPredicate<String> funcionPredicate,String predicate) {
	
		funcionPredicate.evaluar(predicate);
		LOG.info("High Order Predicate: " + funcionPredicate.evaluar(predicate));
	};
	public void metodoFunction(IPersonaFunction<String, Integer> funcionFunction,Integer function) {
	
		funcionFunction.aplicar(function);
		LOG.info("High Order Function: " + funcionFunction.aplicar(function) );
		
		
	};
	public void metodoUnaryOperator(IPersonaUnaryOperator<Integer> funcionUnaryOperator, Integer unaryOperator){
	
		funcionUnaryOperator.aplicar(unaryOperator);
		LOG.info("High Order Unary Operator: " + funcionUnaryOperator.aplicar(unaryOperator));
		
	}


	

	
	


	
	
	
	
}
