package chapter05.listings.listing04;

import java.util.ArrayList;

public class Listing0504 {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<>();
		Product product;
		Goods goods = new Goods("Brot", "Stück", 2.49, ClassOfGoods.BAKERY_PRODUCTS);
		Service service = new Service("Putzen", "Stunde", 50, true);

		product = goods; // expliziter Upcast
		products.add(product);

		products.add(service); // impliziter Upcast

		for (Product p : products) {
			System.out.println(p.toString());
		}

	}

}
