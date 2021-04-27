package chapter07.demos.demo03;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class Controller {

	@FXML
	private TextField inputTextField;

	@FXML
	private Button inputToOutputButton;

	@FXML
	private Label outputLabel;

	@FXML
	public void inputToOutput(ActionEvent event) {
		// Eingabefeld der View auslesen
		String text = inputTextField.getText();
		// Ausgabefeld der View ändern
		outputLabel.setText(text);
	}
	
}
