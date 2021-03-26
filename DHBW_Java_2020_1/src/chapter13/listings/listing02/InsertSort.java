package chapter13.listings.listing02;

public class InsertSort {

	private static int counter;

	public static int[] insertSort(int[] data, boolean print) {
		int temp;
		for (int i = 1; i < data.length; i++) {
			counter++;
			int j = i;
			temp = data[j];
			while (j > 0 && data[j - 1] > temp) {
				data[j] = data[j - 1];
				j--;
			}
			data[j] = temp;
			if (print) {
				// Ausgabe
				System.out.println("Durchlauf " + counter);
				for (int x : data) {
					System.out.println(x);
				}
				System.out.println();
			}
		}
		return data;
	}

}
