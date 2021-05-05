package chapter07.listings.listing05;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

	@FXML
	private TextField textField;

	@FXML
	private Label label;

	public void initialize(URL location, ResourceBundle resources) {
		textField.setText("Hallo Welt!");
	}

	public void inputToOutput(ActionEvent actionEvent) {
		String text = textField.getText();
		label.setText(text);
	}

}
