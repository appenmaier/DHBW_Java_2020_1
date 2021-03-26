package chapter02.listings.listing09;

public class Listing0209 {

	public static void main(String[] args) {

		int a = 14;
		int b = 3;
		double result;

		// implizite Typumwandlung
		result = a / b;
		System.out.println(result); // Ausgabe: 4.0

		// explizite Typumwandlung
		result = (double) a / b;
		System.out.println(result); // Ausgabe: 4.666666666666667

	}

}
