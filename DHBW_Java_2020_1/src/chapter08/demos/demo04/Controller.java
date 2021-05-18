package chapter08.demos.demo04;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * Controller für View.fxml
 * 
 * @author Daniel Appenmaier
 *
 */
public class Controller implements Initializable {

	@FXML
	private TextField inputTextField;

	private Model model;

	public void initialize(URL location, ResourceBundle resources) {
		model = Model.getInstance();
	}

	public void createLogEntry(ActionEvent actionEvent) {
		model.createLogEntry(inputTextField.getText());
	}

	public void printLogEntries(ActionEvent actionEvent) {
		model.printLogEntries();
	}

}
