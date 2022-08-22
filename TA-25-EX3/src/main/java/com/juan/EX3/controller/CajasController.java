package com.juan.EX3.controller;

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

import com.juan.EX3.dto.Cajas;
import com.juan.EX3.service.CajasServiceImpl;

@RestController
@RequestMapping("/api")
public class CajasController {

	@Autowired CajasServiceImpl cajasServiceImpl;
	
	@GetMapping("/cajas")
	public List<Cajas> listarCajas(){
		return cajasServiceImpl.listarCajas();
	}
	
	@PostMapping("/cajas") 
	public Cajas guardarCajas (Cajas cajas) {
		return cajasServiceImpl.guardarCajas(cajas);
	}
	
	@GetMapping("/cajas/{id}")
	public Cajas CajasPorId(@PathVariable (name = "idNumRef")Long id){
		Cajas cajasPorId = new Cajas();
		cajasPorId = cajasServiceImpl.CajasPorId(id);
		return cajasPorId;
	}
	
	@PutMapping("/cajas/{id}")
	public Cajas actualizarCajas (@PathVariable (name = "idNumRef")Long id, @RequestBody Cajas cajas) {
		Cajas caja_seleccionada = new Cajas();
		Cajas caja_actualizada = new Cajas();
		
		caja_seleccionada = cajasServiceImpl.CajasPorId(id);
		caja_seleccionada.setIdNumRef(cajas.getIdNumRef());
		caja_actualizada = cajasServiceImpl.actualizarCajas(caja_actualizada);
		
		return caja_actualizada;
	}
	
	@DeleteMapping("/cajas/{id}")
	public void eliminarCajas (Long id) {
		cajasServiceImpl.eliminarCajas(id);
	}
}
