package chapter03.demos.demo02;

import java.util.Random;

/**
 * Pseudozufallszahlen
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0302 {

	public static void main(String[] args) {

		Random rd = new Random();
		int randomNumber = rd.nextInt(6) + 1;
		System.out.println("randomNumber: " + randomNumber);
		
		randomNumber = (int) (Math.random() * 6) + 1;
		System.out.println("randomNumber: " + randomNumber);
	}

}
