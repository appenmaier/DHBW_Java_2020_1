package chapter09.listings.listing04;

import java.util.ArrayList;

public class Listing0904 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(9);
		numbers.add(7);
		numbers.add(8);
		numbers.add(2);
		numbers.add(4);
		System.out.println(getIndex(numbers, 7));
	}

	static <T> int getIndex(ArrayList<T> list, T object) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(object)) {
				return i;
			}
		}
		return -1;
	}

}
