package chapter10.listings.listing01;

public class Listing1001 {

	public static void main(String[] args) {

		SuperStore superStore = new SuperStore("Supermarkt");
		try {
			SuperStore.Goods goods = new SuperStore.Goods("Brot", "Stück", 2.49, ClassOfGoods.BAKERY_PRODUCTS);
		} catch (InvalidPriceException e) {
			e.printStackTrace();
		}

	}

}