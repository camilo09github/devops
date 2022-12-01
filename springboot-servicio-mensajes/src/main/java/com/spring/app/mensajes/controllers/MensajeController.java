package com.spring.app.mensajes.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.commons.models.entity.Mensaje;
import com.spring.app.mensajes.models.service.IMensajeService;

@RestController
public class MensajeController {
	
	@Autowired
	private Environment env;
	
	@Value("${server.port}")
	private Integer port;
	
	@Autowired
	private IMensajeService mensajeService;
	
	@GetMapping("/listar")
	public List<Mensaje> listar(){
		return mensajeService.findAll().stream().map(producto ->{
			producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
			return producto;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/ver/{id}")
	public Mensaje detalle(@PathVariable Long id) {
		Mensaje producto = mensajeService.findById(id);
		producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return producto;
	}
	
	@PostMapping("/devops")
	@ResponseStatus(HttpStatus.CREATED)
	public String crear(@RequestBody Mensaje mensaje) {
		Mensaje mens = mensajeService.save(mensaje);
		return "Hola " + mens.getPara() + " tu mensaje se ha enviado";
		
	}
	
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Mensaje editar(@RequestBody Mensaje mensaje, @PathVariable Long id) {
		Mensaje mensajeDb = mensajeService.findById(id);
		
		mensajeDb.setMensaje(mensaje.getMensaje());
		mensajeDb.setPara(mensaje.getPara());
		mensajeDb.setDesde(mensaje.getDesde());
        
        return mensajeService.save(mensajeDb);
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		mensajeService.deleteById(id);
	}
	
	//@PostMapping("/devops")
	//@ResponseStatus(HttpStatus.CREATED)
	//public Mensaje DevOps(@RequestBody Mensaje mensaje) {
	///	return mensajeService.DevOps(mensaje);
		
	///}
	

}
