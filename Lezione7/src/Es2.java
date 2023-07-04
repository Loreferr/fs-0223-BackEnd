import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Es2 {

	public static void main(String[] args) {
		Test2();
		Test3();
		Test4();
	}

	static List<String> lista = new ArrayList<String>();

	public static void Test2() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Inserisci il numero di Elementi");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {

			int random = rand.nextInt(100) + 1;
			lista.add("Elemento : " + random);
		}

		System.out.println(lista);

	}

	public static void Test3() {
		List<String> lista2 = lista;
		System.out.println("Original List : " + lista2);
		Collections.reverse(lista2);
		System.out.println("Lista Invertita" + lista2);

	}

	public static void Test4() {
		List<String> lista3 = lista;
		Scanner sc = new Scanner(System.in);
		System.out.println("true o false?");
		boolean o = sc.nextBoolean();
		Object[] arr = lista3.toArray();
		if (o == true) {
			for (int i = 2; i < arr.length; i += 2) {
				System.out.println(arr[i]);
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
	}
}
