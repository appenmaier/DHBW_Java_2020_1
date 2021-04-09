package chapter03.demos.demo01;

import java.util.Scanner;

/**
 * Einfach- und Mehrfachverzweigungen mit if-else
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0301 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int age;

		System.out.print("Bitte Dein Alter eingeben: ");
		age = sc.nextInt();

		/*
		 * Einfachverzweigung
		 */
		if (age >= 18) {
			System.out.println("Du bist volljährig");
		} else {
			System.out.println("Du bist minderjährig");
		}

		// Vergleichsoperatoren: != (ungleich), == (gleich), > (größer), >=
		// (gößergleich), < (kleiner), <= (kleinergleich)
		// Logische Operatoren: && (UND), || (ODER), ! (NICHT)

		/*
		 * Mehrfachverzweigungen (aka if-else-if-Leiter aka kaskadierte Verzweigung)
		 */
		if (age < 12) {
			System.out.println("Du bist ein Kind");
		} else if (age < 18) {
			System.out.println("Du bist ein Jugendlicher");
		} else {
			System.out.println("Du bist ein Erwachsener");
		}

		/*
		 * Vergleiche bei Zeichenketten
		 */
		System.out.print("Bitte \"true\" eingeben: ");
		String text = sc.next();
		if (text.equals("true")) {
			System.out.println("Du hast \"true\" eingegeben");
		} else {
			System.out.println("Du hast nicht \"true\" eingegeben");
		}

		/*
		 * Bedingte Zuweisung
		 */
		String ageText;
		if (age < 18) {
			ageText = "minderjährig";
		} else {
			ageText = "volljährig";
		}
		System.out.println("Du bist " + ageText);

		ageText = (age < 18) ? "minderjährig" : "volljährig";
		System.out.println("Du bist " + ageText);

		sc.close();

	}

}
