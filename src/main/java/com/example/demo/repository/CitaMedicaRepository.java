package com.example.demo.repository;

import com.example.demo.repository.model.CitaMedica;

public interface CitaMedicaRepository {

	public void ingresar(CitaMedica citaMedica);
	public void actualizar(CitaMedica citaMedica);
	public CitaMedica buscar(Integer id);
	public void eliminar(Integer id);
	
	
}
