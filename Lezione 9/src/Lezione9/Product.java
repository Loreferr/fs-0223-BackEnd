package Lezione9;

public class Product {
	long id;
	String name;
	String Category;
	double price;

	public Product(long id, String name, String category, double price) {

		this.id = id;
		this.name = name;
		Category = category;
		this.price = price;
	}

	private long getId() {
		return id;
	}

	private void setId(long id) {
		this.id = id;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return Category;
	}

	private void setCategory(String category) {
		Category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
