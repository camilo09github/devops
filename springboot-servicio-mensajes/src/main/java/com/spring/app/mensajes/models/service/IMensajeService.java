package com.spring.app.mensajes.models.service;

import java.util.List;

import com.spring.app.commons.models.entity.Mensaje;

public interface IMensajeService {

	public List<Mensaje> findAll();
	public Mensaje findById(Long id);
	
	public Mensaje save(Mensaje mensaje);
	
	public void deleteById(Long id);
	
	//public Mensaje DevOps(Mensaje mensaje);
}
