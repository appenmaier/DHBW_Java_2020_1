package chapter03.demos.demo06;

/**
 * Felder / Arrays
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0306 {

	public static void main(String[] args) {

		// Deklaration und Initialisierung von Feldern
		String[] names = new String[3];
		int[] is = { 6, 2, 9, 7, 2, 1, 0 }; // new int[7];

		// Zugriff auf Feld-Elemente
		names[0] = "Hans";
		names[1] = "Peter";
		names[2] = "Lisa";

		System.out.println("is[0]: " + is[0]);
		System.out.println("is[2]: " + is[2]);
		// System.out.println("is[7]: " + is[7]);

		// Ausgabe von Feldern
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		for (int i : is) {
			System.out.println(i);
		}
		
		for (String name : names) {
			System.out.println(name);
		}

	}

}
