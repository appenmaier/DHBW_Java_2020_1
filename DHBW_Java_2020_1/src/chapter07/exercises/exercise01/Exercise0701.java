package chapter07.exercises.exercise01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Exercise0701 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		View view = new View();
		Scene scene = new Scene(view.getRoot());
		primaryStage.setTitle("Exercise 7.1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
