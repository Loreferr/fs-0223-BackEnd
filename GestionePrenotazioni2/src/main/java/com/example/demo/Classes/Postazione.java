package com.example.demo.Classes;

import com.example.demo.Enum.Tipo;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

public class Postazione {
	@Id

	private Integer CodiceUnivoco;
	private String Descrizione;
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	private Integer NumeroMaxOccupanti;
	@ManyToOne
	private Edificio edificio;

}
