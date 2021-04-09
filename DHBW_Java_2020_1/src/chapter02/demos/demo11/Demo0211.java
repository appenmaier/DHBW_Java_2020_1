package chapter02.demos.demo11;

import java.util.Locale;

/**
 * Konsolenausgaben mit Hilfe der print-Methoden
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0211 {

	public static void main(String[] args) {

		/*
		 * print- und println-Methode
		 */
		System.out.print("Text 1");
		System.out.println("Text 2");
		System.out.print("Text 3");
		System.out.println();

		/*
		 * printf-Methode
		 */

		// Aufbau einer Formatierungs-Regel:
		// %[flags][width][.precision]conversion-character

		// String-Formatierungen (s)
		String a = "Hallo";
		String b = "Welt";
		System.out.printf("%s %s!%n", a, b);
		System.out.printf("%S %S!%n", a, b); // Großbuchstabenkonvertierung
		System.out.printf("%20s %s!%n", a, b); // Festlegen der Ausgabenlänge
		System.out.printf("%-20s %s!%n", a, b); // linksbündige Ausgabe
		System.out.printf("%.2s%n", a); // Festlegen der Genauigkeit

		// Character- und Boolean-Formatierungen (c bzw. b)
		System.out.printf("%C%n", 'x'); // Großbuchstabenkonvertierung
		System.out.printf("%B%n", false); // Großbuchstabenkonvertierung

		// Integer-Formatierungen (d)
		System.out.println(1000000000);
		System.out.printf("%,d%n", 1000000000); // Festlegen des Tausendertrennzeichens
		System.out.printf(Locale.US, "%,d%n", 1000000000); // Festlegen des Tausendertrennzeichens

		// Float- Double-Formatierungen (f)
		System.out.printf("%.2f%n", 3.827162543); // Festlegen der Genauigkeit

	}

}
