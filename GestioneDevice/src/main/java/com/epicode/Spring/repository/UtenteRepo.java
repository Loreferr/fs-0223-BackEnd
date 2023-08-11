package com.epicode.Spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.epicode.Spring.classes.Utente;

@Repository
public interface UtenteRepo extends CrudRepository<Utente, Long> {
	@Query("SELECT u FROM Utente u WHERE u.id = :id")
	public Optional<Utente> findById(@Param("id") Long id);
}
