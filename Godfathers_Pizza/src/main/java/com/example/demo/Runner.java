package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Controller.GestioneMenu;

@Component
public class Runner implements CommandLineRunner {
	public void run(String... args) throws Exception {
		System.out.println("Run...");

		GestioneMenu menu = new GestioneMenu();
		menu.stampaMenu();

	}
}
