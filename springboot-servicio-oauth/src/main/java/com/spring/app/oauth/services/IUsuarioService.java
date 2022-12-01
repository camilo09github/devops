package com.spring.app.oauth.services;


import com.spring.app.usuarios.commons.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	public Usuario update(Usuario usuario, Long id);

}
