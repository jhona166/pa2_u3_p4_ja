package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepo;
import com.example.demo.repository.MateriaRepo;
import com.example.demo.repository.MatriculaRepo;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;

@Service

public class MatriculaServiceImpl implements MatriculaService{
	@Autowired
	private MatriculaRepo matriculaRepo;
	@Autowired
	private EstudianteRepo estudianteRepo;
	@Autowired 
	private MateriaRepo materiaRepo;
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepo.insertar(matricula);
	}

	@Override
	public void realizar(String cedula, List<Materia> codigosMateria) {
		// TODO Auto-generated method stub
		Estudiante estu = this.estudianteRepo.seleccionarPorCedula(cedula);
		String codigoMateriaTemp= "A1";
		List<Materia> filtrado = codigosMateria;
		
		
		for (Materia materia : filtrado) {
			if(materia.equals(codigoMateriaTemp)) {
				codigoMateriaTemp = materia.getCodigo();
				 Materia mate = this.materiaRepo.seleccionarPorCodigo(codigoMateriaTemp);
				 Matricula mat = new Matricula();
				 mat.setEstudiante(estu);
				 mat.setMateria(mate);
				
				 this.matriculaRepo.insertar(mat);
					
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		
		 
		 
		
		 
		
	}

}
