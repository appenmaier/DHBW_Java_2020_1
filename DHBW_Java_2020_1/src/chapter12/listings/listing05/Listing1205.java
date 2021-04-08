package chapter12.listings.listing05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Listing1205 {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<>();

		try {
			products.add(new Goods("Brot", "Stück", 2.49, ClassOfGoods.BAKERY_PRODUCTS));
			products.add(new Service("Putzen", "Stunde", 50, true));
		} catch (InvalidPriceException e) {
			e.printStackTrace();
		}

		Collections.sort(products, new Comparator<Product>() {
			public int compare(Product p1, Product p2) {
				return p1.getUnit().compareTo(p2.getUnit());
			}
		});

		Collections.sort(products, (p1, p2) -> p2.getUnit().compareTo(p1.getUnit()));

	}

}
