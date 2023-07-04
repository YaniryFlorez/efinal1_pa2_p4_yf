package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Doctor;
import com.example.demo.repository.model.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class PacienteRepositoryImpl implements PacienteRepository{
	@Autowired
	private EntityManager entityManager;

	@Override
	public void ingresar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery= this.entityManager.createQuery("selec e from e Paciente e where e.cedula=: datocedula");
		myQuery.setParameter("datocedula", cedula);
        return (Paciente) myQuery.getSingleResult() ;
	}
	
}
