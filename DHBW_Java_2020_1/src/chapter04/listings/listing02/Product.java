package chapter04.listings.listing02;

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
	public void setId(int i) {
		this.id = i;
	}

	public void setDescription(String d) {
		this.description = d;
	}

	public void setUnit(String u) {
		this.unit = u;
	}

	public void setPrice(double p) {
		this.price = p;
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
