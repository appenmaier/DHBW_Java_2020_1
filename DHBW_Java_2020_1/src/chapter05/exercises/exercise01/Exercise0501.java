package chapter05.exercises.exercise01;

public class Exercise0501 {

	public static void main(String[] args) {

		System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());

		Car c1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
		Truck t1 = new Truck("MAN", "TGX", Engine.DIESEL, 40);
		Car c2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 7);

		System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());
		System.out.println();

		c1.print();
		t1.print();
		c2.print();

		c1.accelerate(30);
		c1.doATurboBoost();
		t1.transform();
		t1.accelerate(50);
		t1.transform();

	}

}
