package chapter11.listings.listing03;

public class Listing1103 {

	public static void main(String[] args) {

		RunnableCounter runnableCounter = new RunnableCounter();
		
		Thread thread1 = new Thread(runnableCounter);
		thread1.setPriority(Thread.MIN_PRIORITY);
		Thread thread2 = new Thread(runnableCounter);
		thread2.setPriority(Thread.MAX_PRIORITY);
		
		thread1.start();
		thread2.start();

	}

}
