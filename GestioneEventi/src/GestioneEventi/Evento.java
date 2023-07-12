package GestioneEventi;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String Titolo;
	@Column(nullable = false)
	private LocalDate dataEvento;
	@Column(nullable = false)
	private String descrizione;
	@Column(nullable = false)
	private tipoEvento tipoEvento;
	@Column(nullable = false)
	private Integer numeroMassimoPartecipanti;

	public Evento() {
		super();

	}

	public Evento(Integer id, String titolo, LocalDate dataEvento, String descrizione,
			GestioneEventi.tipoEvento tipoEvento, Integer numeroMassimoPartecipanti) {
		super();
		this.id = id;
		Titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitolo() {
		return Titolo;
	}

	public void setTitolo(String titolo) {
		Titolo = titolo;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Integer getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}

	public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", Titolo=" + Titolo + ", dataEvento=" + dataEvento + ", descrizione=" + descrizione
				+ ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti + "]";
	}

}
