package br.edu.utfpr.pontoeletronico.ponto_eletronico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.Acess;
import br.edu.utfpr.pontoeletronico.ponto_eletronico.repository.AcessRepository;

@Repository
public class AcessService {

	@Autowired
	private AcessRepository repository;

	public List<Acess> findAll() {
		return repository.findAll();
	}

	public Acess findOne(Long id) {
		return repository.findOne(id);
	}

	public Acess save(Acess acess) {
		return repository.saveAndFlush(acess);
	}

	public void delete(Long id) {
		repository.delete(id);
	}
}
