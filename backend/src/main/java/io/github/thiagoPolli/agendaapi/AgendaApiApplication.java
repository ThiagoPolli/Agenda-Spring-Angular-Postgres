package io.github.thiagoPolli.agendaapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.thiagoPolli.agendaapi.model.entity.Contato;
import io.github.thiagoPolli.agendaapi.model.repositories.ContatoRepository;

@SpringBootApplication
public class AgendaApiApplication {


	public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

}
