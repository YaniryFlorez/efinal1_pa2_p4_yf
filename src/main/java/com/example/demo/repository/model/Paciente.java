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
@Table(name="paciente")
public class Paciente {
	@Id
	@GeneratedValue(generator = "seq_pac", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_pac", sequenceName = "seq_pac", allocationSize = 1)
	
	@Column(name="paci_id")
	private Integer id;
	@Column(name="paci_cedula")
	private String cedula;
	@Column(name="paci_nombre")
	private String nombre;
	@Column(name="paci_apellido")
	private String apellido;
	@Column(name="paci_fecha_nacimiento")
	private LocalDate fechaNacim;
	@Column(name="paci_codigo_seguro")
	private String codSeguro;
	@Column(name="paci_estatura")
	private Float estatura;
	@Column(name="paci_peso")
	private Float peso;
	@Column(name="paci_genero")
	private String genero;
	
	@OneToMany(mappedBy = "paciente",cascade =CascadeType.ALL)
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

	public String getCodSeguro() {
		return codSeguro;
	}

	public void setCodSeguro(String codSeguro) {
		this.codSeguro = codSeguro;
	}

	public Float getEstatura() {
		return estatura;
	}

	public void setEstatura(Float estatura) {
		this.estatura = estatura;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
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
		return "Paciente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacim=" + fechaNacim + ", codSeguro=" + codSeguro + ", estatura=" + estatura + ", peso="
				+ peso + ", genero=" + genero + ", CitaMedica=" + CitaMedica + "]";
	}
	
	
}
