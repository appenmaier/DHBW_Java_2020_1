package chapter04.listings.listing11;

import java.time.LocalDateTime;

public class Listing0411 {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();

		System.out.println("Jahr: " + now.getYear());
		System.out.println("Monat: " + now.getMonth());
		System.out.println("Tag: " + now.getDayOfMonth());

	}

}
