package chapter02.listings.listing07;

public class Listing0207 {

	public static void main(String[] args) {
		int a = 1, b;
		b = doSomething(a);
	}

	public static int doSomething(int c) {
		// int d = a++; // Kompilierungsfehler
		int d = c++;
		return d;
	}

}
