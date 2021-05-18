package chapter09.demos.demo02;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Control;
import javafx.scene.layout.Region;

/**
 * Varianz
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0902 {

	public static void main(String[] args) {

		ArrayList<?> bivariantList;
		bivariantList = new ArrayList<Object>();
		bivariantList = new ArrayList<Node>();
		bivariantList = new ArrayList<Parent>();
		bivariantList = new ArrayList<Region>();
		bivariantList = new ArrayList<Control>();

		ArrayList<? extends Parent> covariantList;
		// covariantList = new ArrayList<Object>();
		// covariantList = new ArrayList<Node>();
		covariantList = new ArrayList<Parent>();
		covariantList = new ArrayList<Region>();
		covariantList = new ArrayList<Control>();

		ArrayList<? super Parent> contravariantList;
		contravariantList = new ArrayList<Object>();
		contravariantList = new ArrayList<Node>();
		contravariantList = new ArrayList<Parent>();
		// contravariantList = new ArrayList<Region>();
		// contravariantList = new ArrayList<Control>();

		ArrayList<Parent> invariantList;
		// invariantList = new ArrayList<Object>();
		// invariantList = new ArrayList<Node>();
		invariantList = new ArrayList<Parent>();
		// invariantList = new ArrayList<Region>();
		// invariantList = new ArrayList<Control>();

	}

}
