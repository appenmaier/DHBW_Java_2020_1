package chapter11.listings.listing06;

public class Consumer extends Thread {

	private boolean isRunning = true;
	private int sleepTime;

	public Consumer(int sleepTime) {
		this.sleepTime = sleepTime;
	}

	public void run() {
		while (isRunning) {
			synchronized (Listing1106.numbers) {
				while (Listing1106.numbers.size() < 1) {
					try {
						Listing1106.numbers.wait();
					} catch (InterruptedException e) {
					}
				}
				System.out.println("[CONSUMER]: " + Listing1106.numbers.get(0));
				Listing1106.numbers.remove(0);
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
