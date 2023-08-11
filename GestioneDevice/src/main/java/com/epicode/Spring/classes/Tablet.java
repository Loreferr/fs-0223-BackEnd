package com.epicode.Spring.classes;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor

public class Tablet extends Device {
	public Tablet(Utente utente, Status status) {
		super(utente, status);
		// TODO Auto-generated constructor stub
	}

}
