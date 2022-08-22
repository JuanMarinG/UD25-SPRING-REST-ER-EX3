package com.juan.EX3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.EX3.dao.ICajasDAO;
import com.juan.EX3.dto.Cajas;

@Service
public class CajasServiceImpl implements ICajasService{

	@Autowired
	ICajasDAO icajasDAO;
	
	@Override
	public List<Cajas> listarCajas(){
		return icajasDAO.findAll();
	}
	
	@Override
	public Cajas guardarCajas (Cajas cajas) {
		return icajasDAO.save(cajas);
	}
	
	@Override
	public Cajas actualizarCajas (Cajas cajas) {
		return icajasDAO.save(cajas);
	}
	
	@Override 
	public void eliminarCajas (Long id) {
		icajasDAO.deleteById(id);
	}
	@Override
	public Cajas CajasPorId(Long id) {
		return icajasDAO.findById(id).get();
	}

}
