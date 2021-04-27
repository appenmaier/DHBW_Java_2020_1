package chapter07.demos.demo02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Ereignisbehandlung
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0702 extends Application {

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
		// Aufbau der Bühne und Aufruf der ersten Szene
		System.out.println("start()");
		View view = new View();
		Scene scene = new Scene(view.getRoot());
		primaryStage.setTitle("Demo 7.2");
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		// "Aufräumarbeiten"
		System.out.println("stop()");
	}

}
