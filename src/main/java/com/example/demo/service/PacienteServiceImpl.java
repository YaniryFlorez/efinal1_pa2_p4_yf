package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PacienteRepository;
import com.example.demo.repository.model.Paciente;

@Service
public class PacienteServiceImpl implements PacienteService{
	
	@Autowired
	private PacienteRepository pacienteRepository;
	

	@Override
	public void crear(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.ingresar(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.actualizar(paciente);
	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepository.eliminar(id);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.buscarPorCedula(cedula);
	}

}
