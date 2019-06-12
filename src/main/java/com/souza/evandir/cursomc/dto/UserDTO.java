package com.souza.evandir.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotEmpty(message="Preenchimento obrigatório")
	private String senha;
	
	public UserDTO() {
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
