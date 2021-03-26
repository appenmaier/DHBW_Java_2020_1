package chapter04.listings.listing08;

public class Product {

	/*
	 * Attribute
	 */
	private int id;
	private String description;
	private String unit;
	private double price;

	public static int noProducts;

	/*
	 * Methoden
	 */
	public Product(String description, String unit, double price) {
		noProducts++;
		this.id = noProducts;
		this.description = description;
		this.unit = unit;
		this.price = price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public String getUnit() {
		return unit;
	}

	public double getPrice() {
		return price;
	}

	public static int getNoProducts() {
		return noProducts;
	}

	public String toString() {
		return id + " - " + description + " - " + unit + " - " + price;
	}

}
