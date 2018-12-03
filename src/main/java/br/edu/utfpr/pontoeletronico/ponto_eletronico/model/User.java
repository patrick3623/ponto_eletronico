package br.edu.utfpr.pontoeletronico.ponto_eletronico.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

@Entity(name = "user")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "user_seq", sequenceName = "user_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	private Long id;
	
	@Column(nullable = false, length = 45)
	@NotBlank(message = "Nome é uma informação obrigatória.")
	private String name;
	
	@Column(nullable = false, length = 80)
	@NotBlank(message = "Email é uma informação obrigatória.")
	private String email;
	
	@Column(nullable = false, length = 20)
	@NotBlank(message = "Senha é uma informação obrigatória.")
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
