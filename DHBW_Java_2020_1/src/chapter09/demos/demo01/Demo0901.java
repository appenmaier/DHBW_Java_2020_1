package chapter09.demos.demo01;

/**
 * generische Entwicklung mit und ohne Java Generics
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0901 {

	public static void main(String[] args) {

		String text;

		/*
		 * generische Programmierung ohne Java Generics
		 */
		Box box1 = new Box();
		box1.setContent("Hallo Welt");

		Box box2 = new Box();
		box2.setContent(5);

		text = (String) box1.getContent();
		box1.setContent(5);
		text = (String) box1.getContent(); // Laufzeitfehler

		/*
		 * generische Programmierung mit Java Generics
		 */
		GenericBox<String> genericBox1 = new GenericBox<>();
		genericBox1.setContent("Hallo Welt");

		GenericBox<Integer> genericBox2 = new GenericBox<>();
		genericBox2.setContent(5);

		text = genericBox1.getContent();
		// genericBox1.setContent(5); // Kompilierungsfehler

		/*
		 * Namenskonventionen bei formalen Typparametern
		 */
		// ArrayList<E>: Data Element (E)
		// GenericBox<T>: Type (T)
		// HashMap<K, V>: Key (K), Value (V)
		// GenericSixPack<T, U, V, W, X, Y>: Type (T, U,...)

	}

}
