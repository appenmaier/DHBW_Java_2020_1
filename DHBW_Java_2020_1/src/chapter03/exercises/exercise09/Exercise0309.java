package chapter03.exercises.exercise09;

import java.util.Scanner;

public class Exercise0309 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte eine Zeichenkette eingeben: ");
		String text = sc.nextLine();

		System.out.print("Bitte das zu analysierende Zeichen eingeben: ");
		char token = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == token) {
				count++;
			}
		}

		double percentage = count * 100.0 / text.length();

		System.out.printf("Absoluter Anteil: %d%n", count);
		System.out.printf("Prozentualer Anteil: %.2f%%", percentage);

		sc.close();

	}

}
