package chapter06.demos.demo02;

/**
 * Kabelgebundenes Gerät
 * 
 * @author Daniel Appenmaier
 *
 */
public interface WiredDevice {

	void plugIn() throws AlreadyPluggedInException;

	void pullThePlug();

}
