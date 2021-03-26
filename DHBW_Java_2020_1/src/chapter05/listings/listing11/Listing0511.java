package chapter05.listings.listing11;

import java.util.ArrayList;

public class Listing0511 {

	public static void main(String[] args) {

		ArrayList<Sellable> sellables = new ArrayList<>();

		sellables.add(new Goods("Brot", "Stück", 2.49, ClassOfGoods.BAKERY_PRODUCTS));
		sellables.add(new Service("Putzen", "Stunde", 50, true));
		sellables.add(new Property(18274, "Grundstück", 100000));

		for (Sellable sellable : sellables) {
			System.out.println(sellable.getId() + " - " + sellable.getDescription() + " - " + sellable.getPrice());
		}

	}

}
