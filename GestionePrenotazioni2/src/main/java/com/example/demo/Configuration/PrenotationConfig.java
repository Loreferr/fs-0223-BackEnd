package com.example.demo.Configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.Classes.Edificio;
import com.example.demo.Classes.Postazione;
import com.example.demo.Classes.Prenotazione;
import com.example.demo.Classes.User;
import com.github.javafaker.Faker;

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

	@Bean("fakeUserBean")
	@Scope("prototype")
	public User fakeContact() {
		Faker faker = new Faker(new Locale("it-IT"));
		User c = new User();
		String username = faker.name().username();
		String firstlast = faker.name().fullName();
		c.setUsername(username);
		c.setNomeCompleto(firstlast);

		c.setEmail(faker.internet().emailAddress());

		return c;
	}
}
