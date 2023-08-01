package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.Classes.Edificio;
import com.example.demo.Classes.Postazione;
import com.example.demo.Enum.Tipo;
import com.example.demo.Repository.PostazioneRepo;

@Service
public class PostazioneService {

	@Autowired
	PostazioneRepo repo;

	@Autowired
	@Qualifier("customPostazione")
	private ObjectProvider<Postazione> customPostazioneProvider;

	public Postazione createCustomPostazione(Integer codice, String Descrizione, Tipo tipo, Integer NMax,
			Edificio edificio) {
		return customPostazioneProvider.getObject().builder().CodiceUnivoco(codice).Descrizione(Descrizione).tipo(tipo)
				.NumeroMaxOccupanti(NMax).edificio(edificio).build();
	}

	public void savePostazione(Postazione p) {
		repo.save(p);
		System.out.println("Postazione:" + p.getCodiceUnivoco() + "" + p.getTipo() + "Creata");
	}

	public void updatePostazione(Postazione p) {
		repo.save(p);
		System.out.println("Postazione:" + p.getCodiceUnivoco() + "" + p.getTipo() + "Modificata");
	}

	public void removePostazione(Postazione e) {
		repo.delete(e);
		System.out.println("Postazione:" + e.getCodiceUnivoco() + " eliminata dal DB!!!");
	}

	public List<Postazione> findPostazioneByCityandTipo(Tipo tipo, String e) {
		System.out.println("Postazione Trovata: " + repo.findByTipoAndCitta(tipo, e));
		return repo.findByTipoAndCitta(tipo, e);
	}

}
