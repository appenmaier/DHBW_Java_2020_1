package chapter13.listings.listing02;

public class SelectSort {

	private static int counter;

	public static int[] selectSort(int[] data, boolean print) {
		for (int i = 0; i < data.length - 1; i++) {
			counter++;
			int index = i;
			for (int j = i + 1; j < data.length; j++)
				if (data[j] < data[index]) {
					index = j;
				}
			int temp = data[index];
			data[index] = data[i];
			data[i] = temp;
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
