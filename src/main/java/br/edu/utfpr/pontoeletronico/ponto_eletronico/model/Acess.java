package br.edu.utfpr.pontoeletronico.ponto_eletronico.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "acess")
public class Acess implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "acess_seq", sequenceName = "acess_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acess_seq")
	private Long id;
	
	@Column(nullable = false, length = 45)
	@NotBlank(message = "Nome é uma informação obrigatória.")
	private String name;
	
	@Column(nullable = false, length = 15)
	@NotBlank(message = "Nivel é uma informação obrigatória.")
	private String level;
}
