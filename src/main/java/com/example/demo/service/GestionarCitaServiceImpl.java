package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.model.CitaMedica;
import com.example.demo.repository.model.Doctor;
import com.example.demo.repository.model.Paciente;

@Service
public class GestionarCitaServiceImpl implements GestionarCitaService{
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PacienteService pacienteService;
	
	@Autowired
	private CitaMedicaService citaMedicaService;
	

	@Override
	public void agendarCitaMedica(String NumeroCita, LocalDate fechaCita, BigDecimal valorCita, String lugarCita,
			String idDoctor, String idPaciente) {
		// TODO Auto-generated method stub
		Doctor docbuscado =this.doctorService.buscarPorCedula(idDoctor);
		Paciente pacbuscado =this.pacienteService.buscarPorCedula(idPaciente);
		CitaMedica citaMed= new CitaMedica();
		
		citaMed.setNumero(NumeroCita);
		citaMed.setFechaCit(fechaCita);
		citaMed.setValor(valorCita);
		citaMed.setLugar(lugarCita);
		citaMed.setDoctor(docbuscado);
	    citaMed.setPaciente(pacbuscado);
		citaMed.setDiagnostico("Tratamiento");
		citaMed.setReceta("medicamentos");
		citaMed.setFechaProxima(LocalDate.of(2023, 11, 12));



	}

	@Override
	public void actualizarCitaMedica(String numeroCita, String diagnostico, String receta, LocalDate fechaProxima) {
		// TODO Auto-generated method stub
		
		
	}
	
	

}

