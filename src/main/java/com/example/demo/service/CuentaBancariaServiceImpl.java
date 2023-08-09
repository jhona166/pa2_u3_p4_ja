package com.example.demo.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.demo.funcional.Main;
import com.example.demo.repository.ICuentaBancariaRepository;
import com.example.demo.repository.modelo.CuentaBancaria;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	private static final Logger LOG = LoggerFactory.getLogger(CuentaBancariaServiceImpl.class);

	@Autowired
	private ICuentaBancariaRepository cuentaBancariaRepository;

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepository.selecionar(id);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepository.actualizar(cuentaBancaria);
	}

	@Override
	public List<CuentaBancaria> reporteCta() {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepository.seleccionarCta();
	}

	@Override
	public CuentaBancaria buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepository.selecionarPorNumero(numero);
	}

	@Override
	public void guardar(CuentaBancaria cta) {
		LOG.info("Hilo Service: "+Thread.currentThread().getName());
		//logica que demora 1 segundo 
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.cuentaBancariaRepository.insertar(cta);
		
	}

	@Override
	public String guardar2(CuentaBancaria cta) {
		// TODO Auto-generated method stub
		LOG.info("Hilo Service: "+Thread.currentThread().getName());
		//logica que demora 1 segundo 
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.cuentaBancariaRepository.insertar(cta);
		return cta.getNumero();
	}

	@Override
	@Async
	public void agregarAsincrono(CuentaBancaria cta) {
		// TODO Auto-generated method stub
		LOG.info("Hilo Service: "+Thread.currentThread().getName());
		//logica que demora 1 segundo 
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.cuentaBancariaRepository.insertar(cta);
		//return cta.getNumero();
	}

	@Override
	@Async
	
	public CompletableFuture<String> agregarAsincrono2(CuentaBancaria cta) {
		// TODO Auto-generated method stub
		//logica que demora 1 segundo 
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				this.cuentaBancariaRepository.insertar(cta);
				return CompletableFuture.completedFuture(cta.getNumero());
	}

	
}