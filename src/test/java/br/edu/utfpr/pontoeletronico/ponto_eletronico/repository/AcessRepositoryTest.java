package br.edu.utfpr.pontoeletronico.ponto_eletronico.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.Acess;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class AcessRepositoryTest {

	@Autowired
	AcessRepository acessRepository;

	public AcessRepositoryTest() {

	}

	@Test
	public void setUp() throws Exception {
		Acess acess = new Acess(10L, "User", 10);
		Acess acess2 = new Acess(11L, "Tester", 100);
		Acess acess3 = new Acess(12L, "Beta", 1000);
		Acess acess4 = new Acess(13L, "Null", 10000);
		acessRepository.save(acess);
		acessRepository.save(acess2);
		acessRepository.save(acess3);
		acessRepository.save(acess4);
	}

	@Test
	public void persist() throws Exception {
		acessRepository.exists(10L);
		acessRepository.exists(13L);
	}

	@Test
	public void tearDown() throws Exception {
		acessRepository.deleteAll();
	}
}
