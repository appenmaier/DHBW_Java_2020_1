package chapter05.listings.listing11;

public final class Goods extends Product {

	/*
	 * Attribute
	 */
	private ClassOfGoods classOfGoods;

	/*
	 * Methoden
	 */
	public Goods(String description, String unit, double price, ClassOfGoods classOfGoods) {
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
