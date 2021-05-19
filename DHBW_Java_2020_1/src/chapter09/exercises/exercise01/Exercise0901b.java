package chapter09.exercises.exercise01;

public class Exercise0901b {

	public static void main(String[] args) {

		BeerBottle b1 = new BeerBottle();
		BeerBottle b2 = new BeerBottle();
		SodaBottle b3 = new SodaBottle();
		SodaBottle b4 = new SodaBottle();
		WineBottle b5 = new WineBottle();
		WineBottle b6 = new WineBottle();

		GenericCrate<BeerBottle> crate = new GenericCrate<>();
		crate.insertBottle(b1, 1);
		crate.insertBottle(b2, 2);
//		crate.insertBottle(b3, 3);
//		crate.insertBottle(b4, 4);
//		crate.insertBottle(b5, 5);
//		crate.insertBottle(b6, 6);

	}

}
