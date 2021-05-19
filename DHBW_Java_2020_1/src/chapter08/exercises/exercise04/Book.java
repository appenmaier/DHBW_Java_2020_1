package chapter08.exercises.exercise04;

/**
 * Buch
 * 
 * @author Daniel Appenmaier
 *
 */
public class Book {

	/*
	 * Attribute
	 */
	private String title;
	private String author;
	private String genre;

	/*
	 * Methoden
	 */
	public Book(String title, String author, String genre) {
		this.title = title;
		this.author = author;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

}
