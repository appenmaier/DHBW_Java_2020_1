package chapter03.listings.listing08;

public class Listing0308 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			if (i == 6) {
				break;
			}

			if (i % 2 == 0) {
				continue;
			}

			System.out.println(i);

		}

	}

}
