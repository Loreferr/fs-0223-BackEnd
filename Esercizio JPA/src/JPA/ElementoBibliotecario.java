package JPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
class ElementoBibliotecario {
	@Id
	@Column(unique = true)
	private String codiceISBN;
	private String Titolo;
	private Integer AnnoPubblicazione;
	private Integer Pagine;

	public ElementoBibliotecario() {

	}

	public ElementoBibliotecario(String codiceISBN, String titolo, Integer annoPubblicazione, Integer pagine) {

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
