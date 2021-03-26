package chapter04.listings.listing08;

public class Listing0408 {

	public static void main(String[] args) {

		Product product = new Product("Brot", "Stück", 2.49);
		Product product2 = new Product("Milch", "Flasche", 0.79);
		Product product3 = new Product("Äpfel", "kg", 2.99);

		System.out.println(Product.getNoProducts());

	}

}
