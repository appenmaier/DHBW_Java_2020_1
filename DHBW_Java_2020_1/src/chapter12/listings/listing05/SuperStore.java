package chapter12.listings.listing05;

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
			System.out.println(article.toString());
		}
	}

}
