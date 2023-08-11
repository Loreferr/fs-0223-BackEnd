package com.epicode.Spring.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Spring.classes.Laptop;
import com.epicode.Spring.classes.Smartphone;
import com.epicode.Spring.classes.Tablet;
import com.epicode.Spring.classes.Utente;
import com.github.javafaker.Faker;

@Configuration
public class Config {

	@Bean
	@Scope("prototype")
	public Utente customUtente() {
		return new Utente();
	}

	@Bean
	@Scope("prototype")
	public Utente fakeUtente() {
		Faker faker = new Faker(new Locale("it-IT"));
		Utente c = new Utente();
		String username = faker.name().username();
		String firstlast = faker.name().fullName();
		c.setUsername(username);
		c.setNomeCompleto(firstlast);

		c.setEmail(faker.internet().emailAddress());

		return c;
	}

	@Bean
	@Scope("prototype")
	public Smartphone customSmartphone() {
		return new Smartphone();
	}

	@Bean
	@Scope("prototype")
	public Laptop customLaptop() {
		return new Laptop();
	}

	@Bean
	@Scope("prototype")
	public Tablet customTablet() {
		return new Tablet();
	}
}
