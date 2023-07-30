package com.example.demo.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.Classes.Edificio;
import com.example.demo.Classes.Postazione;
import com.example.demo.Classes.Prenotazione;
import com.example.demo.Classes.User;

@Configuration
public class PrenotationConfig {

	@Bean
	@Scope("prototype")
	public User customUser() {
		return new User();
	}

	@Bean
	@Scope("prototype")
	public Prenotazione customPrenotazione() {
		return new Prenotazione();
	}

	@Bean
	@Scope("prototype")
	public Edificio customEdificio() {
		return new Edificio();
	}

	@Bean
	@Scope("prototype")
	public Postazione customPostazione() {
		return new Postazione();
	}
}
