package chapter11.listings.listing06;

public class Producer extends Thread {

	private boolean isRunning = true;
	private int sleepTime;

	public Producer(int sleepTime) {
		this.sleepTime = sleepTime;
	}

	public void run() {
		while (isRunning) {
			synchronized (Listing1106.numbers) {
				int number = (int) (Math.random() * 100);
				Listing1106.numbers.add(number);
				System.out.println("[PRODUCER]: " + number);
				Listing1106.numbers.notifyAll();
				try {
					sleep(sleepTime);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public void terminate() {
		isRunning = false;
	}

}
