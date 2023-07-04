package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class DoctorRepositoryImpl implements DoctorRepository{
	
	@Autowired
	private EntityManager entityManager;
	

	@Override
	public void ingresar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
		
	}

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery= this.entityManager.createQuery("selec e from e Doctor e where e.cedula=: datocedula");
		myQuery.setParameter("datocedula", cedula);
        return (Doctor) myQuery.getSingleResult() ;
		
	}

}
