package chapter05.listings.listing04;

public class Service extends Product {

	/*
	 * Attribute
	 */
	private boolean isStandardService;

	/*
	 * Methoden
	 */
	public Service(String description, String unit, double price, boolean isStandardService) {
		super(description, unit, price);
		this.isStandardService = isStandardService;
	}

	public String toString() {
		String standardService = (isStandardService) ? "Standardservice" : "individueller Service";
		return id + " - " + description + " - " + standardService + " - " + unit + " - " + price;
	}

	public boolean isStandardService() {
		return isStandardService;
	}

}
