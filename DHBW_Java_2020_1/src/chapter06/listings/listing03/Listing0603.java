package chapter06.listings.listing03;

public class Listing0603 {

	public static void main(String[] args) {

		try {
			Goods goods = new Goods("Brot", "Stück", 2.49, ClassOfGoods.BAKERY_PRODUCTS);
		} catch (InvalidPriceException e) {
			e.printStackTrace();
		}

	}

}
