package chapter03.exercises.exercise14;

public class Exercise0314 {

	public static void main(String[] args) {

		int[] powerOfTwo = new int[16];

		for (int i = 0; i < powerOfTwo.length; i++) {
			powerOfTwo[i] = (int) Math.pow(2, i);
		}

		// Ausgabe
		System.out.println("Zweierpotenzen:");
		for (int i : powerOfTwo) {
			System.out.println(i);
		}

	}

}
