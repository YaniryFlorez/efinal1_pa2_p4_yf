package com.example.demo.repository;

import com.example.demo.repository.model.Paciente;

public interface PacienteRepository {

	public void ingresar(Paciente paciente);
	public void actualizar(Paciente paciente );
	public Paciente buscar(Integer id);
	public void eliminar(Integer id);
	
	public Paciente buscarPorCedula(String cedula);

}
