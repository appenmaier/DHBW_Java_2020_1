package chapter08.listings.listing05;

public class Listing0805 {

	public static void main(String[] args) {

		// absolute Pfadangaben
		String absolutePathDocumentA = "C:/Temp/DocumentA.txt";
		String absolutePathDocumentB = "C:/Users/User/workspace/Project/documents/DocumentB.txt";

		// relative Pfadangaben
		String relativePathDocumentA = "../../../../Temp/DocumentA.text";
		String relativePathDocumentB = "documents/DocumentB.txt";

		// Systemeigenschaft user.dir
		String userDirectory = System.getProperty("user.dir");

	}

}
