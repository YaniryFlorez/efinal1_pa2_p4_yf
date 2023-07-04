package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.model.Doctor;

import jakarta.persistence.SequenceGenerator;

@Service
public class DoctorServiceImpl implements DoctorService{
	@Autowired
	private DoctorRepository doctorRepository;
	

	@Override
	public void crear(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.ingresar(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.actualizar(doctor);
	}

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.doctorRepository.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.doctorRepository.eliminar(id);
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.buscarPorCedula(cedula);
	}

}
