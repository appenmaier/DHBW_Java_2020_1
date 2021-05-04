package chapter08.demos.demo02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Zeichenorientiertes Lesen
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo02Reader {

	public static void main(String[] args) {

		File file = new File("C:/Temp/demo0802.txt");

		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] tokens = line.split(";");
				String name = tokens[0];
				boolean isCool = Boolean.valueOf(tokens[1]);
				System.out.println("name: " + name);
				System.out.println("isCool: " + isCool);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
