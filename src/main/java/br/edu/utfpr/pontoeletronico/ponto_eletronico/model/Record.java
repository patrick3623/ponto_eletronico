package br.edu.utfpr.pontoeletronico.ponto_eletronico.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity(name = "record")
public class Record {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 25)
	@NotBlank(message = "Data é uma informação obrigatória.")
	private String date;

	@Column(nullable = false, length = 45)
	@NotBlank(message = "Nota é uma informação obrigatória.")
	private String note;

	@JoinColumn(name = "idUser")
	@ManyToOne(optional = true, cascade = CascadeType.ALL)
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
