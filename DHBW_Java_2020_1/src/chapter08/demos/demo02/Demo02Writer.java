package chapter08.demos.demo02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Zeichenorientiertes Schreiben
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo02Writer {

	public static void main(String[] args) {

		File file = new File("C:/Temp/demo0802.txt");

		// bis Java 7
//		BufferedWriter bufferedWriter = null;
//		
//		try {
//			FileWriter fileWriter = new FileWriter(file);
//			bufferedWriter = new BufferedWriter(fileWriter);
//			bufferedWriter.write("Hallo Welt 2021");
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if (bufferedWriter != null) {
//				try {
//					bufferedWriter.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}

		// seit Java 7
		try (FileWriter fileWriter = new FileWriter(file, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			bufferedWriter.write("Hallo Welt 2022");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
