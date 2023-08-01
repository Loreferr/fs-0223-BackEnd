package com.example.demo.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Service.EdificioService;
import com.example.demo.Service.PostazioneService;
import com.example.demo.Service.PrenotationService;
import com.example.demo.Service.UserService;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	PrenotationService ps;
	@Autowired
	PostazioneService pos;
	@Autowired
	UserService us;
	@Autowired
	EdificioService es;

	@Override
	public void run(String... args) throws Exception {

		for (int i = 0; i < 10; i++) {
			us.createFakeContact();
		}

//		User Utente1 = us.createCustomUser("CiccioGamer89", "Mirko Alessandrini", "Cicciogamer89@gmail.com");
//		User Utente2 = us.createCustomUser("GiulioGolia77", "Giulio Golia", "GiulioGolia77.gmail.com");
//		User Utente3 = us.createCustomUser("Gennaro Pigliamosche", "Gennaro FlyTaker", "GF2002.gmail.com");
		// us.saveUser(Utente3);
		// us.removeUser(Utente1);
		// us.updateUser(Utente1);
		// us.findUser("CiccioGamer89");

		// Edificio E1 = es.createCustomEdificio("Mazzini", "Via Giuseppe Mazzini 12",
		// "Roma");
		// Edificio E2 = es.createCustomEdificio("Verdi", "Via Verdi 23", "Pavia");
		// Edificio E3 = es.createCustomEdificio("Armaldo", "Via Adinolfi 23", "Cava
		// de'Tirreni");
		// es.saveEdificio(E3);
		// es.removeEdificio(E1);
		// es.updateEdificio(E1);
		// es.findEdificioByName("Mazzini");

		// Postazione P1 = pos.createCustomPostazione(1, " Accesso Internet, Double
		// Monitor ", Tipo.Privato, 1, E1);
		// Postazione P2 = pos.createCustomPostazione(2, " Full Option", Tipo.OpenSpace,
		// 10, E2);
		// Postazione P3 = pos.createCustomPostazione(3, " Gaming House",
		// Tipo.SalaRiunioni, 15, E3);
		// pos.savePostazione(P3);
		// pos.removePostazione(P1);
		// pos.updatePostazione(P1);
		// pos.findPostazioneByCityandTipo(Tipo.SalaRiunioni, "Cava de'Tirreni");

		// Prenotazione PR1 = ps.createCustomPrenotazione(1, Utente1, P1,
		// LocalDate.of(2023, 9, 21));
		// Prenotazione PR2 = ps.createCustomPrenotazione(2, Utente2, P2,
		// LocalDate.of(2023, 9, 21));
		// Prenotazione PR3 = ps.createCustomPrenotazione(3, Utente3, P3,
		// LocalDate.of(2023, 10, 21));
		// ps.savePrenotation(PR3);
		// ps.removePrenotation(PR1);
		// ps.updatePrenotation(PR1);
		// ps.findPrenotationByID(3);

	}
}
