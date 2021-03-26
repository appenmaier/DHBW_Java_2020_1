package chapter04.listings.listing07;

public class Product {

	/*
	 * Attribute
	 */
	private int id;
	private String description;
	private String unit;
	private double price;

	/*
	 * Methoden
	 */
	public Product(int id, String description, String unit, double price) {
		this.id = id;
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

	public String toString() {
		return id + " - " + description + " - " + unit + " - " + price;
	}

}
