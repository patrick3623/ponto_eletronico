package br.edu.utfpr.pontoeletronico.ponto_eletronico.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.Record;
import br.edu.utfpr.pontoeletronico.ponto_eletronico.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class RecordRepositoryTest {

	@Autowired
	RecordRepository recordRepository;

	@Autowired
	UserRepository userRepository;

	public RecordRepositoryTest() {

	}

	@Test
	public void setUp() throws Exception {
		User user = new User(10L, "Teste One", "teste1@teste.com", "teste123mudar1");
		userRepository.save(user);

		Record record = new Record(10L, "01/01/2019", "Olá novo Ano", userRepository.findOne(10L));
		Record record2 = new Record(11L, "02/02/2019", "Olá novo Ano dois", userRepository.findOne(10L));
		Record record3 = new Record(12L, "03/03/2019", "Olá novo Ano tres", userRepository.findOne(10L));
		Record record4 = new Record(13L, "04/04/2019", "Olá novo Ano quatro", userRepository.findOne(10L));
		recordRepository.save(record);
		recordRepository.save(record2);
		recordRepository.save(record3);
		recordRepository.save(record4);
	}

	@Test
	public void persist() throws Exception {
		userRepository.exists(10L);
		recordRepository.exists(10L);
		recordRepository.exists(13L);
	}

	@Test
	public void tearDown() throws Exception {
		recordRepository.deleteAll();
		userRepository.deleteAll();
	}
}
