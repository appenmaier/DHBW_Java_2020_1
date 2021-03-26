package chapter03.listings.listing09;

public class Listing0309 {

	public static void main(String[] args) {

		System.out.println(calcIterative(5));
		System.out.println(calcRecursive(5));

	}

	public static double calcIterative(int n) {
		double x = 1.0;
		int i;
		for (i = 2; i <= n; i++) {
			x = x * i;
		}
		return x;
	}

	public static double calcRecursive(int n) {
		if (n <= 1) {
			return 1.0;
		} else {
			return n * calcRecursive(n - 1);
		}
	}

}
