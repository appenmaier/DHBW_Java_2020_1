package chapter02.demos.demo07;

/**
 * Typkonvertierung aka Typumwandlung aka Casting
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0207 {

	public static void main(String[] args) {

		int a = 14;
		int b = 3;
		double result;

		result = a / b; // implizite Typumwandlung
		System.out.println("a / b = " + result);

		result = (double) a / b; // explizite Typumwandlung
		System.out.println("(double) a / b = " + result);
		
	}

}
