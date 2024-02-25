package com.desafios.jogomes.desafio01anotaai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Desafio01AnotaaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Desafio01AnotaaiApplication.class, args);
	}

}
