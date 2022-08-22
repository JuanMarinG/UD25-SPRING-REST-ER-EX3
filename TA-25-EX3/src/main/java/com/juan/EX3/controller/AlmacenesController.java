package com.juan.EX3.controller;

import com.juan.EX3.dto.Almacenes;
import com.juan.EX3.service.AlmacenesServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AlmacenesController {

	@Autowired AlmacenesServiceImpl almacenesServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacenes(){
		return almacenesServiceImpl.listarAlmacenes();
	}
	@PostMapping("/almacenes")
	 public Almacenes guardarAlmacen (Almacenes almacenes) {
		return almacenesServiceImpl.guardarAlmacen(almacenes);
	}
	
	@GetMapping("/almacenes/{id}")
	public Almacenes AlmacenesPorId(@PathVariable(name="idCodigo")Long id) {
		Almacenes almacenesPorId = new Almacenes();
		almacenesPorId = almacenesServiceImpl.AlmacenesPorId(id);
		return almacenesPorId;
	}
	@PutMapping("/almacenes/{id}")
	public Almacenes actualizarAlmacen (@PathVariable(name="idCodigo")Long id,@RequestBody Almacenes almacenes) {
		Almacenes almacen_seleccionado = new Almacenes();
		Almacenes almacen_actualizado = new Almacenes ();
		
		almacen_seleccionado = almacenesServiceImpl.AlmacenesPorId(id);
		almacen_seleccionado.setIdCodigo(almacenes.getIdCodigo());
		almacen_actualizado = almacenesServiceImpl.actualizarAlmacen(almacen_seleccionado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{id}")
	public void eliminarAlmacen (Long id) {
		almacenesServiceImpl.eliminarAlmacen(id);
	}
}
