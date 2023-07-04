package com.example.demo.repository.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor",schema = "public")
public class Doctor {
	
	@Id
	@GeneratedValue(generator = "seq_doc", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_doc", sequenceName = "seq_doc", allocationSize = 1)
	
	@Column(name="doct_id")
	private Integer id;
	@Column(name="doct_cedula")
	private String cedula;
	@Column(name="doct_nombre")
	private String nombre;
	@Column(name="doct_apellido")
	private String apellido;
	@Column(name="doct_fecha_nacimiento")
	private LocalDate fechaNacim;
	@Column(name="doct_numero_consultorio")
	private String numeroConsult;
	@Column(name="doct_codigo_senescyt")
	private String codSenescyt;
	@Column(name="doct_genero")
	private String genero;
	
	@OneToMany(mappedBy = "doctor",cascade =CascadeType.ALL)
	private List<CitaMedica> CitaMedica;
	
	//SET Y GET


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacim() {
		return fechaNacim;
	}

	public void setFechaNacim(LocalDate fechaNacim) {
		this.fechaNacim = fechaNacim;
	}

	public String getNumeroConsult() {
		return numeroConsult;
	}

	public void setNumeroConsult(String numeroConsult) {
		this.numeroConsult = numeroConsult;
	}

	public String getCodSenescyt() {
		return codSenescyt;
	}

	public void setCodSenescyt(String codSenescyt) {
		this.codSenescyt = codSenescyt;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<CitaMedica> getCitaMedica() {
		return CitaMedica;
	}

	public void setCitaMedica(List<CitaMedica> citaMedica) {
		CitaMedica = citaMedica;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacim=" + fechaNacim + ", numeroConsult=" + numeroConsult + ", codSenescyt=" + codSenescyt
				+ ", genero=" + genero + ", CitaMedica=" + CitaMedica + "]";
	}	
	
	
	


	

	
}
