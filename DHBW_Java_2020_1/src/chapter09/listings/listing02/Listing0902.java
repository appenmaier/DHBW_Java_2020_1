package chapter09.listings.listing02;

public class Listing0902 {

	public static void main(String[] args) {

		GenericBox<Integer> genericBox = new GenericBox<>();
		genericBox.set(5);
		// String i = genericBox.get(); // Kompilierungsfehler

	}

}
