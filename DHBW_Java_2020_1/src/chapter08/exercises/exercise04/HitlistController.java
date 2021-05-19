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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * Controller für HitlistView.fxml
 * 
 * @author Daniel Appenmaier
 *
 */
public class HitlistController implements Initializable {

	/*
	 * Attribute
	 */
	@FXML
	private TextArea hitlistTextArea;

	private Model model;

	/*
	 * Methoden
	 */
	public void initialize(URL location, ResourceBundle resources) {
		model = Model.getInstance();
		String hitlist = model.getHitlist();
		hitlistTextArea.setText(hitlist);
	}

	public void goBack(ActionEvent actionEvent) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("SearchView.fxml"));
		Scene newScene = new Scene(root);
		Scene currentScene = hitlistTextArea.getScene();
		Stage primaryStage = (Stage) currentScene.getWindow();
		primaryStage.setScene(newScene);
		primaryStage.show();
	}

}
