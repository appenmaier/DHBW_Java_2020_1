package chapter07.listings.listing05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Listing0705 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		View view = new View();
		Scene scene = new Scene(view.getRoot());
		scene.getStylesheets().add(getClass().getResource("Stylesheet.css").toExternalForm());
		primaryStage.setTitle("Listing 7.5");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
