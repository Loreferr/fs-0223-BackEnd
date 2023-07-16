package JPA;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Utente {
	private String Nome;
	private String Cognome;
	private LocalDate dataDiNascita;
	@Id
	@Column(unique = true)
	private Integer numeroDiTessera;
	@OneToMany(mappedBy = "utente")
	private List<Prestito> prestiti;

	public Utente() {
		super();
	}

	public Utente(String nome, String cognome, LocalDate dataDiNascita, Integer numeroDiTessera) {
		super();
		Nome = nome;
		Cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.numeroDiTessera = numeroDiTessera;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public Integer getNumeroDiTessera() {
		return numeroDiTessera;
	}

	public void setNumeroDiTessera(Integer numeroDiTessera) {
		this.numeroDiTessera = numeroDiTessera;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Utente [Nome=").append(Nome).append(", Cognome=").append(Cognome).append(", Data di Nascita=")
				.append(dataDiNascita).append(", numeroDiTessera=").append(numeroDiTessera).append(", prestiti=[");

		for (Prestito prestito : prestiti) {
			sb.append(prestito.toString()).append(", ");
		}

		if (!prestiti.isEmpty()) {
			sb.setLength(sb.length() - 2);
		}

		sb.append("]]");

		return sb.toString();
	}

}
