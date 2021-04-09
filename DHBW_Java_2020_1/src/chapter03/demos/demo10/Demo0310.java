package chapter03.demos.demo10;

import java.util.ArrayList;

/**
 * Die Klasse ArrayList (Ausblick)
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0310 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		// Elemente anfügen
		names.add("Hans");
		names.add("Peter");
		names.add("Lisa");

		// Elemente einfügen
		names.add(1, "Max");
		names.add(1, "Moritz");

		// Elemente entfernen
		names.remove(3);
		names.remove("Lisa");

		// Elemente auslesen
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

	}

}
