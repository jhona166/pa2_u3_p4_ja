package com.example.demo.funcional;

public class PersonaSupplierImpl implements IPersonaSupplier<String>{

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		String cedula ="71322354";
		cedula = cedula +"222222222";
		return cedula;
	}

}
