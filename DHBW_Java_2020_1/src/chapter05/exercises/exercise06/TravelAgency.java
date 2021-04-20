package chapter05.exercises.exercise06;

import java.util.ArrayList;

/**
 * Reiseagentur
 * 
 * @author Daniel Appenmaier
 *
 */
public class TravelAgency {

	/*
	 * Attribute
	 */
	private String name;
	private ArrayList<Partner> partners = new ArrayList<>();

	/*
	 * Methoden
	 */
	public TravelAgency(String name) {
		this.name = name;
	}

	public void addPartner(Partner partner) {
		partners.add(partner);
	}

	public void print() {
		System.out.println(name);
		System.out.println();
		System.out.println("Unsere Partner: ");
		for (Partner p : partners) {
			p.print();
		}
	}

}
