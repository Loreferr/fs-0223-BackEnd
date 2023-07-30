package com.example.demo.Classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity

public class Edificio {
	@Id
	private String Nome;
	private String Indirizzo;
	private String Citta;
}
