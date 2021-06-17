package testexam;

public final class BluRay extends VideoStorageMedia implements OpticalStorageMedia {

	private int capacity;

	public BluRay(Movie movie, int capacity) {
		super(movie);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public String toString() {
		Movie movie = getMovie();
		String movieDescription = movie.getDescription();
		String movieGenreDescription = movie.getGenre().getDescription();
		short moviePublishingYear = movie.getPublishingYear();
		return movieDescription + ", " + movieGenreDescription + ", " + moviePublishingYear + ", " + capacity + "GB";
	}

}
