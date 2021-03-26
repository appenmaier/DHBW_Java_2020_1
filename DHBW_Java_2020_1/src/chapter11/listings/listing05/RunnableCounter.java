package chapter11.listings.listing05;

public class RunnableCounter implements Runnable {

	private int count = 0;

	public synchronized void run() {
		while (count < 100) {
			System.out.println(Thread.currentThread().getName() + ": " + count++);
		}
	}

}
