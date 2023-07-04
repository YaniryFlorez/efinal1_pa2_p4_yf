package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CitaMedicaRepository;
import com.example.demo.repository.model.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements CitaMedicaRepository{
	
	@Autowired
	private CitaMedicaRepository citaMedicaRepository;
	

	@Override
	public void ingresar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.ingresar(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.actualizar(citaMedica);
	}

	@Override
	public CitaMedica buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.eliminar(id);
	}

	
}
