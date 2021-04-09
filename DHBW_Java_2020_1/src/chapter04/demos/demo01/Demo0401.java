package chapter04.demos.demo01;

/**
 * Klassen, Objekte, Attribute und Methoden
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0401 {

	public static void main(String[] args) {

		LightBulb blueLightBulb = new LightBulb();
		blueLightBulb.setColour("blau");

		LightBulb redLightBulb = new LightBulb();
		redLightBulb.setColour("rot");

		TableLamp l1 = new TableLamp();
		l1.changeLightBulb(blueLightBulb);
		l1.plugIn();
		l1.switchOn();
		l1.print();
		System.out.println();
		l1.pullThePlug();
		l1.changeLightBulb(redLightBulb);
		l1.print();

	}

}
