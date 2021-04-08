package chapter12.listings.listing05;

public final class Goods extends Product {

	/*
	 * Attribute
	 */
	private ClassOfGoods classOfGoods;

	/*
	 * Methoden
	 */
	public Goods(String description, String unit, double price, ClassOfGoods classOfGoods)
			throws InvalidPriceException {
		super(description, unit, price);
		this.classOfGoods = classOfGoods;
	}

	public String toString() {
		return id + " - " + description + " - " + classOfGoods.getDescription() + " - " + unit + " - " + price;
	}

	public ClassOfGoods getClassOfGoods() {
		return classOfGoods;
	}

}
