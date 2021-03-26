package chapter05.listings.listing10;

public abstract class Product implements Sellable {

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

	public final void setPrice(double price) {
		this.price = price;
	}

	public final void setPrice(Double price) {
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

	public abstract String toString();

}
