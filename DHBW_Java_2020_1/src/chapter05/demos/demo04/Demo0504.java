package chapter05.demos.demo04;

import java.util.ArrayList;

/**
 * Schnittstellen
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0504 {

	public static void main(String[] args) {

		ArrayList<WiredDevice> wiredDevices = new ArrayList<>();

		Toaster t = new Toaster();
		TableLamp l = new TableLamp();

		wiredDevices.add(t); // Upcast
		wiredDevices.add(l); // Upcast

		for (WiredDevice w : wiredDevices) {
			w.plugIn(); // Polymorphie
		}

	}

}
