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
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private char idNumRef;
		private String Contenido;
		private int Valor;
		private int Almacen;
		
		@ManyToOne
		@JoinColumn(name = "idCodigo")
		private List<Almacenes> almacenes;

	
		// CONSTRUCTORES
		
		public Cajas() {}
		
		public Cajas(char idNumRef, String contenido, int valor, int almacen, List<Almacenes> almacenes) {
			super();
			this.idNumRef = idNumRef;
			Contenido = contenido;
			Valor = valor;
			Almacen = almacen;
			this.almacenes = almacenes;
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

		public int getAlmacen() {
			return Almacen;
		}

		public void setAlmacen(int almacen) {
			Almacen = almacen;
		}

		public List<Almacenes> getAlmacenes() {
			return almacenes;
		}

		public void setAlmacenes(List<Almacenes> almacenes) {
			this.almacenes = almacenes;
		}

		@Override
		public String toString() {
			return "Cajas [idNumRef=" + idNumRef + ", Contenido=" + Contenido + ", Valor=" + Valor + ", Almacen="
					+ Almacen + ", almacenes=" + almacenes + "]";
		}
		
		
}
