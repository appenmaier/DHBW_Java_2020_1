package chapter02.demos.demo05;

/**
 * Variablen, Konstante und Literale
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0205 {

	// Attribut
	static int x;

	// Konstante
	static final int Y = 4;

	public static void main(String[] args) {

		/*
		 * Variablen (variable Datenobjekte)
		 */
		String text = "Text 1";
		text = "Text 2";

		/*
		 * Konstante (fixe Datenobjekte mit Bezeichner)
		 */
		final double PI = 3.14159265359;
		// PI = 3;

		/*
		 * Literale (fixe Datenobjekte ohne Bezeichner)
		 */
		System.out.println(5);
		System.out.println("Hallo Welt!");
		System.out.println('X');
		System.out.println(3.14);

	}

}
