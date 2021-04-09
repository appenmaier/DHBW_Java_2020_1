package chapter04.demos.demo02;

/**
 * Referenzvariablen
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0402 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb();
		redLightBulb.setColour("rot");

		LightBulb blueLightBulb = new LightBulb();
		blueLightBulb.setColour("blau");

		int i;
		TableLamp l1;

		i = 5;
		l1 = new TableLamp();
		l1.changeLightBulb(blueLightBulb);
		l1.print();

		int x;
		TableLamp l2;

		x = i;
		l2 = l1;

		i = 7;
		l1.changeLightBulb(redLightBulb);
		l2.print();

		l1 = null;
		l2 = null;

	}

}
