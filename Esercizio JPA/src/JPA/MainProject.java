package JPA;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class MainProject {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("EsercizioJPA");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		Libri Libro1 = new Libri("1", "Signore degli Anelli", 2001, 2500, "JRR Tolkien", "Fantasy");
		Libri Libro2 = new Libri("2", "HarryPotter", 2005, 2500, "Rowling", "Fantasy");
		Libri Libro3 = new Libri("3", "OnePiece", 1999, 2500, "Oda", "Manga");
		Utente U1 = new Utente("Giacomo", "Faticanti", LocalDate.of(1995, 9, 16), 2424);
		Utente U2 = new Utente("Ciccio", "Cozza", LocalDate.of(1992, 6, 10), 1616);
		Utente U3 = new Utente("Luciano", "Spalletti", LocalDate.of(1972, 10, 12), 1016);
		Prestito Prestito1 = new Prestito(U1, Libro1, LocalDate.of(2023, 2, 01), LocalDate.of(2023, 3, 15));
		Prestito Prestito2 = new Prestito(U2, Libro2, LocalDate.of(2023, 3, 01), LocalDate.of(2023, 4, 15));
		Prestito Prestito3 = new Prestito(U3, Libro3, LocalDate.of(2023, 7, 1), LocalDate.of(2023, 7, 14));
		try {
			// inserisciUtente(U3);
			// inserisciPrestito(Prestito3);

			// inserisciElemento(Libro3);
			// rimuoviElementoISBN("2");
			ricercaperISBN("1");
			ricercaPerAnnoPubblicazione(2001);
			RicercaperAutore("JRR Tolkien");
			ricercaPerTitolo("Harry");
			ricercaperTesseraUtente(2424);
			ricercarePrestitiScadutiNonRestituiti();

		} catch (SQLException e) {

			System.err.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}

	public static void inserisciElemento(ElementoBibliotecario u) throws SQLException {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println(u);
		System.out.println(u.getCodiceISBN() + " " + u.getTitolo() + " created!!!");
	}

	public static void inserisciUtente(Utente u) throws SQLException {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println(u);
		System.out.println(u.getNome() + " " + u.getCognome() + " created!!!");
	}

	public static void inserisciPrestito(Prestito u) throws SQLException {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println(u);
		System.out.println(" Prestito di:" + u.getUtente() + " created!!!");
	}

	public static void rimuoviElementoISBN(String isbn) throws SQLException {
		em.getTransaction().begin();
		ElementoBibliotecario u = em.find(ElementoBibliotecario.class, isbn);
		em.remove(u);
		em.getTransaction().commit();
		System.out.println(u.getCodiceISBN() + " " + u.getTitolo() + " removed!!!");

	}

	public static void ricercaperISBN(String isbn) throws SQLException {
		em.getTransaction().begin();
		ElementoBibliotecario s = em.find(ElementoBibliotecario.class, isbn);
		em.getTransaction().commit();
		System.out.println("Ricerca per ISBN:" + isbn + " = " + s.getCodiceISBN() + " " + s.getTitolo());
		;
	}

	public static void ricercaPerAnnoPubblicazione(Integer anno) throws SQLException {
		Query query = em.createQuery("SELECT l FROM ElementoBibliotecario l WHERE l.AnnoPubblicazione = :anno",
				ElementoBibliotecario.class);
		query.setParameter("anno", anno);
		List<ElementoBibliotecario> result = query.getResultList();
		System.out.println("Ricerca per Anno: " + anno);
		for (ElementoBibliotecario libri : result) {
			System.out.println(libri.getTitolo() + " " + anno);
		}

	}

	public static void RicercaperAutore(String Autore) throws SQLException {
		Query query = em.createQuery("SELECT c FROM ElementoBibliotecario c WHERE c.Autore = :autore",
				ElementoBibliotecario.class);
		query.setParameter("autore", Autore);
		List<ElementoBibliotecario> Result = query.getResultList();
		System.out.println("Ricerca per Autore: " + Autore);
		for (ElementoBibliotecario elemento : Result) {
			System.out.println(elemento.getCodiceISBN() + " " + elemento.getTitolo() + " " + Autore);
		}
	}

	public static void ricercaPerTitolo(String titolo) throws SQLException {
		Query query = em.createQuery("SELECT e FROM ElementoBibliotecario e WHERE e.Titolo LIKE :titolo",
				ElementoBibliotecario.class);
		query.setParameter("titolo", "%" + titolo + "%");

		List<ElementoBibliotecario> result = query.getResultList();

		System.out.println("Ricerca per Titolo: " + titolo);
		for (ElementoBibliotecario elemento : result) {
			System.out.println(elemento.getCodiceISBN() + " " + elemento.getTitolo());
		}
	}

	public static void ricercaperTesseraUtente(Integer Tessera) throws SQLException {
		Query query = em.createQuery("SELECT c FROM Prestito c WHERE c.utente.numeroDiTessera = :tessera",
				Prestito.class);
		query.setParameter("tessera", Tessera);
		List<Prestito> Result = query.getResultList();
		System.out.println("Ricerca per numero di Tessera: " + Tessera);
		for (Prestito elemento : Result) {
			System.out.println(elemento.getUtente());
		}

	}

	public static void ricercarePrestitiScadutiNonRestituiti() {

		LocalDate now = LocalDate.now();

		TypedQuery<Prestito> query = em.createQuery(
				"SELECT p FROM Prestito p WHERE p.datafinePrestito < :now AND p.dataRestituzionePrevista > :now",
				Prestito.class);
		query.setParameter("now", now);

		List<Prestito> prestiti = query.getResultList();

		for (Prestito elemento : prestiti) {
			System.out.println("Prestiti Scaduti e non Restituiti = " + elemento);
		}

	}

}
