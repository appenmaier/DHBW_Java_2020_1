package chapter08.exercises.exercise03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * Controller für UserView.fxml
 * 
 * @author Daniel Appenmaier
 *
 */
public class UserController implements Initializable {

	/*
	 * Attribute
	 */
	@FXML
	private Label userNameLabel;

	private Model model;

	/*
	 * Methoden
	 */
	public void initialize(URL location, ResourceBundle resources) {
		model = Model.getInstance();
		String userName = model.getUserName();
		userNameLabel.setText("Hallo " + userName);
	}

}
