package Lezione10;

public class Catalogo_Bibliotecario {

	String codiceISBN;
	String Titolo;
	Integer AnnoPubblicazione;
	Integer Pagine;

	public Catalogo_Bibliotecario(String codiceISBN, String titolo, Integer annoPubblicazione, Integer pagine) {

		this.codiceISBN = codiceISBN;
		this.Titolo = titolo;
		this.AnnoPubblicazione = annoPubblicazione;
		this.Pagine = pagine;
	}

	public String getCodiceISBN() {
		return codiceISBN;
	}

	public void setCodiceISBN(String codiceISBN) {
		this.codiceISBN = codiceISBN;
	}

	public String getTitolo() {
		return Titolo;
	}

	public void setTitolo(String titolo) {
		Titolo = titolo;
	}

	public Integer getAnnoPubblicazione() {
		return AnnoPubblicazione;
	}

	public void setAnnoPubblicazione(Integer annoPubblicazione) {
		AnnoPubblicazione = annoPubblicazione;
	}

	public Integer getPagine() {
		return Pagine;
	}

	public void setPagine(Integer pagine) {
		Pagine = pagine;
	}

}
