package JPA;

import javax.persistence.Entity;

@Entity
public class Libri extends ElementoBibliotecario {
	String Autore;
	String Genere;

	public Libri() {
		super();
	}

	public Libri(String codiceISBN, String titolo, Integer annoPubblicazione, Integer pagine, String Autore,
			String Genere) {
		super(codiceISBN, titolo, annoPubblicazione, pagine);

		this.Autore = Autore;
		this.Genere = Genere;

	}

	public String getAutore() {
		return Autore;
	}

	public void setAutore(String autore) {
		this.Autore = autore;
	}

	public String getGenere() {
		return this.Genere;
	}

	public void setGenere(String genere) {
		this.Genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [Titolo=" + getTitolo() + ", Autore=" + getAutore() + "]";
	}
}
