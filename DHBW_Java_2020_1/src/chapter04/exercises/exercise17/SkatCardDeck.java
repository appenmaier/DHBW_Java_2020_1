package chapter04.exercises.exercise17;

import java.util.ArrayList;
import java.util.Random;

/**
 * Kartendeck (Skat)
 * 
 * @author Daniel Appenmaier
 *
 */
public class SkatCardDeck {

	/*
	 * Attribute
	 */
	private ArrayList<SkatCard> skatCards;

	/*
	 * Methoden
	 */
	public SkatCardDeck() {
		skatCards = new ArrayList<>();
		for (SkatCardColor color : SkatCardColor.values()) {
			for (SkatCardValue value : SkatCardValue.values()) {
				skatCards.add(new SkatCard(color, value));

			}
		}
	}

	public void shuffleSkatCards() {
		Random random = new Random();
		for (int i = 0; i < 1000000; i++) {
			Integer index = random.nextInt(skatCards.size());
			SkatCard skatCard = skatCards.get(index);
			skatCards.remove(skatCard);
			skatCards.add(skatCard);
		}
	}

	public ArrayList<SkatCard> getSkatCards() {
		return skatCards;
	}

}
