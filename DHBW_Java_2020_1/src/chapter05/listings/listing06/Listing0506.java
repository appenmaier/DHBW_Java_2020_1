package chapter05.listings.listing06;

import java.util.ArrayList;

public class Listing0506 {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<>();
		products.add(new Goods("Brot", "Stück", 2.49, ClassOfGoods.BAKERY_PRODUCTS));
		products.add(new Service("Putzen", "Stunde", 50, true));

		for (Product product : products) {
			if (product instanceof Goods) {
				Goods goods = (Goods) product; // Downcast
				System.out.println(goods.toString());
			}
		}

	}

}
