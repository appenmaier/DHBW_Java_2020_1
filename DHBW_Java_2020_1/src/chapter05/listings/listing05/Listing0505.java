package chapter05.listings.listing05;

public class Listing0505 {

	public static void main(String[] args) {

		Goods goods = new Goods("Brot", "Stück", 2.49, ClassOfGoods.BAKERY_PRODUCTS);

		if (goods instanceof Goods) {
			System.out.println(goods.toString());
		}

	}

}
