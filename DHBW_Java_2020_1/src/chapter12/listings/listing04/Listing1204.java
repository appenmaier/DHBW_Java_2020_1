package chapter12.listings.listing04;

import java.util.ArrayList;
import java.util.Collections;

public class Listing1204 {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<>();

		try {
			products.add(new Goods("Brot", "Stück", 2.49, ClassOfGoods.BAKERY_PRODUCTS));
			products.add(new Service("Putzen", "Stunde", 50, true));
		} catch (InvalidPriceException e) {
			e.printStackTrace();
		}

		Collections.sort(products);

	}

}
