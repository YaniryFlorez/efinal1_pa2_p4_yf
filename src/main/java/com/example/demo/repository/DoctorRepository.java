package com.example.demo.repository;

import com.example.demo.repository.model.Doctor;

public interface DoctorRepository {
	public void ingresar(Doctor doctor);
	public void actualizar(Doctor doctor);
	public Doctor buscar(Integer id);
	public void eliminar(Integer id);
	
	public Doctor buscarPorCedula(String cedula);
	
	

}
