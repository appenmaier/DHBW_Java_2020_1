package chapter07.exercises.exercise04;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Controller für View.fxml
 * 
 * @author Daniel Appenmaier
 *
 */
public class Controller implements Initializable {

	/*
	 * Attribute
	 */
	@FXML
	private Label diceValueLabel;

	@FXML
	private ImageView diceImageView;

	private Model model;

	/*
	 * Methoden
	 */
	public void initialize(URL location, ResourceBundle resources) {
		model = Model.getInstance();
	}

	public void rollTheDice(ActionEvent actionEvent) {
		int previousDiceValue = model.getDiceValue();
		model.rollTheDice();
		Integer diceValue = model.getDiceValue();
		diceValueLabel.setText(diceValue.toString());
		Image diceImage = model.getDiceImage();
		diceImageView.setImage(diceImage);
		if (previousDiceValue == 6 && model.getDiceValue() == 6) {
			Alert alert = new Alert(AlertType.INFORMATION, "6er-Pasch");
			alert.show();
		}
	}

}
