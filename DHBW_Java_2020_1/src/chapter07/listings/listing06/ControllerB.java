package chapter07.listings.listing06;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerB {

	@FXML
	Button goToViewAButton;

	public void goToViewA(ActionEvent actionEvent) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ViewA.fxml"));
		Scene scene = new Scene(root);
		Stage stage = (Stage) goToViewAButton.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

}
