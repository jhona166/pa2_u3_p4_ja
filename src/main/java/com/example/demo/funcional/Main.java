package com.example.demo.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		MetodosHighOrder methigh=new MetodosHighOrder();
		MetodosReferenciados methRefer=new MetodosReferenciados();
		
		/*
		 * //supplier
		 * 
		 * Stream<Integer> cedula = Stream.generate(methRefer::getId); List<Integer>
		 * cedulaList = cedula.limit(1).collect(Collectors.toList());
		 * 
		 * LOG.info("supplier"+ cedulaList);
		 * 
		 * //Consumer
		 * 
		 * List<String> listProvincia =
		 * Arrays.asList("Quito ","Ambato ","Cotopaxi ","Esmeraldas ");
		 * listProvincia.replaceAll(methRefer::provincia); LOG.info("supplier"+
		 * listProvincia);
		 * 
		 * //predicate List<Integer> bit = Arrays.asList(1,0,0,1,1,0,1,0,1);
		 * Stream<Integer> listbit=bit.stream().filter(methRefer::bit);
		 * listbit.forEach(methRefer::mensaje); LOG.info("predicate"+listbit);
		 * 
		 * //function Stream<Integer> listfunction =
		 * listProvincia.stream().map(methRefer::aplicaF);
		 * listfunction.forEach(methRefer::mensaje);
		 * 
		 * //Unary Operator List<Integer> listNum =
		 * Arrays.asList(3,2,1,4,3,5,7,8,3,5,6,12,32); Stream<Integer>
		 * listUnary=listNum.stream().map( numero->{ //sumamos el 2 y sacamos el modulo
		 * del numero Integer num=2; num=(numero+num)%12; return num; } );
		 * listUnary.forEach(cadena->LOG.info(cadena.toString()));
		 */
		
		
		//TAREA 17
	
		//Supplier
	
		IPersonaSupplier<String> supplier = new PersonaSupplierImpl();
		LOG.info("Class Suppler :");

		methigh.metodo(supplier);
		//2. lambda
		methigh.metodo(()->"1752083905");
		methigh.metodo(()->{
			String cedula = "1752083905";
					cedula=cedula + "  inicia 17 es pichincha";
					return cedula;
		});
		
		
		methigh.metodo(MetodosReferenciados::getIdHo);
		
		
		
		//Consumer
		IPersonaConsumer<String> consumer = new PersonaConsumerImpl();
		LOG.info("Class Consumer :");
		methigh.metodoConsumer(consumer, "Class Consumer");
		LOG.info("Consumer lambda");
		methigh.metodoConsumer(cadena -> LOG.info(cadena),"lambda");
		LOG.info("Metodos Referenciados Consumer");
		methigh.metodoConsumer(methRefer::acceptarConsumer, "metodos referenciados");
		
		
		//Predicate 
		LOG.info("Class Predicate :");
		IPersonaPredicate<String> predicado= new PersonaPredicateImpl();
		methigh.metodoPredicate(predicado, "predicate");
		
		LOG.info("Predicate Lambda :");
		methigh.metodoPredicate(arg->{
			if (arg.contains("o")) {
				return true;
			} else {
				return false;
			}
		}, "predicate");
		
		
		LOG.info("Predicate metodos referenciados");
		methigh.metodoPredicate(methRefer::contieneP, "predicate");
		
		//Function
		LOG.info("Class Function :");
		IPersonaFunction<String, Integer> function = new PersonaFunctionImpl();
		
		methigh.metodoFunction(function, 1);
		
		LOG.info("Function lambda");
		methigh.metodoFunction(num->{
			String boton= num+"apagado";
			return boton;
		}
		, 0);
		LOG.info("Metodos referenciados ");
		methigh.metodoFunction(methRefer::concatenarF, 1);
	
		//Unary Operator
		
		LOG.info("Class Unary Operator");
		IPersonaUnaryOperator<Integer> unaryOperator = new PersonaUnaryOperatorImpl();
		methigh.metodoUnaryOperator(unaryOperator, 1);
		LOG.info("Lambda");
		methigh.metodoUnaryOperator(variable->{
			Integer num=variable % 12;
			return num;
		}
				
				,2);
		
		LOG.info("metodos referencia");
		methigh.metodoUnaryOperator(methRefer::aplicarPesoU, 60);
		
		
		
	}
}



























