package br.edu.utfpr.pontoeletronico.ponto_eletronico.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "record")
public class Record implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "record_seq", sequenceName = "record_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "record_seq")
	private Long id;
	
	@Column(nullable = false, length = 25)
	@NotBlank(message = "Data é uma informação obrigatória.")
	private String date;
	
	@Column(nullable = false, length = 45)
	@NotBlank(message = "Nota é uma informação obrigatória.")
	private String note;
	
	 @JoinColumn(name="idUser")
	 @NotBlank(message = "Nota é uma informação obrigatória.")
	 @ManyToOne(optional = true, cascade = CascadeType.ALL)
	 private User user;
}
