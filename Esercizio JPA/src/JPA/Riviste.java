package JPA;

import javax.persistence.Entity;

@Entity
public class Riviste extends ElementoBibliotecario {

	Periodicita periodicita;

	public Riviste() {
		super();
	}

	public Riviste(String codiceISBN, String titolo, Integer annoPubblicazione, Integer pagine,
			Periodicita periodicita) {
		super(codiceISBN, titolo, annoPubblicazione, pagine);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

}