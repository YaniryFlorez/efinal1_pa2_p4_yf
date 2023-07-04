package com.example.demo.service;

import com.example.demo.repository.model.CitaMedica;

public interface CitaMedicaService {

	public void crear(CitaMedica citaMedica);
	public void actualizar(CitaMedica citaMedica);
	public CitaMedica buscar(Integer id);
	public void borrar(Integer id);
	
	
}
