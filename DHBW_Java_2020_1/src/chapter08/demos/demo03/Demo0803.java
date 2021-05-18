package chapter08.demos.demo03;

import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

/**
 * Absolute und relative Pfadangaben
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0803 {

	public static void main(String[] args) throws IOException {

		String pathDocumentA;
		String pathDocumentB;

		// absolute Pfadangaben
		pathDocumentA = "C:/Users/d054906/git/DHBW_Java_2020_1/DHBW_Java_2020_1/src/resources/documents/DocumentA.txt";
		checkPath("absolute Pfadangabe DocumentA", pathDocumentA);
		pathDocumentB = "C:/Temp/DocumentB.txt";
		checkPath("absolute Pfadangabe DocumentB", pathDocumentB);

		// relative Pfadangaben
		pathDocumentA = "src/resources/documents/DocumentA.txt";
		checkPath("relative Pfadangabe DocumentA", pathDocumentA);
		pathDocumentB = "../../../../../Temp/DocumentB.txt";
		checkPath("relative Pfadangabe DocumentB", pathDocumentB);

		// Systemeigenschaften
		String fileSeparator = System.getProperty("file.separator");
		String userWorkingDirectory = System.getProperty("user.dir");
		String userHomeDirectory = System.getProperty("user.home");
		System.out.println("fileSeparator: " + fileSeparator);
		System.out.println("userWorkingDirectory: " + userWorkingDirectory);
		System.out.println("userHomeDirectory: " + userHomeDirectory);
		
		Properties properties = System.getProperties();
		
		for (Entry<Object, Object> entry : properties.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

	public static void checkPath(String option, String path) throws IOException {
		File file = new File(path);
		if (file.exists()) {
			System.out.println(option);
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getCanonicalPath());
			System.out.println();
		} else {
			System.err.println(option);
		}
	}

}
