package Lezione12;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		try {
			// Creo una connessione al DB
			DBConnection db = new DBConnection();

			// Creo un oggetto di tipo Utente
			// Studente L = new Studente(1,"Mario", "Rossi", 25, "m.rossi@example.com");
			Studente g = new Studente(1, "Giuseppe", "Verdi", "Maschio", 16 / 10 / 1995, 7, 4, 9);
			Studente f = new Studente(2, "Francesca", "Neri", "Femmina", 15 / 05 / 2001, 8, 6, 10);
			// Lo salvo nel DB
			// db.inserisciStudente(g);
			// db.inserisciStudente(f);

			// Utente utente = db.leggiDettaglioUtente(1); // leggo un utente nel DB con un
			// id specifico
			// System.out.println(utente);

			// Modifico qualcosa dell'ogg letto
			// f.setLastname("Bianchi");
			// Salvo nel DB le modifiche fatte
			// db.modificaStudente(f);

			// rimuovo un ogg dal DB
			db.cancellaUtente(f);

			// leggo tutti gli ogg presenti nel db e li inserisco in una lista
			// List<Utente> lista = db.leggiUtenti();
			// lista.forEach(ut -> System.out.println(ut));

		} catch (SQLException e) {
			// e.printStackTrace();
			System.err.println(e.getMessage());
		}

	}

}
