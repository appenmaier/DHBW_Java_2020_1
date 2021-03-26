package chapter10.listings.listing01;

import java.util.ArrayList;

public class SuperStore {

	/*
	 * Attribute
	 */
	private String description;
	private ArrayList<Sellable> articles = new ArrayList<>();

	/*
	 * Methoden
	 */
	public SuperStore(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public ArrayList<Sellable> getArticles() {
		return articles;
	}

	public void addArticle(Sellable article) {
		articles.add(article);
	}

	public void displaySuperStore() {
		System.out.println(description);
		for (Sellable article : articles) {
			article.displaySellable();
		}
	}

	/*
	 * Innere Klassen
	 */
	public static interface Sellable {

		void displaySellable();

	}

	public static abstract class Product implements Sellable {

		/*
		 * Attribute
		 */
		protected String description;
		protected String unit;
		protected double price;

		public static int noProducts;

		/*
		 * Methoden
		 */
		public Product(String description, String unit, double price) {
			this.description = description;
			this.unit = unit;
			this.price = price;
			noProducts++;
		}

		public abstract void displayProduct();

		public String getDescription() {
			return description;
		}

		public String getUnit() {
			return unit;
		}

		public double getPrice() {
			return price;
		}

		public final void setPrice(double price) {
			this.price = price;
		}

		public final void setPrice(Double price) {
			this.price = price;
		}

		public static int getNoProducts() {
			return noProducts;
		}

		public void displaySellable() {
			displayProduct();
		}

	}

	public static final class Goods extends Product {

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

		public void displayProduct() {
			System.out.println(description + " - " + classOfGoods.getDescription() + " - " + unit + " - " + price);
		}

		public ClassOfGoods getClassOfGoods() {
			return classOfGoods;
		}

	}

	public static final class Service extends Product {

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

		public void displayProduct() {
			String standardService = (isStandardService) ? "Standardservice" : "individueller Service";
			System.out.println(description + " - " + standardService + " - " + unit + " - " + price);
		}

		public boolean isStandardService() {
			return isStandardService;
		}

	}

	public static class Property implements Sellable {

		/*
		 * Attribute
		 */
		private int id;
		private String description;
		private double price;

		/*
		 * Methoden
		 */
		public Property(int id, String description, double price) {
			this.id = id;
			this.description = description;
			this.price = price;
		}

		public int getId() {
			return id;
		}

		public String getDescription() {
			return description;
		}

		public double getPrice() {
			return price;
		}

		public void displaySellable() {
			System.out.println(id + " - " + description + "- " + price);
		}

	}

}
