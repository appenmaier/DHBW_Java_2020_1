package chapter07.exercises.exercise02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
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
	private TextField initialCapitalTextField;

	@FXML
	private TextField interestRateTextField;

	@FXML
	private TextField runningTimeTextField;

	@FXML
	private Label interestLabel;

	/*
	 * Methoden
	 */
	public void calculateInterest(ActionEvent event) {
		double initialCapital = Double.valueOf(initialCapitalTextField.getText());
		double interestRate = Double.valueOf(interestRateTextField.getText());
		int runningTime = Integer.valueOf(runningTimeTextField.getText());
		Double interest = initialCapital * Math.pow((1 + interestRate / 100), runningTime) - initialCapital;
		interestLabel.setText(interest.toString());
	}

}
