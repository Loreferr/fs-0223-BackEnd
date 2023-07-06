package Lezione9;

import java.time.LocalDate;
import java.util.List;

public class Order {
	long id;
	String status;
	LocalDate orderDate;
	LocalDate deliveryDate = orderDate.plusDays(7);
	List<Product> products;
	Customer customer;

	public Order(long id, String status, List<Product> products, Customer customer) {

		this.id = id;
		this.status = status;
		this.orderDate = LocalDate.now();
		this.deliveryDate = deliveryDate;
		this.products = products;
		this.customer = customer;
	}

}
