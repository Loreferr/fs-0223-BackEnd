package com.epicode.Spring.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Utente utente;
	@Enumerated(EnumType.STRING)
	private Status status;

	public Device(Utente utente, Status status) {
		super();
		this.utente = utente;
		this.status = status;
	}

}
