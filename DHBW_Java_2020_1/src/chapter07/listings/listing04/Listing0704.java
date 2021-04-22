package chapter07.listings.listing04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Listing0704 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		View view = new View();
		Scene scene = new Scene(view.getRoot());
		primaryStage.setTitle("Listing 7.4");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
