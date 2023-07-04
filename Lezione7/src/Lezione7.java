import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lezione7 {

	public static void main(String[] args) {
		Test();

	}

	private static void Test() {
		Set<String> s = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il numero di Elementi");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Inserisci la parola da Inserire");
			String parola = sc.nextLine();
			s.add(parola);
		}
		System.out.println(s.size());
		Object[] arr = s.toArray();
		for (Object e : arr) {
			System.out.println("Elemento: " + e);
			System.out.println("Elemento: " + e);

		}
		for (Object e : arr) {
			System.out.println("Elemento: " + e);

		}

	}
}
