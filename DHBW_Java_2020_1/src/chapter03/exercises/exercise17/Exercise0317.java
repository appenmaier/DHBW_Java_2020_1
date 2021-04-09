package chapter03.exercises.exercise17;

public class Exercise0317 {

	public static void main(String[] args) {

		int[] binaryNumber1 = { 1, 0, 1, 1, 0, 1, 1, 0 };
		int[] binaryNumber2 = { 0, 1, 0, 0, 0, 1, 1, 1 };
		int[] binaryNumber3 = new int[8];
		int subTotal = 0;
		int carry = 0;
		boolean overflow = false;

		for (int i = binaryNumber3.length - 1; i >= 0; i--) {
			subTotal = binaryNumber1[i] + binaryNumber2[i] + carry;
			if (subTotal > 1) {
				if (i == 0) {
					System.out.println("Überlauf");
					overflow = true;
					break;
				} else {
					binaryNumber3[i] = ((subTotal == 2) ? 0 : 1);
					carry = 1;
				}
			} else {
				binaryNumber3[i] = subTotal;
				carry = 0;
			}
		}

		if (!overflow) {
			System.out.print("  ");
			for (int i : binaryNumber1) {
				System.out.print(i);
			}
			System.out.println();
			System.out.print("+ ");
			for (int i : binaryNumber2) {
				System.out.print(i);
			}
			System.out.println();
			System.out.print("= ");
			for (int i : binaryNumber3) {
				System.out.print(i);
			}
		}

	}

}
