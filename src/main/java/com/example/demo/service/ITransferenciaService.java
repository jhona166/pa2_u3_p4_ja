package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Transferencia;

public interface ITransferenciaService {
	
	public void guardar(Transferencia transferencia);
	
	
	public void guardarTransferencia(String ctaIdOrigen,String ctaIdDestino,BigDecimal monto);
	public List<Transferencia > reporteCta();

}