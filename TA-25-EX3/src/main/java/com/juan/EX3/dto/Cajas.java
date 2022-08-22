package com.juan.EX3.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Cajas")
public class Cajas {

	// ATRIBUTOS TABLA CAJAS

		@Id
		
		private char idNumRef;
		private String Contenido;
		private int Valor;
		
		@ManyToOne
		@JoinColumn(name = "id_Codigo")
		private Almacenes almacen;

	
		// CONSTRUCTORES
		
		public Cajas() {}
		
		public Cajas(char idNumRef, String contenido, int valor, Almacenes almacenes) {
			super();
			this.idNumRef = idNumRef;
			Contenido = contenido;
			Valor = valor;
			almacenes = almacen;
		
		}

		public Almacenes getAlmacen() {
			return almacen;
		}

		public void setAlmacen(Almacenes almacen) {
			this.almacen = almacen;
		}

		public char getIdNumRef() {
			return idNumRef;
		}

		public void setIdNumRef(char idNumRef) {
			this.idNumRef = idNumRef;
		}

		public String getContenido() {
			return Contenido;
		}

		public void setContenido(String contenido) {
			Contenido = contenido;
		}

		public int getValor() {
			return Valor;
		}

		public void setValor(int valor) {
			Valor = valor;
		}


		@Override
		public String toString() {
			return "Cajas [idNumRef=" + idNumRef + ", Contenido=" + Contenido + ", Valor=" + Valor
					+ "]";
		}
		
		
}
