package chapter05.demos.demo04;

/**
 * Toaster
 * 
 * @author Daniel Appenmaier
 *
 */
public class Toaster implements WiredDevice {

	@Override
	public void plugIn() {
		System.out.println("Toaster ist eingesteckt");
	}

	@Override
	public void pullThePlug() {
		System.out.println("Toster ist ausgesteckt");
	}

}
