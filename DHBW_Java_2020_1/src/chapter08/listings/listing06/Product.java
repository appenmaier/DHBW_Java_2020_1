package chapter08.listings.listing06;

import java.io.Serializable;

public abstract class Product implements Sellable, Serializable {

	/*
	 * Attribute
	 */
	protected String description;
	protected String unit;
	protected double price;

	public static int noProducts;
	private static final long serialVersionUID = 1L;

	/*
	 * Methoden
	 */
	public Product(String description, String unit, double price) throws InvalidPriceException {
		this.description = description;
		this.unit = unit;
		setPrice(price);
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

	public final void setPrice(double price) throws InvalidPriceException {
		if (price <= 0) {
			throw new InvalidPriceException();
		}
		this.price = price;
	}

	public final void setPrice(Double price) throws InvalidPriceException {
		if (price <= 0) {
			throw new InvalidPriceException();
		}
		this.price = price;
	}

	public static int getNoProducts() {
		return noProducts;
	}

	public void displaySellable() {
		displayProduct();
	}

}
