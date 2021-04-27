package chapter07.exercises.exercise01;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class Controller implements EventHandler<ActionEvent> {

	/*
	 * Attribute
	 */
	private View view;

	/*
	 * Methoden
	 */
	public Controller(View view) {
		this.view = view;
	}

	@Override
	public void handle(ActionEvent event) {
		Random random = new Random();
		Integer randomNumber = random.nextInt(6) + 1;
		Label diceValueLabel = view.getDiceValueLabel();
		diceValueLabel.setText(randomNumber.toString());
	}

}
