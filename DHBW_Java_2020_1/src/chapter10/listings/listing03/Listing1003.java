package chapter10.listings.listing03;

public class Listing1003 {

	public static void main(String[] args) {

		String text = "Supermarkt";

		class LocalClass implements Translator {
			public String translate(String text) {
				return text.toUpperCase();
			}
		}
		LocalClass localClass = new LocalClass();
		Printer.print(text, localClass);

	}

}
