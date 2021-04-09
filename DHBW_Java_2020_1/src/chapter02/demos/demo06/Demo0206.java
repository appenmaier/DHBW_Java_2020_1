package chapter02.demos.demo06;

import java.math.BigDecimal;

/**
 * Elementare Datentypen
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0206 {

	public static void main(String[] args) {

		byte byte1 = 42; // Dezimalzahl
		byte byte2 = 0b00101010; // Binärzahl (Prefix 0b)
		byte byte3 = 052; // Oktalzahl (Prefix 0)
		byte byte4 = 0x2A; // Hexadezimalzahl (Prefix 0x)

		System.out.println("byte1: " + byte1);
		System.out.println("byte2: " + byte2);
		System.out.println("byte3: " + byte3);
		System.out.println("byte4: " + byte4);

		short short1 = 22732;
		int int1 = 90613;
		long long1 = 6271826374536L;

		char char1 = 'A';
		char char2 = 65; // Dezimalwert des Zeichens 'A'
		char char3 = 0b1000001; // Bitfolge des Zeichens 'A'
		char char4 = '\u0041'; // Unicode des Zeichens 'A'

		System.out.println("char1: " + char1);
		System.out.println("char2: " + char2);
		System.out.println("char3: " + char3);
		System.out.println("char4: " + char4);

		boolean boolean1 = true;

		float float1 = 0.1F;
		double double1 = 0.1;
		BigDecimal bigDecimal1 = new BigDecimal(0.1F);
		BigDecimal bigDecimal2 = new BigDecimal(0.1);
		
		System.out.println("float1: " + float1);
		System.out.println("double1: " + double1);
		System.out.println("bigDecimal1: " + bigDecimal1);
		System.out.println("bigDecimal2: " + bigDecimal2);
		
	}

}
