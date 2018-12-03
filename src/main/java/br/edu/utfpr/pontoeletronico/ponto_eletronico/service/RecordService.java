package br.edu.utfpr.pontoeletronico.ponto_eletronico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.Record;
import br.edu.utfpr.pontoeletronico.ponto_eletronico.repository.RecordRepository;

@Repository
public class RecordService {

	@Autowired
	private RecordRepository repository;

	public List<Record> findAll() {
		return repository.findAll();
	}

	public Record findOne(Long id) {
		return repository.findOne(id);
	}

	public Record save(Record record) {
		return repository.saveAndFlush(record);
	}

	public void delete(Long id) {
		repository.delete(id);
	}
}
