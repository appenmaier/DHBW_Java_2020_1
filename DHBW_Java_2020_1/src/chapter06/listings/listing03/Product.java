package chapter06.listings.listing03;

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

}
