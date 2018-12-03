package br.edu.utfpr.pontoeletronico.ponto_eletronico.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;

	public UserRepositoryTest() {

	}

	@Test
	public void setUp() throws Exception {
		User user = new User(10L, "Teste One", "teste1@teste.com", "teste123mudar1");
		User user2 = new User(11L, "Teste two", "teste2@teste.com", "teste123mudar2");
		User user3 = new User(12L, "Teste tree", "teste3@teste.com", "teste123mudar3");
		User user4 = new User(13L, "Teste four", "teste4@teste.com", "teste123mudar4");
		userRepository.save(user);
		userRepository.save(user2);
		userRepository.save(user3);
		userRepository.save(user4);
	}

	@Test
	public void persist() throws Exception {
		userRepository.exists(10L);
		userRepository.exists(13L);
	}

	@Test
	public void tearDown() throws Exception {
		userRepository.deleteAll();
	}

}
