package chapter07.listings.listing05;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controller implements EventHandler<ActionEvent> {

	private View view;

	public Controller(View view) {
		this.view = view;
	}

	public void handle(ActionEvent actionEvent) {
		if (actionEvent.getSource().equals(view.getButton())) {
			String text = view.getTextField().getText();
			view.getLabel().setText(text);
		}
	}

}
