package chapter11.listings.listing06;

public class Printer extends Thread {

	private int sleepTime;

	public Printer(int sleepTime) {
		this.sleepTime = sleepTime;
		setDaemon(true);
	}

	public void run() {
		while (true) {
			synchronized (Listing1106.numbers) {
				while (Listing1106.numbers.size() < 1) {
					try {
						Listing1106.numbers.wait();
					} catch (InterruptedException e) {
					}
				}
				System.out.println("[PRINTER]" + Listing1106.numbers);
				try {
					sleep(sleepTime);
				} catch (InterruptedException e) {
				}
			}
		}
	}

}
