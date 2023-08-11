package com.epicode.Spring.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.Spring.service.DeviceService;
import com.epicode.Spring.service.UtenteService;

@Component
public class Runner implements ApplicationRunner {

	@Autowired
	UtenteService Uservice;

	@Autowired
	DeviceService Dservice;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Runner...");

//		for (int i = 0; i < 10; i++) {
//			Uservice.createFakeUtente();
//		}
//		Utente U3 = Uservice.createCustomUser("Loreferr", "Lorenzo Ferrara", "lf.242@gmail.com");
//		Utente U1 = Uservice.createCustomUser("Cicciogamer89", "Mirko Alessandrini", "cicciogamer89@gmail.com");
//		Utente U2 = Uservice.createCustomUser("AndreaRanocchia89", "Andrea Ranocchia", "AR89@gmail.com");
//		Uservice.saveUtente(U1);
//		Uservice.saveUtente(U2);
//		Uservice.saveUtente(U3);
		Uservice.findUtentebyId((long) 1);
		Uservice.findUtentebyId((long) 10);
//		Dservice.createCustomSmartphone(U1, Status.Disponibile);
//		Dservice.createCustomLaptop(U2, Status.Manutenzione);

	}

}
