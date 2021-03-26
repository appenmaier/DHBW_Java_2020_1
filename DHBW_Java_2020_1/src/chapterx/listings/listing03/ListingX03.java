package chapterx.listings.listing03;

public class ListingX03 {

	public static void main(String[] args) {

		String unit = "l";

		String unitText = switch (unit) {
		case "l", "L" -> "Liter";
		case "kg", "KG" -> "Kilogramm";
		case "pc", "PC" -> "Stück";
		default -> "";
		};

		System.out.println(unitText);

	}

}
