package chapter05.listings.listing03;

public class Listing0503 {

	public static void main(String[] args) {

		Goods goods = new Goods("Brot", "Stück", 2.49, ClassOfGoods.BAKERY_PRODUCTS);
		System.out.println(goods.getClass().getSimpleName());

	}

}
