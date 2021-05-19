package chapter07.exercises.exercise03;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
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
	private TextField userNameTextField;

	@FXML
	private PasswordField passwordPasswordField;

	/*
	 * Methoden
	 */
	public void login(ActionEvent actionEvent) throws IOException {
		String userName = userNameTextField.getText();
		String password = passwordPasswordField.getText();

		if (userName.equals("") || password.equals("")) {
			Alert alert = new Alert(AlertType.ERROR, "Fehlende Daten");
			alert.show();
			return;
		}

		Alert alert = new Alert(AlertType.INFORMATION, "Name: " + userName + ", Passwort: " + password);
		alert.show();
	}

}
