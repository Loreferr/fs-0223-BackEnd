import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int posizione;
		int numero;
		int[] Arr = new int[5];
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = random.nextInt(10) + 1;
		}

		while (true) {
			try {
				System.out.println("inserisci un numero, 0 per terminare");
				numero = sc.nextInt();

				if (numero == 0) {
					break;
				} else if (numero < 0 || numero > 10) {
					throw new MyException("Valore non consentito!!!");
				}

				System.out.println("inserisci la posizione dell array da 0 a 4");
				posizione = sc.nextInt();

				if (posizione < 0 || posizione > Arr.length) {
					throw new MyException("Valore non consentito!!!");

				}
				Arr[posizione] = numero;
				for (int i = 0; i < Arr.length; i++) {
					System.out.println(Arr[i]);
				}

			} catch (MyException e) {
				System.out.println("Errore: " + e.getMessage());
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("inserisci un numero");
				sc.nextLine();
			}

		}

		System.out.println("Programma terminato.");

	}
}
