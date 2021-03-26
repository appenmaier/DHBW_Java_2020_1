package chapter03.listings.listing04;

public class Listing0304 {

	public static void main(String[] args) {

		String unit = "kg";
		switch (unit) {
		case "l":
			System.out.println("Liter");
			break;
		case "kg":
			System.out.println("Kilogramm");
			break;
		case "pc":
			System.out.println("Stück");
			break;
		default:
			System.err.println("nicht definiert");
			break;
		}

	}

}
