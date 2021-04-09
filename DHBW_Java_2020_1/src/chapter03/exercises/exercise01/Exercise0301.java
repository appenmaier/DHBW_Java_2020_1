package chapter03.exercises.exercise01;

import java.util.Scanner;

public class Exercise0301 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Bitte eine Ganzzahl eingeben: ");
		int a = sc.nextInt();

		int b = a % 2;

		if (b == 0) {
			System.out.println("Die eingegebene Zahl ist gerade");
		} else {
			System.out.println("Die eingegebene Zahl ist ungerade");
		}

		sc.close();

	}

}
