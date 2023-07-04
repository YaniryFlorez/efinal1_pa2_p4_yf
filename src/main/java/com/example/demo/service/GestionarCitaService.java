package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface GestionarCitaService {
	
	public void agendarCitaMedica(String NumeroCita, LocalDate fechaCita, BigDecimal valorCita,
			String lugarCita, String idDoctor, String idPaciente);
	
	public void actualizarCitaMedica(String numeroCita, String diagnostico, String receta,
			LocalDate fechaProxima);
	

}
