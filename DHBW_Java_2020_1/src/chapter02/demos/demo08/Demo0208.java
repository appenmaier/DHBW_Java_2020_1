package chapter02.demos.demo08;

/**
 * Numerische Operatoren
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0208 {

	public static void main(String[] args) {

		int a = 5, b = 3;
		int c;

		// Addition
		c = a + b;
		System.out.println(a + " + " + b + " = " + c);

		// Subtraktion
		c = a - b;
		System.out.println(a + " - " + b + " = " + c);

		// Multiplikation
		c = a * b;
		System.out.println(a + " * " + b + " = " + c);

		// Ganzahlige Division
		c = a / b; // ganzahliger Quotient
		System.out.println(a + " / " + b + " = " + c);
		c = a % b; // Divisionsrest
		System.out.println(a + " % " + b + " = " + c);

		// Division
		System.out.println("(double) " + a + " / " + b + " = " + ((double) a / b));

		System.out.println();

		// Inkrementieren
		c = 0;
		c = c + 1;
		c += 1; // c = c + (1);
		c++;
		System.out.println("c: " + c);

		// Dekrementieren
		c = c - 1;
		c -= 1;
		c--;
		System.out.println("c: " + c);

		System.out.println();

		// Preinkrementieren vs. Postinkrementieren
		c = 0;
		a = 0;
		c = a++; // Postinkrementieren
		// Ergebnis = a; a = a + 1; c = Ergebnis
		System.out.println("c = a++: " + c);
		System.out.println("a: " + a);

		c = 0;
		a = 0;
		c = ++a; // Preinkrementieren
		// a = a + 1; Ergebnis = a; c = Ergebnis;
		System.out.println("c = ++a: " + c);
		System.out.println("a: " + a);

	}

}
