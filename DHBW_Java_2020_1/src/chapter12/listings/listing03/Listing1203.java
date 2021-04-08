package chapter12.listings.listing03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Listing1203 {

	public static void main(String[] args) {

		HashMap<Product, Integer> products = new HashMap<>();

		try {
			products.put(new Goods("Brot", "Stück", 2.49, ClassOfGoods.BAKERY_PRODUCTS), 9);
			products.put(new Service("Putzen", "Stunde", 50, true), 15);
		} catch (InvalidPriceException e) {
			e.printStackTrace();
		}

		Iterator<Entry<Product, Integer>> iterator = products.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Product, Integer> entry = iterator.next();
			System.out.println(entry.getKey().toString());
			System.out.println(entry.getValue());
		}

		for (Iterator<Entry<Product, Integer>> iterator2 = products.entrySet().iterator(); iterator2.hasNext();) {
			Entry<Product, Integer> entry = iterator2.next();
			System.out.println(entry.getKey().toString());
			System.out.println(entry.getValue());
		}

		for (Entry<Product, Integer> entry : products.entrySet()) {
			System.out.println(entry.getKey().toString());
			System.out.println(entry.getValue());
		}

	}

}
