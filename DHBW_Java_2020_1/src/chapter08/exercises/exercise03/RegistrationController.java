package chapter08.exercises.exercise03;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Controller für RegistrationView.fxml
 * 
 * @author Daniel Appenmaier
 *
 */
public class RegistrationController implements Initializable {

	/*
	 * Attribute
	 */
	@FXML
	private TextField userNameTextField;

	@FXML
	private TextField passwordTextField;

	private Model model;

	/*
	 * Methoden
	 */
	public void initialize(URL location, ResourceBundle resources) {
		model = Model.getInstance();
	}

	public void register(ActionEvent actionEvent) throws IOException {
		String userName = userNameTextField.getText();
		String password = passwordTextField.getText();

		if (userName.equals("") || password.equals("")) {
			Alert alert = new Alert(AlertType.ERROR, "Fehlende Registrierungsdaten");
			alert.show();
			return;
		}

		if (!model.checkUserName(userName)) {
			Alert alert = new Alert(AlertType.ERROR, "Ungültiger Name");
			alert.show();
			return;
		}

		model.registerUser(userName, password);

		Parent root = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
		Scene newScene = new Scene(root);
		Scene currentScene = userNameTextField.getScene();
		Stage primaryStage = (Stage) currentScene.getWindow();
		primaryStage.setScene(newScene);
		primaryStage.show();
	}

}
