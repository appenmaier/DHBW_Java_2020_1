package chapter02.demos.demo03;

/**
 * Deklaration und Initialisierung von Variablen
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0203 {

	public static void main(String[] args) {

		/*
		 * Deklaration von Variablen
		 */
		int i;
		String name;
		String fullName, firstNameAndFamilyName; // Kamelschreibweise
		char errorFlag;

		/*
		 * Initialisierung
		 */
		i = 5;
		name = "Hans-Peter";
		errorFlag = 'X';
		char x = 'X';

		System.out.println("i: " + i);
		System.out.println("name: " + name);
		System.out.println("errorFlag: " + errorFlag);
		System.out.println("x: " + x);

		errorFlag = 'Y';

		System.out.println("errorFlag: " + errorFlag);

		/*
		 * ab Java 10
		 */
		var j = 1;
		j = 6;
		// j = "Lisa";

		System.out.println("j: " + j);

	}

}
