package chapter07.demos.demo01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX: Lebenszyklus einer JavaFX-Anwendung
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0701 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() throws Exception {
		// Eingabeparameter auslesen und verarbeiten
		System.out.println("init()");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Aufbau der Bühne, Aufbau der Szene, Programmlogik
		System.out.println("start()");
		View view = new View();
		Scene scene = new Scene(view.getRoot());
		primaryStage.setTitle("Demo 2.1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		// "Aufräumarbeiten"
		System.out.println("stop()");
	}

}
