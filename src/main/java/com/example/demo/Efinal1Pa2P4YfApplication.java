package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.model.Doctor;
import com.example.demo.repository.model.Paciente;
import com.example.demo.service.DoctorService;
import com.example.demo.service.GestionarCitaService;
import com.example.demo.service.PacienteService;

@SpringBootApplication
public class Efinal1Pa2P4YfApplication implements CommandLineRunner{
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private  PacienteService pacienteService;
	
	@Autowired
	private GestionarCitaService gestionarCitaService;
	
	
	//@Autowired
	//private

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4YfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Doctor doc= new Doctor();
		Paciente pac=new Paciente();
/*
		doc.setCedula("123456789");
		doc.setNombre("Mario");
		doc.setApellido("Vargas");
		doc.setFechaNacim(LocalDate.of(1988,10,12));
		doc.setNumeroConsult("C001");
		doc.setCodSenescyt("Sen001");
		doc.setGenero("Masculino");
		
		this.doctorService.crear(doc);
		
		pac.setCedula("1234509876");
		pac.setNombre("Mariana");
		pac.setApellido("Villalva");
		pac.setFechaNacim(LocalDate.of(2001, 11, 24));
		pac.setCodSeguro("001");
		pac.setEstatura(1.60f);
		pac.setPeso(48.3f);
		pac.setGenero("Femenino");
		
		this.pacienteService.crear(pac);

		*/
		//this.citaGestoraService.agendarCitaMedica("t001", LocalDate.of(2023,10, 12), new BigDecimal(12), "Quito", "1734567298", "1723450222");

		this.gestionarCitaService.agendarCitaMedica("cita001", LocalDate.of(2023, 10, 20),
				new BigDecimal(25), "Quito", "123456789", "1234509876");
	}

}




