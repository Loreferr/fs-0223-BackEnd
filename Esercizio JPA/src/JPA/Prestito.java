package JPA;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Prestito implements Serializable {
	@Id
	@ManyToOne
	private Utente utente;
	@ManyToOne
	private ElementoBibliotecario elementoPrestato;
	private LocalDate dataInizioPrestito;
	private LocalDate dataRestituzionePrevista;
	private LocalDate datafinePrestito;

	public Prestito() {
		super();
	}

	public Prestito(Utente utente, ElementoBibliotecario elementoPrestato, LocalDate dataInizioPrestito,
			LocalDate datafinePrestito) {
		super();
		this.utente = utente;
		this.elementoPrestato = elementoPrestato;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataInizioPrestito.plusDays(30);
		this.datafinePrestito = datafinePrestito;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public ElementoBibliotecario getElementoPrestato() {
		return elementoPrestato;
	}

	public void setElementoPrestato(ElementoBibliotecario elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}

	public LocalDate getDataInizioPrestito() {
		return dataInizioPrestito;
	}

	public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}

	public LocalDate getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}

	public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}

	public LocalDate getDatafinePrestito() {
		return datafinePrestito;
	}

	public void setDatafinePrestito(LocalDate datafinePrestito) {
		this.datafinePrestito = datafinePrestito;
	}

	@Override
	public String toString() {
		return "Prestito Effettuato il = " + dataInizioPrestito + " di " + elementoPrestato;
	}

}
