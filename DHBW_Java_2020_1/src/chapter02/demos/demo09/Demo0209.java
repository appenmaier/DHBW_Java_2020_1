package chapter02.demos.demo09;

/**
 * Zeichenketten
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0209 {

	public static void main(String[] args) {

		String text = "Hallo Welt!";

		char char5 = text.charAt(4);
		char char1 = text.charAt(0);
		int length = text.length();

		System.out.println("char5: " + char5);
		System.out.println("char1: " + char1);
		System.out.println("length: " + length);

		String text2 = "Unicodezeichen: \u0041";
		String text3 = "Tabulator:\tText";
		String text4 = "Zeilenumbruch:\nText";
		String text5 = "Anführungszeichen: \"Text\"";
		String text6 = "Umgedrehter Schrägstrich: \\";

		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text4);
		System.out.println(text5);
		System.out.println(text6);

		// bis Java 15
		String text7 = "<html>\n\t<body>\n\t\t<p>\n\t\t\tHallo Welt!\n\t\t</p>\n\t</body>\n</html>";
		System.out.println(text7);

		// ab Java 15
		String text8 = """
				<html>
					<body>
						<p>
							Hallo Welt!
						</p>
					</body>
				</html>""";
		System.out.println(text8);

	}

}
