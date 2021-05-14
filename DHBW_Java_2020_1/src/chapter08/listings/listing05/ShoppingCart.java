package chapter08.listings.listing05;

import java.util.ArrayList;

public class ShoppingCart {

	/*
	 * Attribute
	 */
	private ArrayList<ShoppingCartItem> items = new ArrayList<>();

	/*
	 * Methoden
	 */
	public void addItem(Sellable article, int amount) {
		items.add(new ShoppingCartItem(article, amount));
	}

	public ArrayList<ShoppingCartItem> getItems() {
		return items;
	}

	/*
	 * Innere Klassen
	 */
	public class ShoppingCartItem {

		/*
		 * Attribute
		 */
		private Sellable article;
		private int amount;

		/*
		 * Methoden
		 */
		public ShoppingCartItem(Sellable article, int amount) {
			this.article = article;
			this.amount = amount;
		}

		public Sellable getArticle() {
			return article;
		}

		public int getAmount() {
			return amount;
		}

	}

}
