package br.edu.utfpr.pontoeletronico.ponto_eletronico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

	Record findOne(Long id);

	void delete(Long id);
}
