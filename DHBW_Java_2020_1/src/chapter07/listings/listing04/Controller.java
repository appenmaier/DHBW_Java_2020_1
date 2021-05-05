package chapter07.listings.listing04;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private TextField textField;

	@FXML
	private Label label;

	public void inputToOutput(ActionEvent actionEvent) {
		String text = textField.getText();
		label.setText(text);
	}

}
