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

	public RecordRepositoryTest() {

	}

	@Test
	public void setUp() throws Exception {
		Record record = new Record(10L, "01/01/2019", "Olá novo Ano",
				new User(10L, "Teste One", "teste@teste.com", "teste123mudar1"));
		Record record2 = new Record(10L, "02/02/2019", "Olá novo Ano dois",
				new User(10L, "Teste two", "teste@teste.com", "teste123mudar2"));
		Record record3 = new Record(10L, "03/03/2019", "Olá novo Ano tres",
				new User(10L, "Teste tree", "teste@teste.com", "teste123mudar3"));
		Record record4 = new Record(10L, "04/04/2019", "Olá novo Ano quatro",
				new User(10L, "Teste four", "teste@teste.com", "teste123mudar4"));
		recordRepository.save(record);
		recordRepository.save(record2);
		recordRepository.save(record3);
		recordRepository.save(record4);
	}

	@Test
	public void persist() throws Exception {
		recordRepository.exists(10L);
		recordRepository.exists(13L);
	}

	@Test
	public void tearDown() throws Exception {
		recordRepository.deleteAll();
	}
}
