package br.edu.utfpr.pontoeletronico.ponto_eletronico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.NotBlank;

@Entity(name = "record")
public class Record {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(max = 25, message = "Formato inválido, máximo de 25 caracteres.")
	@NotBlank(message = "Data é uma informação obrigatória.")
	private String date;

	@Size(max = 65, message = "Formato inválido, máximo de 65 caracteres.")
	@NotBlank(message = "Nota é uma informação obrigatória.")
	private String note;

	@JoinColumn(name = "idUser")
	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User user;

	public Record() {

	}

	public Record(Long id, String date, String note, User user) {
		super();
		this.id = id;
		this.date = date;
		this.note = note;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
