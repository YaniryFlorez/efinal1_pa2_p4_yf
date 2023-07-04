package com.example.demo.service;

import com.example.demo.repository.model.Doctor;
import com.example.demo.repository.model.Paciente;

public interface PacienteService {

	public void crear(Paciente paciente);
	public void actualizar(Paciente paciente );
	public Paciente buscar(Integer id);
	public void borrar(Integer id);
	
	public Paciente buscarPorCedula(String cedula);

}
