package Esercizio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Elemento_Multimediale[] Element= new Elemento_Multimediale[5];
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < Element.length; i++) {
			System.out.println("Cosa vuoi creare");
			String select = sc.nextLine();
			if(select.equals("Video") ) {
				System.out.println("inserisci il titolo");
				String titolo = sc.nextLine();
				System.out.println("inserisci la durata");
				int durata = sc.nextInt();
				System.out.println("inserisci il volume");
				int volume = sc.nextInt();
				System.out.println("inserisci la luminositá");
				int luminositá = sc.nextInt();
				sc.nextLine();
				Video V = new Video(titolo, durata, volume,luminositá);
				Element[i] = V;
				
			} else if(select.equals("Registrazione_Audio")) {
				System.out.println("inserisci il titolo");
				String titolo = sc.nextLine();
				System.out.println("inserisci la durata");
				int durata = sc.nextInt();
				System.out.println("inserisci il volume");
				int volume = sc.nextInt();
				sc.nextLine();
				Registrazione_Audio A = new Registrazione_Audio(titolo, durata, volume);
				Element[i] = A;
				
			} else if(select.equals("Immagine")) {
				System.out.println("inserisci il titolo");
				String titolo = sc.nextLine();
				System.out.println("inserisci la luminositá");
				int luminositá = sc.nextInt();
				sc.nextLine();
				
				Immagine IMG = new Immagine(titolo, luminositá);
				Element[i] = IMG;
				
			} 
		}
		
		int seleziona;
		do {
			System.out.println("");
			seleziona = sc.nextInt();
			if(seleziona >= 1 && seleziona <= 5) {
				
				if(Element[seleziona -1] instanceof Video) {
					Video V1 = (Video)Element[seleziona -1];
					V1.Play();
				} else if(Element[seleziona -1] instanceof Registrazione_Audio) {
					Registrazione_Audio A1 = (Registrazione_Audio)Element[seleziona -1];
					A1.Play();
				} else if(Element[seleziona -1] instanceof Immagine) {
					Immagine IMG = (Immagine)Element[seleziona -1];
					IMG.Show();
				}
			} 
		} while ( seleziona != 0);
		
	}
	
	
	

}
