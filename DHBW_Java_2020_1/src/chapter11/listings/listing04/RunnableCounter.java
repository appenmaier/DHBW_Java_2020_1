package chapter11.listings.listing04;

public class RunnableCounter implements Runnable {

	private int count;

	public void run() {
		while (count <= 100) {
			System.out.println(Thread.currentThread().getName() + ": " + count++);
		}
	}

}
