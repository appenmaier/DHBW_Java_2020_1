package chapter03.exercises.exercise16;

import java.util.Scanner;

public class Exercise0316 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Bitte geben Sie eine ISBN ohne Prüfziffer ein: ");
		String input = scanner.next();
		
		scanner.close();

		int[] isbn = new int[input.length()];
		for (int i = 0; i < input.length(); i++) {
			isbn[i] = Character.getNumericValue(input.charAt(i));
		}

		int checkDigit = (10 - ((isbn[0] + isbn[2] + isbn[4] + isbn[6] + isbn[8] + isbn[10]
				+ 3 * (isbn[1] + isbn[3] + isbn[5] + isbn[7] + isbn[9] + isbn[11])) % 10)) % 10;

		System.out.println("Die Prüfziffer lautet " + checkDigit);

	}

}

