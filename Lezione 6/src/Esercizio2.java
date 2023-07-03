import java.util.InputMismatchException;
import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto();

	}

	public static void Auto() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("inserisci i km");
			try {

				int km = sc.nextInt();
				if (km >= 0) {
					System.out.println("inserisci i litri");
					int litri = sc.nextInt();
					System.out.println(km / litri);
				}

			} catch (ArithmeticException e) {
				System.out.println("divisione per 0 non fattibile");
				sc.nextLine();

			} catch (InputMismatchException e) {
				System.out.println("inserisci un numero!!");
				sc.nextLine();
			}
		}
	}
}
