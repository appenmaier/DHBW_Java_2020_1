package chapter09.listings.listing03;

import java.awt.Component;
import java.awt.Container;
import java.awt.Panel;

public class Listing0903 {

	public static void main(String[] args) {

		GenericBox<?> bivariant;
		bivariant = new GenericBox<Component>();
		bivariant = new GenericBox<Container>();
		bivariant = new GenericBox<Panel>();

		GenericBox<? extends Container> covariant;
		// covariant = new GenericBox<Component>();
		covariant = new GenericBox<Container>();
		covariant = new GenericBox<Panel>();

		GenericBox<? super Container> contravariant;
		contravariant = new GenericBox<Component>();
		contravariant = new GenericBox<Container>();
		// contravariant = new GenericBox<Panel>();

		GenericBox<Container> invariant;
		// invariant = new GenericBox<Component>();
		invariant = new GenericBox<Container>();
		// invariant = new GenericBox<Panel>();

	}

}
