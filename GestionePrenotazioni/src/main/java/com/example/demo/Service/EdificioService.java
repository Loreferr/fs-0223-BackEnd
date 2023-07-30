package com.example.demo.Service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.Classes.Edificio;
import com.example.demo.Repository.EdificioRepo;

@Service
public class EdificioService {

	@Autowired
	EdificioRepo repo;

	@Autowired
	@Qualifier("customEdificio")
	private ObjectProvider<Edificio> customEdificioProvider;

	public Edificio createCustomEdificio(String nome, String indirizzo, String citta) {
		return customEdificioProvider.getObject().builder().Nome(nome).Indirizzo(indirizzo).Citta(citta).build();
	}

	public void saveEdificio(Edificio e) {
		repo.save(e);
		System.out.println("Edificio:" + e.getNome() + "Creato!");
	}

	public void updateEdificio(Edificio e) {
		repo.save(e);
		System.out.println("Utente:" + e.getNome() + " modificato nel DB!!!");
	}

	public void removeEdificio(Edificio e) {
		repo.delete(e);
		System.out.println("Utente:" + e.getNome() + " eliminato dal DB!!!");
	}

	public Edificio findEdificioByName(String e) {
		System.out.println("Edificio Trovato: " + repo.findByName(e));
		return repo.findByName(e);
	}

}
