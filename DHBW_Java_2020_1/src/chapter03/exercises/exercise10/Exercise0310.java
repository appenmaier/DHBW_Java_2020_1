package chapter03.exercises.exercise10;

import java.util.Scanner;

public class Exercise0310 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte die erste Zeichenkette eingeben: ");
		String input1 = sc.nextLine();

		System.out.print("Bitte die zweite Zeichenkette eingeben: ");
		String input2 = sc.nextLine();

		sc.close();

		boolean identical = true;

		if (input1.length() != input2.length()) {
			identical = false;
		}

		if (identical) {
			for (int i = 0; i < input1.length(); i++) {
				char char1 = input1.charAt(i);
				char char2 = input2.charAt(i);
				char1 = Character.toUpperCase(char1);
				char2 = Character.toUpperCase(char2);
				if (char1 != char2) {
					identical = false;
					break;
				}
			}
		}

		if (identical) {
			System.out.println("Die beiden Zeichenketten sind identisch");
		} else {
			System.out.println("Die beiden Zeichenketten sind nicht identisch");
		}

	}

}
