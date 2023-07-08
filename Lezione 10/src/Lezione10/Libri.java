package Lezione10;

public class Libri extends Catalogo_Bibliotecario {
	String Autore;
	String Genere;

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

}
