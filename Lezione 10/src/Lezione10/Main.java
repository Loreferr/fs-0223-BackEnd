package Lezione10;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class Main {

	static Map<String, Catalogo_Bibliotecario> Catalogo = new HashMap<String, Catalogo_Bibliotecario>();
	private static File file = new File("documenti/Catalogo.txt");

	public static void main(String[] args) {

		Libri Libro1 = new Libri("1", "Harry Potter", 2003, 2500, "JK. Rowling", "Fantasy");
		Libri Libro2 = new Libri("2", "Signore degli Anelli-La Compagnia dell'Anello", 2001, 2, "Tolkien", "Fantasy");
		Libri Libro3 = new Libri("3", "Fortnite Tutorial", 2001, 2500, "Cicciogamer", "Fantasy");
		Libri Libro4 = new Libri("4", "Game of Thrones", 2012, 2500, "G.R.R Martin ", "Fantasy");
		Aggiunta(Libro1);
		Aggiunta(Libro2);
		Aggiunta(Libro3);
		Aggiunta(Libro4);
		Rimozione("1");
		printElementiArray();

		RicercaISBM("2");
		RicercaAnno(2001);
		RicercaAnno(2012);

		RicercaAutore("Tolkien");

		try {
			salvaFile();
			Catalogo = (Map<String, Catalogo_Bibliotecario>) caricaFile();

			for (Catalogo_Bibliotecario p : Catalogo.values()) {
				System.out.println(p.toString());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("File vuoto");
		}

	}

	public static void Aggiunta(Catalogo_Bibliotecario elemento) {

		Catalogo.put(elemento.getCodiceISBN(), elemento);

		System.out
				.println("Aggiunto Elemento" + "ISBN:" + elemento.getCodiceISBN() + " Titolo " + elemento.getTitolo());

	}

	public static void printElementiArray() {
		System.out.println("Array Aggiornato:");
		for (Map.Entry<String, Catalogo_Bibliotecario> entry : Catalogo.entrySet()) {
			String key = entry.getKey();
			Catalogo_Bibliotecario libro = entry.getValue();
			if (libro instanceof Libri) {
				Libri librolibri = (Libri) libro;
			}
			System.out.println("Chiave: " + key + ", Valore: " + libro.getTitolo());
		}

	}

	public static void Rimozione(String x) {

		Catalogo_Bibliotecario elemento = Catalogo.remove(x);

		System.out.println("Libro Rimosso " + "ISBN: " + elemento.getCodiceISBN() + " Titolo " + elemento.getTitolo());

	}

	public static void RicercaISBM(String elemento) {

		Catalogo.values().stream().filter(p -> p instanceof Libri).map(elem -> (Libri) elem)
				.filter(elem -> elemento.equals(elem.getCodiceISBN())).forEach(libro -> {
					System.out.println("Libro Filtrato per CodiceISBN: " + elemento + "  ISBN:" + libro.getCodiceISBN()
							+ " Titolo: " + libro.getTitolo() + "  Autore: " + libro.getAutore());

				});
		;

	}

	public static void RicercaAnno(Integer elemento) {
		Catalogo.values().stream().filter(p -> p instanceof Libri).map(elem -> (Libri) elem)
				.filter(elem -> elemento.equals(elem.getAnnoPubblicazione())).forEach(libro -> {
					System.out.println("Libro Filtrato per Anno: " + elemento + "  Anno Pubblicazione:"
							+ libro.getAnnoPubblicazione() + "  ISBN:" + libro.getCodiceISBN() + " Titolo: "
							+ libro.getTitolo() + "  Autore: " + libro.getAutore());

				});
		;

	}

	public static void RicercaAutore(String elemento) {
		Catalogo.values().stream().filter(p -> p instanceof Libri).map(elem -> (Libri) elem)
				.filter(elem -> elemento.equals(elem.getAutore())).forEach(libro -> {
					System.out.println("Libro Filtrato per Autore: " + elemento + "  Autore: " + libro.getAutore()
							+ "  ISBN:" + libro.getCodiceISBN() + " Titolo: " + libro.getTitolo());

				});
		;

	}

	public static void salvaFile() throws IOException {
		String SalvaTXT = "";
		for (Catalogo_Bibliotecario Lista : Catalogo.values()) {
			SalvaTXT += Lista.getCodiceISBN() + "#" + Lista.getTitolo() + "#" + "\n";
		}
		FileUtils.writeStringToFile(file, SalvaTXT, "UTF-8", true);
		System.out.println("Testo scritto su file " + file.getPath());
	}

	public static List<Catalogo_Bibliotecario> caricaFile() throws IOException {
		Catalogo.clear();
		String FileTXT = FileUtils.readFileToString(file, "UTF-8");

		System.out.println(FileTXT);

		String[] p = FileTXT.split("#");

		for (String s : p) {

			String[] par = s.split("@");
			Catalogo_Bibliotecario libri = new Catalogo_Bibliotecario(par[0], s, Integer.parseInt(par[1]), null);
			((List<Catalogo_Bibliotecario>) Catalogo).add(libri);
		}

		return (List<Catalogo_Bibliotecario>) Catalogo;
	}
}
