package br.edu.utfpr.pontoeletronico.ponto_eletronico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.User;
import br.edu.utfpr.pontoeletronico.ponto_eletronico.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findOne(Long id) {
		return repository.findOne(id);
	}
	
	public User save(User user) {
		return repository.saveAndFlush(user);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}

}
