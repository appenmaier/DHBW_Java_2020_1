package chapter05.listings.listing05;

public class Product {

	/*
	 * Attribute
	 */
	protected int id;
	protected String description;
	protected String unit;
	protected double price;

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
