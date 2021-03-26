package chapter03.listings.listing16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Listing0316 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("C:/Temp/names.txt");
		Scanner scanner = new Scanner(file);

		ArrayList<String> names = new ArrayList<>();

		while (scanner.hasNextLine()) {
			names.add(scanner.nextLine());
		}

		for (String name : names) {
			System.out.println(name);
		}

		scanner.close();

	}

}
