package chapter05.exercises.exercise06;

public class Exercise0506 {

	public static void main(String[] args) {

		TravelAgency travelAgency = new TravelAgency("Reisebüro Schmidt");
		Rental rental = new Rental("Fahrzeugvermietung Müller");
		Car c1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
		Truck t1 = new Truck("MAN", "TGX", Engine.DIESEL, 40);
		Truck t2 = new Truck("Mercedes", "Actros", Engine.DIESEL, 40);
		Car c2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 7);

		rental.addAllVehicles(c1, t1, t2, c2);
		travelAgency.addPartner(rental);

		travelAgency.print();

	}

}
