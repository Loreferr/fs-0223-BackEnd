package GestioneEventi;

import java.sql.SQLException;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EventoDAO {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lezione_13");
	static EntityManager em;

	static {
		em = emf.createEntityManager();
	}

	public static void main(String[] args) {

		try {
			Evento Concerto = new Evento(1, "ImagineDragons", LocalDate.of(2023, 02, 20), "Fantastico",
					tipoEvento.Pubblico, 100000);
			save(Concerto);

		} catch (SQLException x) {
			System.err.println(x.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}

	public static void save(Evento u) throws SQLException {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println(u);
	}

	public static Evento leggiDettaglioUtente(long id) throws SQLException {
		em.getTransaction().begin();
		Evento u = (Evento) em.find(Evento.class, id);
		em.getTransaction().commit();
		return u;
	}

	public static void delete(Evento id) throws SQLException {
		em.getTransaction().begin();
		em.remove(id);
		em.getTransaction().commit();
	}

	public void refresh(Evento id) {
		em.getTransaction().begin();
		em.refresh(id);
		em.getTransaction().commit();
	}
}
