package chapter11.listings.listing02;

public class Listing1102 {

	public static void main(String[] args) {

		CounterThread counterThread = new CounterThread();
		counterThread.start();

		RunnableCounter runnableCounter = new RunnableCounter();
		Thread thread = new Thread(runnableCounter);
		thread.start();

	}

}
