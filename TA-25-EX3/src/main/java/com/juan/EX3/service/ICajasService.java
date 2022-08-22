package com.juan.EX3.service;

import java.util.List;
import com.juan.EX3.dto.Cajas;
public interface ICajasService {

	//ALL
	public List<Cajas> listarCajas();
	
	//CREATE
	public Cajas guardarCajas (Cajas cajas);
	
	//READ
	public Cajas CajasPorId (Long id);
	
	//UPDATE
	public Cajas actualizarCajas (Cajas cajas);
	
	//DELETE
	public void eliminarCajas (Long id);
	}
