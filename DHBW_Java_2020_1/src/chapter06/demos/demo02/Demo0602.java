package chapter06.demos.demo02;

/**
 * Ausnahmenbehandlung
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0602 {

	public static void main(String[] args) {

		LightBulb redLigthBulb = new LightBulb(Colour.RED);

		TableLamp t = new TableLamp(redLigthBulb);
		try {
			t.plugIn();
			t.plugIn();
		} catch (AlreadyPluggedInException e) {
			System.err.println(e.getMessage());
		}

	}

}
