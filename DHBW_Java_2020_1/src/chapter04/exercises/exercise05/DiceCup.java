package chapter04.exercises.exercise05;

import java.util.ArrayList;

/**
 * Würfelbecher
 * 
 * @author Daniel Appenmaier
 *
 */
public class DiceCup {

	/*
	 * Methoden
	 */
	public void rollTheDices(ArrayList<Dice> dices) {
//		for (Dice d : dices) {
//			d.rollTheDice();
//		    System.out.println(d.getId() + " - " + d.getValue());
//		}
		for (int i = 0; i < dices.size(); i++) {
			Dice d = dices.get(i);
			d.rollTheDice();
			System.out.println(d.getId() + " - " + d.getValue());
		}
	}
	
	public void rollTheDices(Dice[] dices) {
		for (int i = 0; i < dices.length; i++) {
			Dice d = dices[i];
			d.rollTheDice();
			System.out.println(d.getId() + " - " + d.getValue());
		}
	}

}
