package chapter05.listings.listing01;

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

	public boolean isStandardService() {
		return isStandardService;
	}

}
