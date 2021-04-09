package chapter03.demos.demo08;

/**
 * Variable Argumentlisten
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0308 {

	public static void main(String[] args) {
		print("Hans"); // Demo0308.print("Hans");
		print("Peter");
		print("Lisa");
		printAll("Hans");
		printAll("Hans", "Peter");
		printAll("Hans", "Peter", "Lisa");
	}

	public static void print(String text) {
		System.out.println(text);
	}

	public static void printAll(String... texts) { // String[] texts
		for (String text : texts) {
			System.out.println(text);
		}
	}

}
