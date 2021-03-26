package chapter07.listings.listing08;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	TextField textField;
	@FXML
	Button button;
	@FXML
	Label label;

	public void inputToOutput(ActionEvent actionEvent) {
		String text = textField.getText();
		label.setText(text);
	}

}
