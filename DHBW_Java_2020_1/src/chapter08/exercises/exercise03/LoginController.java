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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 * Controller für LoginView.fxml
 * 
 * @author Daniel Appenmaier
 *
 */
public class LoginController implements Initializable {

	/*
	 * Attribute
	 */
	@FXML
	private TextField userNameTextField;

	@FXML
	private PasswordField passwordPasswordField;

	private Model model;

	/*
	 * Methoden
	 */
	public void initialize(URL location, ResourceBundle resources) {
		model = Model.getInstance();
	}

	public void goToRegistration(ActionEvent actionEvent) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("RegistrationView.fxml"));
		Scene newScene = new Scene(root);
		Scene currentScene = userNameTextField.getScene();
		Stage primaryStage = (Stage) currentScene.getWindow();
		primaryStage.setScene(newScene);
		primaryStage.show();
	}

	public void login(ActionEvent actionEvent) throws IOException {
		String userName = userNameTextField.getText();
		String password = passwordPasswordField.getText();

		if (userName.equals("") || password.equals("")) {
			Alert alert = new Alert(AlertType.ERROR, "Fehlende Anmeldedaten");
			alert.show();
			return;
		}

		if (!model.checkUser(userName, password)) {
			Alert alert = new Alert(AlertType.ERROR, "Ungültige Anmeldedaten");
			alert.show();
			return;
		}

		model.setUser(userName, password);

		Parent root = FXMLLoader.load(getClass().getResource("UserView.fxml"));
		Scene newScene = new Scene(root);
		Scene currentScene = userNameTextField.getScene();
		Stage primaryStage = (Stage) currentScene.getWindow();
		primaryStage.setScene(newScene);
		primaryStage.show();
	}

}
