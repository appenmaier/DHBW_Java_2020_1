package testexam;

/**
 * Genre
 * 
 * @author Daniel Appenmaier
 *
 */
public enum Genre {

	/*
	 * Aufzählungskonstanten
	 */
	SCIFI("Science Fiction"), HORROR("Horror"), ACTION("Action"), COMEDY("Komödie");

	/*
	 * Attribute
	 */
	private String description;

	/*
	 * Methoden
	 */
	private Genre(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
