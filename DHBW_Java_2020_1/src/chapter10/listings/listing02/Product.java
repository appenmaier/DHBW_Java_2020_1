package chapter10.listings.listing02;

public abstract class Product implements Sellable {

	/*
	 * Attribute
	 */
	protected String description;
	protected String unit;
	protected double price;

	public static int noProducts;

	/*
	 * Methoden
	 */
	public Product(String description, String unit, double price) {
		this.description = description;
		this.unit = unit;
		this.price = price;
		noProducts++;
	}

	public abstract void displayProduct();

	public String getDescription() {
		return description;
	}

	public String getUnit() {
		return unit;
	}

	public double getPrice() {
		return price;
	}

	public final void setPrice(double price) {
		this.price = price;
	}

	public final void setPrice(Double price) {
		this.price = price;
	}

	public static int getNoProducts() {
		return noProducts;
	}

	public void displaySellable() {
		displayProduct();
	}

}
