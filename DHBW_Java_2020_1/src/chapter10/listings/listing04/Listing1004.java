package chapter10.listings.listing04;

public class Listing1004 {

	public static void main(String[] args) {

		String text = "Warenkorb";

		Printer.print(text, new Translator() {
			public String translate(String text) {
				return text.toLowerCase();
			}
		});

	}

}
