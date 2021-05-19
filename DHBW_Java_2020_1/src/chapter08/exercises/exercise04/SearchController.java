package chapter08.exercises.exercise04;

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
 * Controller für SearchView.fxml
 * 
 * @author Daniel Appenmaier
 *
 */
public class SearchController implements Initializable {

	/*
	 * Attribute
	 */
	@FXML
	private TextField searchTermTextField;

	private Model model;

	/*
	 * Methoden
	 */
	public void initialize(URL location, ResourceBundle resources) {
		model = Model.getInstance();
	}

	public void goToHitlist(ActionEvent actionEvent) throws IOException {
		String searchTerm = searchTermTextField.getText();

		model.createHitlist(searchTerm);

		if (model.getHitlist().equals("")) {
			Alert alert = new Alert(AlertType.INFORMATION, "Keine Treffer");
			alert.show();
			return;
		}

		Parent root = FXMLLoader.load(getClass().getResource("HitlistView.fxml"));
		Scene newScene = new Scene(root);
		Scene currentScene = searchTermTextField.getScene();
		Stage primaryStage = (Stage) currentScene.getWindow();
		primaryStage.setScene(newScene);
		primaryStage.show();
	}

}
