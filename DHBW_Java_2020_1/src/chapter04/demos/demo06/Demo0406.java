package chapter04.demos.demo06;

import java.time.LocalDateTime;

/**
 * Wichtige Klassen der Java API
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0406 {

	public static void main(String[] args) {

		// Wrapper-Klassen (Byte, Short, Integer, Long, Float, Double, Character,
		// Boolean)
		int int1 = Integer.valueOf("5");
		boolean boolean1 = Boolean.valueOf("true");

		System.out.println("int1: " + int1);
		System.out.println("boolean1: " + boolean1);

		byte byte1 = -123;
		Integer int2 = Byte.toUnsignedInt(byte1);
		System.out.println("int2: " + int2);

		// Mathematische Funktionen (Math)
		int a = 5, b = 3;
		double c;

		c = (double) Math.max(a, b) + Math.pow(a, b) + Math.PI;
		System.out.println("c: " + c);

		// Laufzeitmessung Light (System)
		long start = System.currentTimeMillis();

		for (int i = 0; i < 1000; i++) {
			System.out.println(Math.random());
		}

		long end = System.currentTimeMillis();

		System.out.println("Laufzeit in ms: " + (end - start));

		// Zeit- und Datumsfunktionen (LocalDateTime)
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now: " + now);
		System.out.println("dayOfYear: " + now.getDayOfYear());

	}

}
