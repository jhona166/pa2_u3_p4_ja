package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	public CuentaBancaria selecionar(Integer id);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public List<CuentaBancaria> seleccionarCta();
	public CuentaBancaria selecionarPorNumero(String numero);
	public void insertar(CuentaBancaria cta);

}