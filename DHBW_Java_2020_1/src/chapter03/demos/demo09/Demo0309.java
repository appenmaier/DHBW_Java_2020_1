package chapter03.demos.demo09;

/**
 * Einschränkungen von Feldern
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0309 {

	public static void main(String[] args) {

		// Problem: Feldgröße?
		String[] names;
		// Lösung: Feld "überdimensionieren"
		names = new String[5];

		// Problem: "null"-Elemente dank "Überdimensionierung"
		names[0] = "Hans";
		names[4] = "Peter";

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println();

		// Lösung: "null"-Elemente überspringen/ignorieren
		for (String name : names) {
			if (name == null) {
				continue;
			}
			System.out.println(name);
		}
		
		System.out.println();

		// Problem: Feldgröße zu gering
		names[1] = "Heidi";
		names[2] = "Lisa";
		names[3] = "Max";
		// names[?] = "Maria";
		// Lösung: Feld umkopieren
		String[] tmp = new String[names.length * 2];
		for (int i = 0; i < names.length; i++) {
			tmp[i] = names[i];
		}
		names = tmp;
		names[5] = "Maria";

		for (String name : names) {
			if (name == null) {
				continue;
			}
			System.out.println(name);
		}
	}

}
