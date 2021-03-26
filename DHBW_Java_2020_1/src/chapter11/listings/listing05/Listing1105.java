package chapter11.listings.listing05;

public class Listing1105 {

	public static void main(String[] args) {

		RunnableCounter runnableCounter = new RunnableCounter();
		
		Thread thread1 = new Thread(runnableCounter);
		Thread thread2 = new Thread(runnableCounter);
		
		thread1.start();
		thread2.start();

	}

}
