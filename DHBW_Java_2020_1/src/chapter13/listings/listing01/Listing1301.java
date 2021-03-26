package chapter13.listings.listing01;

import java.util.Arrays;
import java.util.Random;

public class Listing1301 {

	public static void main(String[] args) {

		int noValues = 100000;
		int[] data = new int[noValues];

		Random random = new Random();

		for (int i = 0; i < noValues; i++) {
			data[i] = random.nextInt(noValues * 10) + 1;
		}
		int key = data[random.nextInt(noValues)];
		Arrays.sort(data);

		System.out.println("Suchwert: " + key);
		System.out.println("Lineare Suche");
		System.out.println("Index: " + LinearSearch.linearSearch(key, data) + " Z�hler: " + LinearSearch.getCounter());
		System.out.println("Bin�rsuche");
		System.out.println("Index: " + BinarySearch.binarySearch(key, data) + " Z�hler: " + BinarySearch.getCounter());
		System.out.println("Interpolationssuche");
		System.out.println("Index: " + InterpolationSearch.interpolationSearch(key, data) + " Z�hler: "
				+ InterpolationSearch.getCounter());

	}

}
