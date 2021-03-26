package chapter13.listings.listing01;

public class LinearSearch {

	private static int counter;

	public static int linearSearch(int key, int[] data) {
		for (int i = 0; i < data.length; i++) {
			counter++;
			if (data[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static int getCounter() {
		return counter;
	}

}
