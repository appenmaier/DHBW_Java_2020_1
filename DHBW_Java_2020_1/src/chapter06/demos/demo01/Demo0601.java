package chapter06.demos.demo01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fehlerarten
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0601 {

	public static void main(String[] args) {

		/*
		 * Compiler-Fehler aka Syntax-Fehler
		 */
		// string x;
		// Hallo Welt;

		/*
		 * Logische Fehler
		 */
		System.out.println("4 + 5 = " + add(4, 5));

		/*
		 * Laufzeitfehler aka Ausnahmen
		 */
		// InputMismatchException
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Bitte eine ganze Zahl eingeben: ");
			int number = sc.nextInt();
			System.out.println("number: " + number);
			sc.close();
		} catch (InputMismatchException e) {
			System.err.println(e.getMessage());
		}

		// ArrayIndexOutOfBoundsException
		try {
			int[] numbers = { 3, 1, 6, 5 };
			int i = numbers[4];
			System.out.println("i: " + i);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}

		// NullPointerException
		try {
			String text = null;
			char character = text.charAt(0);
			System.out.println("character: " + character);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		// ClassCastException
		try {
			SuperClass superClass;
			SubClassA subClassA = new SubClassA();
			SubClassB subClassB;

			superClass = subClassA; // Upcast
			subClassB = (SubClassB) superClass; // Downcast
		} catch (ClassCastException e) {
			System.err.println(e.getMessage());
		}

	}

	public static int add(int a, int b) {
		return a - b;
	}

}
