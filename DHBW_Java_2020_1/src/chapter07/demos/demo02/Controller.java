package chapter07.demos.demo02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Controller für View.fxml
 * 
 * @author Daniel Appenmaier
 *
 */
public class Controller {

	/*
	 * Attribute
	 */
	@FXML
	private TextField inputTextField;

	@FXML
	private Label outputLabel;

	/*
	 * Methoden
	 */
	public void inputToOutput(ActionEvent event) {
		// Eingabe auslesen
		String text = inputTextField.getText();
		// Eingabe anzeigen
		outputLabel.setText(text);
	}

}
