package chapter03.listings.listing14;

public class Listing0314 {

	public static void main(String[] args) {

		print("Hans");
		printAll("Peter", "Lisa");
		printAll("Heidi", "Franz", "Fritz");

	}

	public static void print(String text) {
		System.out.println(text);
	}

	public static void printAll(String... texts) {
		for (String text : texts) {
			System.out.println(text);
		}
	}

}
