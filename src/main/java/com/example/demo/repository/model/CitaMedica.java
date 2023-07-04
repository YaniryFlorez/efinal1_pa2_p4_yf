package com.example.demo.repository.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cita_medica")
public class CitaMedica {
	
	@Id
	@GeneratedValue(generator = "seq_cmedi", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_cmedi", sequenceName = "seq_cmedi", allocationSize = 1)
	
	@Column(name="cime_id")
	private Integer id;
	@Column(name="cime_numero_cita")
	private String numero;
	@Column(name="cime_fecha_cita")
	private LocalDate fechaCit;
	@Column(name="cime_valor_cita")
	private BigDecimal valor;
	@Column(name="cime_lugar_cita")
	private String lugar;
	@Column(name="cime_diagnostico")
	private String diagnostico;
	@Column(name="cime_receta")
	private String receta;
	@Column(name="cime_fecha_proxima_cita")
	private LocalDate fechaProxima;
	
	
	@ManyToOne
	@JoinColumn(name="cime_id_doctor")
	private Doctor doctor;	
	
	@ManyToOne
	@JoinColumn(name="cime_id_paciente")
	private Paciente paciente;
	
	
	//GET y SET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getFechaCit() {
		return fechaCit;
	}

	public void setFechaCit(LocalDate fechaCit) {
		this.fechaCit = fechaCit;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

	public LocalDate getFechaProxima() {
		return fechaProxima;
	}

	public void setFechaProxima(LocalDate fechaProxima) {
		this.fechaProxima = fechaProxima;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", numero=" + numero + ", fechaCit=" + fechaCit + ", valor=" + valor
				+ ", lugar=" + lugar + ", diagnostico=" + diagnostico + ", receta=" + receta + ", fechaProxima="
				+ fechaProxima + ", doctor=" + doctor + ", paciente=" + paciente + ", getId()=" + getId()
				+ ", getNumero()=" + getNumero() + ", getFechaCit()=" + getFechaCit() + ", getValor()=" + getValor()
				+ ", getLugar()=" + getLugar() + ", getDiagnostico()=" + getDiagnostico() + ", getReceta()="
				+ getReceta() + ", getFechaProxima()=" + getFechaProxima() + ", getDoctor()=" + getDoctor()
				+ ", getPaciente()=" + getPaciente() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
