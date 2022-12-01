package com.spring.app.mensajes.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.app.commons.models.entity.Mensaje;
import com.spring.app.mensajes.models.dao.MensajeDao;

@Service
public class MensajeServiceImpl implements IMensajeService{

	@Autowired
	private MensajeDao mensajeDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Mensaje> findAll() {
		return (List<Mensaje>) mensajeDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Mensaje findById(Long id) {
		return mensajeDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Mensaje save(Mensaje mensaje) {
		return mensajeDao.save(mensaje);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		mensajeDao.deleteById(id);
	}

	//@Override
	//@Transactional
	//public Mensaje DevOps(Mensaje mensaje) {
	//	return mensajeDao.DevOps(mensaje);
	//}

}
