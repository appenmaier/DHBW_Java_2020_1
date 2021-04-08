package chapter10.listings.listing02;

public class Listing1002 {

	public static void main(String[] args) {

		try {
			Goods goods = new Goods("Brot", "Stück", 2.49, ClassOfGoods.BAKERY_PRODUCTS);
			ShoppingCart shoppingCart = new ShoppingCart();
			ShoppingCart.ShoppingCartItem shoppingCartItem = shoppingCart.new ShoppingCartItem(goods, 2);
		} catch (InvalidPriceException e) {
			e.printStackTrace();
		}

	}

}
