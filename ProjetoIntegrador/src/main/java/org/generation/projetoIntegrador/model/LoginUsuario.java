package org.generation.projetoIntegrador.model;

public class LoginUsuario {

	private String nome;

	private String usuario;
	
	private String senha;
	
	private String token;


	public LoginUsuario() {}
	
	public LoginUsuario(Usuario usuario) {
		this.nome = usuario.getNome();
		this.senha = usuario.getSenha();
		this.usuario = usuario.getUsuario();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
