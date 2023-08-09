package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.funcional.Main;
import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Transferencia;
import com.example.demo.service.ICuentaBancariaService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.ITransferenciaService;

@SpringBootApplication
@EnableAsync
public class Pa2U3P4AsJaApplication implements CommandLineRunner {
	@Autowired
	private IHotelService hotelService;

	@Autowired
	private IPropietarioService propietarioService;

	@Autowired
	private ITransferenciaService transferenciaService;
	@Autowired
	private ICuentaBancariaService cuentaBancariaService;

	private static final Logger LOG = LoggerFactory.getLogger(Pa2U3P4AsJaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4AsJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("main: " + TransactionSynchronizationManager.isActualTransactionActive());
		
		
		LOG.info("Hilo "+Thread.currentThread().getName());

		/*
		 * //tiempo inicio
		 * 
		 * long tiempoInicial= System.currentTimeMillis();
		 * 
		 * for (int i = 0; i <=100; i++) { CuentaBancaria ctaOrigen = new
		 * CuentaBancaria();
		 * 
		 * ctaOrigen.setNumero(String.valueOf(i));
		 * 
		 * ctaOrigen.setSaldo(new BigDecimal(100));
		 * 
		 * ctaOrigen.setTipo("A");
		 * 
		 * this.cuentaBancariaService.guardar(ctaOrigen);
		 * 
		 * } //tiempo fin long tiempoFinal= System.currentTimeMillis(); long
		 * tiempoTranscurrido=(tiempoFinal-tiempoInicial)/1000;
		 * LOG.info("Tiempo Transcurrido: "+tiempoTranscurrido);
		 * LOG.info("Tiempo Transcurrido: "+(tiempoFinal-tiempoInicial));
		 */
		
		/*
		 * //tiempo inicio
		 * 
		 * long tiempoInicial = System.currentTimeMillis();
		 * 
		 * List<CuentaBancaria> list=new ArrayList<>();
		 * 
		 * for (int i = 1; i <=100; i++) { CuentaBancaria ctaOrigen = new
		 * CuentaBancaria();
		 * 
		 * ctaOrigen.setNumero(String.valueOf(i));
		 * 
		 * ctaOrigen.setSaldo(new BigDecimal(100));
		 * 
		 * ctaOrigen.setTipo("A"); list.add(ctaOrigen); } //
		 * list.stream().forEach(cta->this.cuentaBancariaService.guardar(cta));
		 * list.parallelStream().forEach(cta->this.cuentaBancariaService.guardar(cta));
		 * 
		 * //tiempo fin long tiempoFinal= System.currentTimeMillis(); long
		 * tiempoTranscurrido=(tiempoFinal-tiempoInicial)/1000;
		 * LOG.info("Tiempo Transcurrido: "+tiempoTranscurrido);
		 * LOG.info("Tiempo Transcurrido: "+(tiempoFinal-tiempoInicial));
		 */
        
        
        
		/*
		//tiempo inicio 
		
		long tiempoInicial = System.currentTimeMillis();
		
		List<CuentaBancaria> list=new ArrayList<>();
        
        for (int i = 1; i <=100; i++) {
    		CuentaBancaria ctaOrigen = new CuentaBancaria();

            ctaOrigen.setNumero(String.valueOf(i));

            ctaOrigen.setSaldo(new BigDecimal(100));

            ctaOrigen.setTipo("A");
            list.add(ctaOrigen);
            this.cuentaBancariaService.agregarAsincrono(ctaOrigen);
		}
        //no se ocupa el multihilo
        // list.stream().forEach(cta->this.cuentaBancariaService.guardar(cta));
        //ocupacion del multihilo
        //list.parallelStream().forEach(cta->this.cuentaBancariaService.guardar2(cta));
        
        
        List<String> listFinal =list.parallelStream().map(cta->this.cuentaBancariaService.guardar2(cta)).collect(Collectors.toList());
        //LOG.info("Se guardaron las siguientes cuentas");
        //listFinal.forEach(cadena->LOG.info(cadena));
        
        //tiempo fin
        long tiempoFinal= System.currentTimeMillis();
        long tiempoTranscurrido=(tiempoFinal-tiempoInicial)/1000;
        LOG.info("Tiempo Transcurrido: "+tiempoTranscurrido);
        LOG.info("Tiempo Transcurrido: "+(tiempoFinal-tiempoInicial));
        
        LOG.info("Se termino todo el proceso");
        
        */
	//tiempo inicio 
		//Asincrono futuro con respuesta
		long tiempoInicial = System.currentTimeMillis();
		List<CompletableFuture<String>> listaRespuesta = new ArrayList<>();
		List<CuentaBancaria> list=new ArrayList<>();
        
        for (int i = 1; i <=100; i++) {
    		CuentaBancaria ctaOrigen = new CuentaBancaria();

            ctaOrigen.setNumero(String.valueOf(i));

            ctaOrigen.setSaldo(new BigDecimal(100));

            ctaOrigen.setTipo("A");
            list.add(ctaOrigen);
            CompletableFuture<String> respuesta=this.cuentaBancariaService.agregarAsincrono2(ctaOrigen);
            listaRespuesta.add(respuesta);
		}
        
        //Sentencia que espera que termine de procesarse todos los hilos para obtener la respuesta
        CompletableFuture.allOf(listaRespuesta.get(0),listaRespuesta.get(1),listaRespuesta.get(2),listaRespuesta.get(3),
        						listaRespuesta.get(4),listaRespuesta.get(5),listaRespuesta.get(6),listaRespuesta.get(7),
        						listaRespuesta.get(8),listaRespuesta.get(9));
        LOG.info("Respuesta 0: "+listaRespuesta.get(0).get());
        
        //Asyncrono futuro con respuesta
        //no se ocupa el multihilo
        // list.stream().forEach(cta->this.cuentaBancariaService.guardar(cta));
        //ocupacion del multihilo
        //list.parallelStream().forEach(cta->this.cuentaBancariaService.guardar2(cta));
        
        
        List<String> listFinal =list.parallelStream().map(cta->this.cuentaBancariaService.guardar2(cta)).collect(Collectors.toList());
        //LOG.info("Se guardaron las siguientes cuentas");
        //listFinal.forEach(cadena->LOG.info(cadena));
        
        //tiempo fin
        long tiempoFinal= System.currentTimeMillis();
        long tiempoTranscurrido=(tiempoFinal-tiempoInicial)/1000;
        LOG.info("Tiempo Transcurrido: "+tiempoTranscurrido);
        LOG.info("Tiempo Transcurrido: "+(tiempoFinal-tiempoInicial));
        
        LOG.info("Se termino todo el proceso");
        
        
      
       
        
	
	}
	
	
}
