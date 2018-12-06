package br.edu.utfpr.pontoeletronico.ponto_eletronico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 45)
	@Size(min = 3, max = 45, message = "Formato inválido, no minimo 3 ou máximo 45 letras.")
	@NotBlank(message = "Nome é uma informação obrigatória.")
	private String name;

	@Size(min = 5, max = 80, message = "Formato inválido, no minimo 5 ou máximo 80 caracteres.")
	@Email(message = "O email digitado não é um email válido exemplo@exemplo.com")
	@NotBlank(message = "Email é uma informação obrigatória.")
	private String email;

	@Size(min = 5, max = 20, message = "Formato inválido, no minimo 8 ou máximo 20 caracteres.")
	@NotBlank(message = "Senha é uma informação obrigatória.")
	private String password;

	public User() {

	}

	public User(Long id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

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
}
