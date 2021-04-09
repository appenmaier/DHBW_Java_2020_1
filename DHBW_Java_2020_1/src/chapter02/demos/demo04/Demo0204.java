package chapter02.demos.demo04;

/**
 * Sichtbarkeit von Datenobjekten und Rückgabewerte bei Methoden
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0204 {

	static int attribute;

	public static void main(String[] args) {
		int varMain;
		varMain = 5;
//		varVoidMethod = 8;
//		varReturnMethod = 3;
		attribute = 1;

		voidMethod();
		varMain = returnMethod();
	}

	public static void voidMethod() {
		int varVoidMethod;
//		varMain = 8;
		varVoidMethod = 1;
//		varReturnMethod = 7;
		attribute = 2;
	}

	public static int returnMethod() {
		int varReturnMethod;
//		varMain = 2;
//		varVoidMethod = 8;
		varReturnMethod = 6;
		attribute = 3;
		return varReturnMethod;
	}

}
