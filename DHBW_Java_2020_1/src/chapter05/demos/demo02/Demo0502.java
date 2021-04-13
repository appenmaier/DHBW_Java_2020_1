package chapter05.demos.demo02;

import java.util.ArrayList;

/**
 * Downcast
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0502 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb(Colour.RED);
		LightBulb blueLightBulb = new LightBulb(Colour.BLUE);

		TableLamp t1 = new TableLamp(redLightBulb);
		TableLamp t2 = new TableLamp(blueLightBulb);

		FlashLight f1 = new FlashLight();
		FlashLight f2 = new FlashLight();

		ArrayList<Light> lights = new ArrayList<>();
		lights.add(t1);
		lights.add(t2);
		lights.add(f1);
		lights.add(f2);

		// bis Java 16
		for (Light l : lights) {
			if (l instanceof TableLamp) {
				TableLamp t;
				t = (TableLamp) l; // Downcast
				t.plugIn();
			}
			l.switchOn();
			l.print();
		}

		// ab Java 16
//		for (Light l : lights) {
//			if (l instanceof TableLamp t) {
//				t.plugIn();
//			}
//			l.switchOn();
//			l.print();
//		}

	}

}
