package chapter12.listings.listing02;

import java.util.ArrayList;
import java.util.Iterator;

public class Listing1202 {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<>();

		try {
			products.add(new Goods("Brot", "Stück", 2.49, ClassOfGoods.BAKERY_PRODUCTS));
			products.add(new Service("Putzen", "Stunde", 50, true));
		} catch (InvalidPriceException e) {
			e.printStackTrace();
		}

		for (Iterator<Product> iterator = products.iterator(); iterator.hasNext();) {
			Product p = iterator.next();
			System.out.println(p.toString());
		}

		// Kurzschreibweise
		for (Product p : products) {
			System.out.println(p.toString());
		}

	}

}
