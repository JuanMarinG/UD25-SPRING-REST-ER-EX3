package com.juan.EX3.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Almacenes")
public class Almacenes {

	// ATRIBUTOS TABLA ALMACENES

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCodigo;
	private String Lugar;
	private int Capacidad;

	
	// CONSTRUCTORES

	public Almacenes() {}
	
	public Almacenes(Long idCodigo, String lugar, int capacidad, List<Cajas> cajas) {
		super();
		this.idCodigo = idCodigo;
		Lugar = lugar;
		Capacidad = capacidad;
	}

	public Long getIdCodigo() {
		return idCodigo;
	}

	public void setIdCodigo(Long idCodigo) {
		this.idCodigo = idCodigo;
	}

	public String getLugar() {
		return Lugar;
	}

	public void setLugar(String lugar) {
		Lugar = lugar;
	}

	public int getCapacidad() {
		return Capacidad;
	}

	public void setCapacidad(int capacidad) {
		Capacidad = capacidad;
	}


	@Override
	public String toString() {
		return "Almacenes [idCodigo=" + idCodigo + ", Lugar=" + Lugar + ", Capacidad=" + Capacidad +"]";
	}
	
	

}
