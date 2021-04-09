package chapter03.exercises.exercise15;

public class Exercise0315 {

	public static void main(String[] args) {

		int[] input = { 4, 8, 2, 6, 9, 1 };
		int[] output = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			output[input.length - 1 - i] = input[i];
		}

		System.out.print("Eingabe:");
		for (int i : input) {
			System.out.print(" " + i);
		}
		System.out.println();

		System.out.print("Ausgabe:");
		for (int i : output) {
			System.out.print(" " + i);
		}
		System.out.println();

	}

}
