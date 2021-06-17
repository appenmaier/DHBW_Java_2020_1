package testexam;

/**
 * Film
 * 
 * @author Daniel Appenmaier
 *
 */
public class Movie {

	/*
	 * Attribute
	 */
	private String description;
	private Genre genre;
	private short publishingYear;

	/*
	 * Methoden
	 */
	public Movie(String description, Genre genre, short publishingYear) {
		this.description = description;
		this.genre = genre;
		this.publishingYear = publishingYear;
	}

	public String getDescription() {
		return description;
	}

	public Genre getGenre() {
		return genre;
	}

	public short getPublishingYear() {
		return publishingYear;
	}

}
