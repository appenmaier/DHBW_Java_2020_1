package chapter08.listings.listing03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Listing0803 {

	public static void main(String[] args) {

		File file = new File("C:/Temp/text.txt");

		try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("Hallo Welt!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
