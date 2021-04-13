package chapter05.demos.demo01;

import java.util.ArrayList;

/**
 * Vererbung, Upcast und Polymorphie
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0501 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb(Colour.RED);
		LightBulb blueLightBulb = new LightBulb(Colour.BLUE);

		TableLamp t1 = new TableLamp(redLightBulb);
		TableLamp t2 = new TableLamp(blueLightBulb);

		FlashLight f1 = new FlashLight();
		FlashLight f2 = new FlashLight();

		// Ohne Vererbung
		ArrayList<TableLamp> tableLamps = new ArrayList<>();
		tableLamps.add(t1);
		tableLamps.add(t2);

		for (TableLamp t : tableLamps) {
			t.print();
			t.switchOn();
		}

		ArrayList<FlashLight> flashLights = new ArrayList<>();
		flashLights.add(f1);
		flashLights.add(f2);

		for (FlashLight f : flashLights) {
			f.print();
			f.switchOn();
		}

		// Mit Vererbung
		ArrayList<Light> lights = new ArrayList<>();
		lights.add(t1);
		lights.add(t2);
		lights.add(f1);
		lights.add(f2);

		for (Light l : lights) {
			l.print();
			l.switchOn();
			l.switchOff();
		}

	}

}
