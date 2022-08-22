package com.juan.EX3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.EX3.dao.IAlmacenesDAO;
import com.juan.EX3.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService {

	@Autowired
	IAlmacenesDAO ialmacenesDAO;
	
	public List<Almacenes> listarAlmacenes(){
		return ialmacenesDAO.findAll();
	}
	
	@Override
	public Almacenes guardarAlmacen (Almacenes almacenes)  {
		return ialmacenesDAO.save(almacenes);
	}
	
	@Override
	public Almacenes actualizarAlmacen (Almacenes almacenes) {
		return ialmacenesDAO.save(almacenes);
	}
	
	@Override
	public void eliminarAlmacen (Long id) {
		ialmacenesDAO.deleteById(id);
	}
	
	public Almacenes AlmacenesPorId(Long id) {
		return ialmacenesDAO.findById(id).get();
	}
	
}
