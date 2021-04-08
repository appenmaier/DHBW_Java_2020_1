package chapter12.listings.listing04;

import java.io.Serializable;

public abstract class Product implements Sellable, Serializable, Comparable<Product> {

	/*
	 * Attribute
	 */
	protected int id;
	protected String description;
	protected String unit;
	protected double price;

	public static int noProducts;
	private static final long serialVersionUID = 1L;

	/*
	 * Methoden
	 */
	public Product(String description, String unit, double price) throws InvalidPriceException {
		noProducts++;
		this.id = noProducts;
		this.description = description;
		this.unit = unit;
		setPrice(price);
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

	public int compareTo(Product p) {
		if (price - p.getPrice() < 0) {
			return -1;
		} else if (price - p.getPrice() > 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
