package chapter04.demos.demo05;

/**
 * Statische und nicht-statische Elemente einer Klasse
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0405 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb("rot");
		LightBulb blueLightBulb = new LightBulb("blau");

		TableLamp l1 = new TableLamp();
		TableLamp l2 = new TableLamp(redLightBulb);
		TableLamp l3 = new TableLamp(blueLightBulb);

		int numberOfTableLamps = TableLamp.getNumberOfTableLamps();
		System.out.println("Anzahl Tischleuchten: " + numberOfTableLamps);

	}

}
