package chapter04.exercises.exercise07;

public class Exercise0407 {

	public static void main(String[] args) {

		System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());

		Vehicle v1 = new Vehicle("Porsche", "911");
		Vehicle v2 = new Vehicle("MAN", "TGX");
		Vehicle v3 = new Vehicle("Opel", "Zafira Life");

		System.out.println("Anzahl Fahrzeuge: " + Vehicle.getNumberOfVehicles());
		System.out.println();

		v1.print();
		v2.print();
		v3.print();

	}

}
