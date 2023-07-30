package com.example.demo.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Classes.Edificio;

@Repository
public interface EdificioRepo extends CrudRepository<Edificio, String> {

	@Query("SELECT e FROM Edificio e WHERE e.Nome = :nome")
	public Edificio findByName(@Param("nome") String nome);
}
