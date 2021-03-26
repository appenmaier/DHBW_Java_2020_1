package chapter08.listings.listing01;

import java.io.IOException;

public class Listing0801 {

	public static void main(String[] args) {

		byte input[] = new byte[256];
		int noBytes = 0;
		String output = "";

		try {
			noBytes = System.in.read(input);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (noBytes > 0) {
			output = new String(input, 0, noBytes);
			System.out.println(output);
		}

	}
}
