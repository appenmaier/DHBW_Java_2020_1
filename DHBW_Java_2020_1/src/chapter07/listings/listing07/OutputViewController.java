package chapter07.listings.listing07;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class OutputViewController implements Initializable {

	@FXML
	private Label output;

	private Model model;

	public void initialize(URL location, ResourceBundle resources) {
		model = Model.getInstance();
		output.setText(model.getText());
	}

	public void goToInputView(ActionEvent actionEvent) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("InputView.fxml"));
		Scene scene = new Scene(root);
		Node node = (Node) actionEvent.getSource();
		Stage stage = (Stage) node.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

}
