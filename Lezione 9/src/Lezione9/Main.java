package Lezione9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Customer Cliente1 = new Customer(1, "Ciccio", 2);
		Customer Cliente2 = new Customer(1, "Gamer", 2);
		List<Product> Lista1 = new ArrayList<Product>();
		Lista1.add(new Product(1, "TopoGigio", "Books", 25));
		Lista1.add(new Product(2, "Tumblur", "Books", 125));
		Lista1.add(new Product(3, "Fazzottero", "Baby", 10));
		Lista1.add(new Product(4, "Marzone", "Boys", 112));
		Lista1.add(new Product(5, "Cicciogamer", "Baby", 200));

		List<Order> Lista2 = new ArrayList<Order>();

		// Lista2.add(new Order(1, "Shipped", Lista1, Cliente2));

		Stream<Product> Books = Lista1.stream().filter((elex) -> {
			return elex.Category == "Books" && elex.price > 100;
		});
		Books.forEach((elex) -> {
			System.out.println(elex.id + " " + elex.name + " " + elex.Category + " " + elex.price);
		});

		List<Product> Baby = Lista1.stream().filter(elex -> elex.getCategory().equals("Baby"))
				.collect(Collectors.toList());
		for (Product elex : Baby) {
			System.out.println(elex.id + " " + elex.name + " " + elex.Category + " " + elex.price);
		}
		;

		List<Product> Boys = Lista1.stream().filter(elex -> elex.getCategory().equals("Boys"))
				.peek(elex -> elex.setPrice(elex.getPrice() * 0.9)).collect(Collectors.toList());
		for (Product elements : Boys) {
			System.out.println(elements.id + " " + elements.name + " " + elements.Category + " " + elements.getPrice());
		}
		Lista2.add(new Order(1, "Completed", Baby, Cliente1));
	}

}
