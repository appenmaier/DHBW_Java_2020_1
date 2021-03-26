package chapter09.listings.listing01;

public class Listing0901 {

	public static void main(String[] args) {

		Box box = new Box();
		box.set(5);
		String i = (String) box.get(); // Laufzeitfehler

	}

}
