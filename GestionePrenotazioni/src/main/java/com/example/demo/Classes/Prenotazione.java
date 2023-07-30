package com.example.demo.Classes;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity

public class Prenotazione {

	@Id

	@Column(unique = true)
	private Integer ID;

	@ManyToOne
	private User utente;
	@ManyToOne
	private Postazione postazione;
	@Column(name = "Giorno_Prenotazione")
	private LocalDate giornoPrenot;
	private LocalDate GiornoScadenza;

}