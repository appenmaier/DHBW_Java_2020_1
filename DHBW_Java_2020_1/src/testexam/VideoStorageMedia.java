package testexam;

/**
 * Speichermedium für Filme
 * 
 * @author Daniel Appenmaier
 *
 */
public abstract class VideoStorageMedia {

	/*
	 * Attribute
	 */
	private Movie movie;

	/*
	 * Methoden
	 */
	public VideoStorageMedia(Movie movie) {
		this.movie = movie;
	}

	public Movie getMovie() {
		return movie;
	}

}