package com.example.demo.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Classes.Prenotazione;
import com.example.demo.Classes.User;

@Repository
public interface PrenotazioneRepo extends CrudRepository<Prenotazione, Integer> {
	List<Prenotazione> findByUtenteAndGiornoPrenot(User utente, LocalDate giornoPrenotazione);
}
