package chapter05.listings.listing11;

public enum ClassOfGoods {

	BAKERY_PRODUCTS("Backwaren"), DAIRY_PRODUCTS("Milchprodukte"), FRUITS("Obst"), VEGETABLES("Gemüse");

	/*
	 * Attribute
	 */
	private String description;

	/*
	 * Methoden
	 */
	ClassOfGoods(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
