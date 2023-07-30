package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Classes.Postazione;
import com.example.demo.Enum.Tipo;

@Repository
public interface PostazioneRepo extends CrudRepository<Postazione, Integer> {

	@Query("SELECT p FROM Postazione p WHERE p.tipo = :tipo AND p.edificio.Citta = :citta")
	List<Postazione> findByTipoAndCitta(Tipo tipo, String citta);
}
