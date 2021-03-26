package chapter03.listings.listing02;

public class Listing0302 {

	public static void main(String[] args) {

		int amount = 6;

		if (amount >= 10) {
			System.out.println("viel");
		} else if (amount == 0) {
			System.out.println("nichts");
		} else if (amount > 0 && amount <= 5) {
			System.out.println("wenig");
		} else if (amount < 0) {
			System.out.println("nicht definiert");
		} else {
			System.out.println("irgendwas zwischen wenig und viel");
		}

	}

}
