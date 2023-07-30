package com.example.demo.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.Classes.Postazione;
import com.example.demo.Classes.Prenotazione;
import com.example.demo.Classes.PrenotazioneException;
import com.example.demo.Classes.User;
import com.example.demo.Repository.PrenotazioneRepo;

@Service
public class PrenotationService {
	@Autowired
	PrenotazioneRepo repo;

	@Autowired
	@Qualifier("customPrenotazione")
	private ObjectProvider<Prenotazione> customPrenotazioneProvider;

	public Prenotazione createCustomPrenotazione(Integer Id, User user, Postazione postazione,
			LocalDate giornoPrenotazione) throws PrenotazioneException {
		if (UtenteHaGiaUnaPrenotazione(user, giornoPrenotazione)) {
			throw new PrenotazioneException("L'utente ha già una prenotazione per la data specificata.");
		} else {
			return customPrenotazioneProvider.getObject().builder().ID(Id).utente(user).postazione(postazione)
					.giornoPrenot(giornoPrenotazione).GiornoScadenza(giornoPrenotazione.plusDays(1)).build();
		}
	}

//	public Prenotazione createCustomPrenotazione(Integer Id, User user, Postazione postazione,
//			LocalDate giornoPrenotazione) {
//
//		if (UtenteHaGiaUnaPrenotazione(user, giornoPrenotazione)) {
//			throw new IllegalArgumentException("L'utente ha già una prenotazione per la data specificata.");
//		} else {
//			return customPrenotazioneProvider.getObject().builder().ID(Id).Utente(user).postazione(postazione)
//					.GiornoPrenot(giornoPrenotazione).GiornoScadenza(giornoPrenotazione.plusDays(1)).build();
//		}
//	}

	public void savePrenotation(Prenotazione p) {
		repo.save(p);
		System.out.println("Prenotazione: " + p.getID() + "Utente: " + p.getUtente() + "Postazione: "
				+ p.getPostazione() + "Giorno: " + p.getGiornoPrenot() + "Effettuata Correttamente");
	}

	public void updatePrenotation(Prenotazione p) {
		repo.save(p);
		System.out.println("Prenotazione: " + p.getID() + "Utente: " + p.getUtente() + "Postazione: "
				+ p.getPostazione() + "Giorno: " + p.getGiornoPrenot() + "Modificata Correttamente");
	}

	public void removePrenotation(Prenotazione p) {
		repo.delete(p);
		System.out.println("Prenotazione: " + p.getID() + "Utente: " + p.getUtente() + "Postazione: "
				+ p.getPostazione() + "Giorno: " + p.getGiornoPrenot() + "Rimossa Correttamente");
	}

	public Prenotazione findPrenotationByID(Integer p) {
		System.out.println("Prenotazione Trovata: " + repo.findById(p).get());
		return repo.findById(p).get();
	}

	private boolean UtenteHaGiaUnaPrenotazione(User user, LocalDate date) {
		List<Prenotazione> prenotazioni = repo.findByUtenteAndGiornoPrenot(user, date);
		return !prenotazioni.isEmpty();
	}

//	private boolean UtenteHaGiaUnaPrenotazione(User user, LocalDate date) {
//		List<Prenotazione> prenotazioni = repo.findPrenotazioniByUtenteAndGiornoPrenot(user, date);
//		return !prenotazioni.isEmpty();
//	}

}
