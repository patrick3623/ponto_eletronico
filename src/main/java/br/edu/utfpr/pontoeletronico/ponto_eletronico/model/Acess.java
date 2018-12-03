package br.edu.utfpr.pontoeletronico.ponto_eletronico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity(name = "acess")
public class Acess {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 45)
	@NotBlank(message = "Nome é uma informação obrigatória.")
	private String name;

	@Column(nullable = false, length = 5)
	// @NotBlank(message = "Nivel é uma informação obrigatória.")
	private int level;

	public Acess() {

	}

	public Acess(Long id, String name, int level) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
