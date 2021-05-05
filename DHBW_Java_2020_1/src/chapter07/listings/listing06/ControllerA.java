package chapter07.listings.listing06;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControllerA {

	public void goToViewB(ActionEvent actionEvent) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ViewB.fxml"));
		Scene scene = new Scene(root);
		Node node = (Node) actionEvent.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

}
