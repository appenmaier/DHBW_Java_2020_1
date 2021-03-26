package chapter12.listings.listing01;

public final class Service extends Product {

	/*
	 * Attribute
	 */
	private boolean isStandardService;

	/*
	 * Methoden
	 */
	public Service(String description, String unit, double price, boolean isStandardService)
			throws InvalidPriceException {
		super(description, unit, price);
		this.isStandardService = isStandardService;
	}

	public void displayProduct() {
		String standardService = (isStandardService) ? "Standardservice" : "individueller Service";
		System.out.println(description + " - " + standardService + " - " + unit + " - " + price);
	}

	public boolean isStandardService() {
		return isStandardService;
	}

}
