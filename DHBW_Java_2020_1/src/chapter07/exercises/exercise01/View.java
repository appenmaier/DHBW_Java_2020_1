package chapter07.exercises.exercise01;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class View {

	/*
	 * Attribute
	 */
	private Label diceValueLabel;
	private Button rollTheDiceButton;
	private VBox root;

	/*
	 * Methoden
	 */
	public View() {
		diceValueLabel = new Label();

		rollTheDiceButton = new Button("Würfeln");
		rollTheDiceButton.setOnAction(new Controller(this));

		root = new VBox();
		root.getChildren().addAll(diceValueLabel, rollTheDiceButton);
	}

	public Label getDiceValueLabel() {
		return diceValueLabel;
	}

	public Button getRollTheDiceButton() {
		return rollTheDiceButton;
	}

	public VBox getRoot() {
		return root;
	}

}
