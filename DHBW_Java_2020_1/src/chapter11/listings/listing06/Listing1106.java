package chapter11.listings.listing06;

import java.util.ArrayList;

public class Listing1106 {

	public static ArrayList<Integer> numbers = new ArrayList<>();

	public static void main(String[] args) {

		int sleepTime = 100;

		Producer producer = new Producer(sleepTime);
		Consumer consumer = new Consumer(sleepTime);
		Printer printer = new Printer(sleepTime);

		printer.start();
		producer.start();
		consumer.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		producer.terminate();
		consumer.terminate();

	}

}
