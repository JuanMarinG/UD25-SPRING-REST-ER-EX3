package com.juan.EX3.service;

import java.util.List;
import com.juan.EX3.dto.Almacenes;
public interface IAlmacenesService {
	
	//ALL
	public List <Almacenes> listarAlmacenes();
	
	//CREATE
	public Almacenes guardarAlmacen(Almacenes almacenes);
	
	//READ
	public Almacenes AlmacenesPorId(Long id);
	
	//UPDATE
	public Almacenes actualizarAlmacen(Almacenes almacenes);
	
	//DELETE
	public void eliminarAlmacen (Long id);
}
