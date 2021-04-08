package chapter10.listings.listing02;

public class Property implements Sellable {

	/*
	 * Attribute
	 */
	private int id;
	private String description;
	private double price;

	/*
	 * Methoden
	 */
	public Property(int id, String description, double price) {
		this.id = id;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

}
