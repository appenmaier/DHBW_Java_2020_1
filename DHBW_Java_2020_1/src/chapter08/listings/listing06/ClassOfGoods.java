package chapter08.listings.listing06;

public enum ClassOfGoods {

	BAKERY_PRODUCTS("Backwaren"), DAIRY_PRODUCTS("Milchprodukte"), FRUITS("Obst"), VEGETABLES("Gem�se");

	/*
	 * Attribute
	 */
	private String description;

	/*
	 * Methoden
	 */
	private ClassOfGoods(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
