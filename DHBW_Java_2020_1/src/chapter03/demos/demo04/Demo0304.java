package chapter03.demos.demo04;

/**
 * Schleifen
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0304 {

	public static void main(String[] args) {

		/*
		 * while-Schleife
		 */
		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		/*
		 * for-Schleife
		 */
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}

		String text = "Hallo Welt!";
		for (int j = 0; j < text.length(); j++) {
			System.out.println(j + ": " + text.charAt(j));
		}

		/*
		 * do/while-Schleife
		 */
		int k = 1;

		do {
			System.out.println(k);
			k++;
		} while (k <= 10);

		/*
		 * Sichtbarkeit der Schleifenvariablen
		 */
		System.out.println(i);
		// System.out.println(j);
		System.out.println(k);

	}

}
