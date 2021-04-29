package chapter07.demos.demo03;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private TextField inputTextField;

	@FXML
	private Button inputToOutputButton;

	@FXML
	private Label outputLabel;

	@FXML
	public void inputToOutput(ActionEvent event) {
		// Eingabe auslesen
		String text = inputTextField.getText();
		// Eingabe anzeigen
		outputLabel.setText(text);
	}

}
