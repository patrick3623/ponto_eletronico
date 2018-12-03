package br.edu.utfpr.pontoeletronico.ponto_eletronico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findOne(Long id);

	void delete(Long id); 
	}
