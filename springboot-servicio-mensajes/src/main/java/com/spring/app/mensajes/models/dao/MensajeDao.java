package com.spring.app.mensajes.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.app.commons.models.entity.Mensaje;

public interface MensajeDao extends CrudRepository<Mensaje, Long>{
	
	//Mensaje DevOps(Mensaje mensaje);

}
