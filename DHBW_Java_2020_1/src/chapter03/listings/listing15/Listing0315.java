package chapter03.listings.listing15;

import java.util.ArrayList;

public class Listing0315 {

	public static void main(String[] args) {

		ArrayList<Integer> ids = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			ids.add(i);
			System.out.println(ids.get(i));
		}
		System.out.println(ids.size());

	}

}
