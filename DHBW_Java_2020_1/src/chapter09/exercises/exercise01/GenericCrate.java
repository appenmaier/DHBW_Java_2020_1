package chapter09.exercises.exercise01;

/**
 * Generische Getränkekiste
 * 
 * @author Daniel Appenmaier
 *
 */
public class GenericCrate<T extends Bottle> {

	/*
	 * Attribute
	 */
	private T box1;
	private T box2;
	private T box3;
	private T box4;
	private T box5;
	private T box6;

	/*
	 * Methoden
	 */
	public void insertBottle(T t, int box) {
		switch (box) {
		case 1 -> box1 = t;
		case 2 -> box2 = t;
		case 3 -> box3 = t;
		case 4 -> box4 = t;
		case 5 -> box5 = t;
		case 6 -> box6 = t;
		}
	}

	public T takeBottle(int box) {
		return switch (box) {
		case 1 -> box1;
		case 2 -> box2;
		case 3 -> box3;
		case 4 -> box4;
		case 5 -> box5;
		case 6 -> box6;
		default -> null;
		};
	}

}
