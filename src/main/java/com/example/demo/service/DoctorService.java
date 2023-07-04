package com.example.demo.service;

import com.example.demo.repository.model.Doctor;

public interface DoctorService {
	public void crear(Doctor doctor);
	public void actualizar(Doctor doctor);
	public Doctor buscar(Integer id);
	public void borrar(Integer id);
	
	public Doctor buscarPorCedula(String cedula);

	

}
