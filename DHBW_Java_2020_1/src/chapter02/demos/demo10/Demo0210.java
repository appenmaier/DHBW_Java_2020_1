package chapter02.demos.demo10;

import java.util.Scanner;

/**
 * Konsoleneingaben mit Hilfe der Klasse Scanner
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0210 {

	public static void main(String[] args) {

		// Scanner initialisieren
		Scanner sc = new Scanner(System.in);

		// Werte auslesen
		System.out.print("Bitte eine ganze Zahl eingeben: ");
		int int1 = sc.nextInt();
		System.out.println("int1: " + int1);

		System.out.print("Bitte eine Dezimalzahl eingeben: ");
		double double1 = sc.nextDouble();
		System.out.println("double1: " + double1);

		System.out.print("Bitte einen Wahrheitswert eingeben: ");
		boolean boolean1 = sc.nextBoolean();
		System.out.println("boolean1: " + boolean1);

		System.out.print("Bitte ein einzelnes Zeichen eingeben: ");
		char char1 = sc.next().charAt(0);
		System.out.println("char1: " + char1);

		System.out.print("Bitte eine Zeichenkette eingeben: ");
		sc.nextLine();
		String string1 = sc.nextLine();
		System.out.println("string1: " + string1);

		// Scanner schließen
		sc.close();

	}

}
