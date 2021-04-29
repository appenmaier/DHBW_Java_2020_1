package chapter07.exercises.exercise01;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

	@FXML
	Label diceValueLabel;

	@FXML
	Button rollTheDiceButton;

	public void rollTheDice(ActionEvent event) {
		Random random = new Random();
		Integer randomNumber = random.nextInt(6) + 1;
		diceValueLabel.setText(randomNumber.toString());
	}

}
