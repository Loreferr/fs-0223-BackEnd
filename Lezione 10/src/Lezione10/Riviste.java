package Lezione10;

public class Riviste extends Catalogo_Bibliotecario {

	Periodicita periodicita;

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

	@Override
	public String toString() {
		return "Riviste [periodicita=" + periodicita + ", codiceISBN=" + codiceISBN + ", Titolo=" + Titolo
				+ ", AnnoPubblicazione=" + AnnoPubblicazione + ", Pagine=" + Pagine + ", getPeriodicita()="
				+ getPeriodicita() + ", getCodiceISBN()=" + getCodiceISBN() + ", getTitolo()=" + getTitolo()
				+ ", getAnnoPubblicazione()=" + getAnnoPubblicazione() + ", getPagine()=" + getPagine()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
