package br.edu.utfpr.pontoeletronico.ponto_eletronico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.Acess;

public interface AcessRepository extends JpaRepository<Acess, Long> {

	Acess findOne(Long id);

	void delete(Long id);
}
