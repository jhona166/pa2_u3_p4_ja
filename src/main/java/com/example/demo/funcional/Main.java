package com.example.demo.funcional;

import java.lang.ProcessHandle.Info;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

public class Main {
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
	IPersona per = new PersonaImpl();
	per.caminar();
	
	//1. SUPPLIER
	//Clases:
	IPersonaSupplier<String> supplier1 = new PersonaSupplierImpl();
	LOG.info("Supplier clase: "+supplier1.getId());
	supplier1.getId();
	LOG.info("Supplier lambda: "+supplier1.getId());
	
	//Lambdas
	IPersonaSupplier<String> supplier2 = ()->  "1727501510";
	LOG.info("Supplier lambda: "+supplier2.getId());
	
	IPersonaSupplier<String> supplier3 = ()-> {	
	String cedula ="1727501510";
	cedula=cedula+"zzzzz";
	return cedula; 
		
	};
	
	
	//Metodos Referenciados
	MetodosReferenciados metodos = new MetodosReferenciados();
	IPersonaSupplier<Integer> supplier4 = metodos::getId;
	
	LOG.info("Supplier metodo referenciado: "+supplier4.getId());
	
	//2.Consumer
	LOG.info("Consumer : "+supplier2.getId());
	IPersonaConsumer<String> consumer1 = new PersonaConsumerImpl();
	LOG.info("Consumer clase: ");
	consumer1.accept("Jhonatan Altamirano");
			
	
	//Lambda
	IPersonaConsumer<String> consumer2 = cadena->{
		LOG.info("1");
		LOG.info("2");
		LOG.info("3");
		LOG.info(cadena);
		
	}; 
	LOG.info("Consumer lambda: ");
	consumer2.accept("Jhonatan Altamirano2");
			
	//Lambdas M. referenciados
	
	IPersonaConsumer<String> consumer3 = metodos::aceptar;
	LOG.info("Consumer metodos referenciados ");
	consumer3.accept("A");
	
	
	//3. Predicate
	//Lambdas
	IPersonaPredicate<Integer> predicate1 = valor->valor.compareTo(8)==0;
	LOG.info("Predicate lambda: "+predicate1.evaluar(4));
	
	IPersonaPredicate<Integer> predicate2 = valor->{
		Integer valor2 =10;
		valor = valor+valor2;
		if(valor.compareTo(100)>0) {
			return true;
	}else{
		return false;
	}
	};
	LOG.info("Predicate lambda: "+predicate1.evaluar(80));
	

	
	

	//Lambdas ejer

		
		IPersonaPredicate<String> predicate3 = cadena->cadena.contains("h");
		LOG.info("Predicate lambda: "+predicate3.evaluar("Jhonatan"));
		
	//Ejer ing
	
		IPersonaPredicate<String> predicate4 = letra->"Jhonatan".contains(letra);
		LOG.info("Predicate lambda4: "+predicate4.evaluar("z"));
	
	//BiPredicate

		IPersonaBiPredicate<String,String> predicate5 = (letra,cadena)->cadena.contains(letra);
		LOG.info("Predicate lambda5: "+predicate5.evaluar("z","Jhonatan"));
	
	//4.Function
		IPersonaFunction<String, Integer> function = numero->numero.toString();
		LOG.info("Function lambda5: "+function.aplicar(8));
		
		
		
		IPersonaFunction<String, Integer> function1 = numero->{
			String valorFinal= numero.toString().concat("valor");
			return valorFinal;
		};
	//Metodos referenciales function	
		MetodosReferenciados metodos1 = new MetodosReferenciados();
		IPersonaFunction<String,String> fuction2 = metodos1::aceptar1;
		LOG.info("Function metodos referenciados ");
		fuction2.aplicar("Jhonatan Altamirano");
		
			
		
		
		
		LOG.info("Function lambda: "+function1.aplicar(10));
		
		//5. Unary Operator
		IPersonaUnaryOperatorFunction<Integer> unary =numero-> numero +(numero*2);
		LOG.info("Unary lambda: "+unary.aplicar(3));
		
		IPersonaUnaryFunction<Integer> unary2 =numero-> numero +(numero*2);
		LOG.info("Unary lambda: "+unary.aplicar(3));
		
	//Metodos referenciales unaryOperator
		
		MetodosReferenciados metodos2 = new MetodosReferenciados();
		IPersonaUnaryFunction<Integer> unaryOperator = metodos1::aceptar1;
		LOG.info("Unary metodos referenciados ");
		unaryOperator.aplicar(2);
	}
}
