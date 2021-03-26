package chapter10.listings.listing04;

public class Printer {

	public static void print(String text, Translator translator) {
		System.out.println(translator.translate(text));
	}

}
