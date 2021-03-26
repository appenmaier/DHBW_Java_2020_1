package chapter04.listings.listing04;

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
	public void setId(int id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void setPrice(double price) {
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
