package chapter04.demos.demo03;

/**
 * Überladene Methoden und Konstruktor-Methoden / Konstruktoren
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0403 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb("rot");
		LightBulb blueLightBulb = new LightBulb("blau");

		TableLamp l1 = new TableLamp();
		TableLamp l2 = new TableLamp(redLightBulb);

	}

}
