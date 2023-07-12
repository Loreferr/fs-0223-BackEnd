package Lezione12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	String url = "jdbc:postgresql://localhost:5432/";
	String dbName = "school_students";
	String user = "postgres";
	String pass = "root";
	Statement st;

	public DBConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url + dbName, user, pass); // Configura una connessione con il DB
																					// passandogli come paramentro il
																					// path del DB la username e la
																					// password di accesso
		st = conn.createStatement(); // un flusso di dati che mi permette di comunicare con il DB
		createTableStudents();
		System.out.println("DB Connect!!!");
	}

	public void createTableStudents() throws SQLException {
		String sql = "CREATE TABLE IF NOT EXISTS school_students (" + "id SERIAL PRIMARY KEY,"
				+ "name VARCHAR NOT NULL," + "lastname VARCHAR NOT NULL," + "gender VARCHAR NOT NULL,"
				+ "birthday INTEGER NOT NULL," + "avg INTEGER NOT NULL," + "min_vote INTEGER NOT NULL,"
				+ "max_vote INTEGER NOT NULL" + ");";
		st.executeUpdate(sql);
		System.out.println("Table utenti created!!!");
	}

	public void inserisciStudente(Studente u) throws SQLException {
		String sql = " INSERT INTO school_students (id, name, lastname, gender,birthday,avg, min_vote, max_vote) "
				+ "VALUES ('" + u.getId() + "', '" + u.getName() + "', '" + u.getLastname() + "', '" + u.getGender()
				+ "', '" + u.getBirthday() + "', '" + u.getAvg() + "', '" + u.getMin_vote() + "', '" + u.getMax_vote()
				+ "');";
		st.executeUpdate(sql);
		System.out.println(u.getId() + " " + u.getName() + " " + u.getLastname() + " " + u.getGender() + " "
				+ u.getBirthday() + " " + u.getAvg() + " " + u.getMin_vote() + " " + u.getMax_vote() + " created!!!");
	}

	public void modificaStudente(Studente u) throws SQLException {
		String sql = "UPDATE school_students SET " + " id = '" + u.getId() + "', " + " name = '" + u.getName() + "', "
				+ " lastname = '" + u.getLastname() + "', " + " gender = '" + u.getGender() + "' ," + " birthday = '"
				+ u.getBirthday() + "', " + " avg = '" + u.getAvg() + "', " + " min_vote = '" + u.getMin_vote() + "', "
				+ " max_vote = '" + u.getMax_vote() + "' " + " WHERE id = " + u.getId();
		st.executeUpdate(sql);
		System.out.println(u.getId() + " " + u.getName() + " " + u.getLastname() + " " + u.getGender() + " "
				+ u.getBirthday() + " " + u.getAvg() + " " + u.getMin_vote() + " " + u.getMax_vote() + " updated!!!");
	}

	public void cancellaUtente(Studente u) throws SQLException {
		String sql = "DELETE FROM school_students WHERE id = " + u.getId();
		st.executeUpdate(sql);
		System.out.println(u.getName() + " " + u.getLastname() + " deleted!!!");
	}

}
