package com.example.demo.funcional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
		
		
		//*************Metodos High Order**************
		
		

		
		
		MetodosHighOrder highOrder = new MetodosHighOrder();
		//1. Clase
		IPersonaSupplier<String> supplierHO = new PersonaSupplierImpl();
		highOrder.metodo(supplierHO);
		//2. Lambdas
		highOrder.metodo(()->  "1727501510");
		
		
		//Metodos referenciados
		highOrder.metodo(MetodosReferenciados::getIdHO);
		
		
		//***********Metodos high order para consumer **********
		//1.Clase
		MetodosHighOrder.metodoConsumer(new PersonaConsumerImpl(),"Clase Consumer");
		
		MetodosHighOrder.metodoConsumer(cadena->{
			LOG.info("1");
			LOG.info("2");
			LOG.info(cadena);
		},"lambdasConsumer");
		
		
		MetodosHighOrder.metodoConsumer(MetodosReferenciados::aceptar4, "MetodosRefereciados Consumer");

		
		
		//Programacion Funcional o interfazes funcionales java
		//1.Supplier
		Stream<String> lista= Stream.generate(()->"1727501510").limit(10);
		lista.forEach(cadena->LOG.info(cadena));

		
		//2.Consumer
		List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
		listaNumeros.forEach(cadena->{
			LOG.info("1");
			LOG.info("2");
			LOG.info(" "+cadena);
		});

		//3.Predicate
		Stream<Integer> listaFinal=listaNumeros.stream().filter(numero->numero>=5);
		listaFinal.forEach(numero->LOG.info("Valor:"+numero));
		
		//4.Function
		Stream<String> listaCambiada = listaNumeros.stream().map(numero->{
			Integer num=10;
			num=numero+num;
			return "N: "+num;
					});
		
		listaCambiada.forEach(cadena->LOG.info(cadena));
		
		
		//5.Unary Operator
		Stream<Integer> listaCambiada2 = listaNumeros.stream().map(numero->{
			Integer num=10;
			num=numero+num;
			return num;
					});
		listaCambiada2.forEach(cadena->LOG.info(cadena.toString()));
		
		
	
        //Predicate
        //1.- Clase 
        IPersonaPredicate<Integer> predicateHO = new PersonaPredicateImpl();
        highOrder.metodoPredicate(predicateHO, 19);
        //2.- lambdas
        highOrder.metodoPredicate((pre)->Math.subtractExact(pre, 6) <= 8, 16);
        //3.- Metodos referenciados
        highOrder.metodoPredicate(MetodosReferenciados::getPredicateHo, 13);
        //Function
        //1.- Clase 
        IPersonaFunction<String,Integer> functionHO = new PersonaFunctionImpl();
        LOG.info(highOrder.metodoFunction(functionHO, 19));
        //2.- lambdas
        LOG.info(highOrder.metodoFunction((pre)->"JA"+pre, 29));
        LOG.info(highOrder.metodoFunction((pre)->"JA"+pre, 28));
        //3.- Metodos referenciados
        LOG.info(highOrder.metodoFunction(MetodosReferenciados::getFunctionHo, 13));
        //Unary Operator
        //1.- Clase 
        IPersonaUnaryOperatorFunction<Integer> unaryHO = new PersonaUnaryOperatorImpl();
        highOrder.metodoUnaryOperator(unaryHO, 19);
        //2.- lambdas
        highOrder.metodoUnaryOperator((arm)->Math.subtractExact(arm, 12), 49);
        //3.- Metodos referenciados
        highOrder.metodoUnaryOperator(MetodosReferenciados::getUnaryOperatorHo, 36);
	}
}
