package chapter08.exercises.exercise04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Model für Exercise0804
 * 
 * @author Daniel Appenmaier
 *
 */
public class Model {

	/*
	 * Attribute
	 */
	private static Model instance;
	private ArrayList<Book> books;
	private String hitlist;

	/*
	 * Methoden
	 */
	private Model() {
		books = new ArrayList<>();
		loadBooks();
	}

	public static Model getInstance() {
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}

	public void loadBooks() {
		File file = new File("C:/Temp/books.txt");
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] tokens = line.split(";");
				Book book = new Book(tokens[0], tokens[1], tokens[2]);
				books.add(book);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void createHitlist(String searchTerm) {
		hitlist = "";
		for (Book b : books) {
			if (b.getTitle().contains(searchTerm) || b.getAuthor().contains(searchTerm)
					|| b.getGenre().contains(searchTerm)) {
				hitlist += b.getTitle() + " - " + b.getAuthor() + " - " + b.getGenre() + "\n";
			}
		}
	}

	public String getHitlist() {
		return hitlist;
	}

}
