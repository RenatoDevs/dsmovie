package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

/*Nome precisa estar correto igual ao que vai ser inserido no bd */
@Table(name = "tb_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	/*Construtor Vazio */
	public User() {
		
	}
	/*Construtor para recer os argumentos */ 
	
	public User(Long id, String email) {
		this.id = id;
		this.email = email;
	}
	
	/*Metodos de acesso*/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

