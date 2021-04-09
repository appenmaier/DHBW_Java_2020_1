package chapter04.exercises.exercise12;

public class Exercise0412 {

	public static void main(String[] args) {

		System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());

		Vehicle v1 = new Vehicle("Porsche", "911", Engine.ELECTRO);
		Vehicle v2 = new Vehicle("MAN", "TGX", Engine.DIESEL);
		Vehicle v3 = new Vehicle("Opel", "Zafira Life", Engine.DIESEL);

		System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());
		System.out.println();

		v1.print();
		v2.print();
		v3.print();

	}

}
