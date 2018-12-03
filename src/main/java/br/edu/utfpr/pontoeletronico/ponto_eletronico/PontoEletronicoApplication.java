package br.edu.utfpr.pontoeletronico.ponto_eletronico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "br.edu.utfpr.pontoeletronico.ponto_eletronico.model" })
@EnableJpaRepositories(basePackages = { "br.edu.utfpr.pontoeletronico.ponto_eletronico.repository" })
@ComponentScan(basePackages = {"br.edu.utfpr.pontoeletronico.ponto_eletronico.controller"})
public class PontoEletronicoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PontoEletronicoApplication.class, args);
	}
}