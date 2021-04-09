package chapter04.demos.demo04;

/**
 * Stringvergleiche mit == und equals(Object)
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0404 {

	public static void main(String[] args) {

		String s1 = new String("Hallo Welt!");
		String s2 = new String("Hallo Welt!");

		// Der Vergleichsoperator == überprüft, ob zwei Referenzvariablen das
		// gleiche Objekte referenzieren
		if (s1 == s2) {
			System.out.println("s1 == s2");
		}

		// Die Methode equals(Object) überprüft, ob zwei Objekte "gleich" sind.
		// Objekte der Klasse String sind gleich, wenn ihre Zeichenketten gleich sind
		if (s1.equals(s2)) {
			System.out.println("s1.equals(s2)");
		}

	}

}
