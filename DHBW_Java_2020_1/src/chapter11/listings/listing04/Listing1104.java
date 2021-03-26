package chapter11.listings.listing04;

public class Listing1104 {

	public static void main(String[] args) {

		RunnableCounter runnableCounter = new RunnableCounter();
		
		Thread thread1 = new Thread(runnableCounter);
		Thread thread2 = new Thread(runnableCounter);
		
		thread1.start();
		thread2.start();

	}

}
