package io.github.thiagoPolli.agendaapi.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 150, nullable = false)
	private String nome;
	
	@Column(length = 150, nullable = false)
	private String email;
	
	@Column
	private Boolean favorito;
	
	
	public Contato() {
		
	}


	public Contato(Integer id, String nome, String email, Boolean favorito) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.favorito = favorito;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Boolean getFavorito() {
		return favorito;
	}


	public void setFavorito(Boolean favorito) {
		this.favorito = favorito;
	}
	
	

}
