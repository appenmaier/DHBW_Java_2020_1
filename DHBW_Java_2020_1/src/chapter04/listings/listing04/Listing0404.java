package chapter04.listings.listing04;

public class Listing0404 {

	public static void main(String[] args) {

		Product product = new Product();

		product.setDescription("Brot");
		product.setPrice(2.49);

		String description = product.getDescription();
		double price = product.getPrice();

		System.out.println(product.toString());

	}

}
