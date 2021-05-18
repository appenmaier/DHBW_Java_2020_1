package chapter08.demos.demo04;

/**
 * Protokoll-Eintrag
 * 
 * @author Daniel Appenmaier
 *
 */
public class LogEntry {

	/*
	 * Attribute
	 */
	private long timeStamp;
	private String content;

	/*
	 * Methoden
	 */
	public LogEntry(String content) {
		this.content = content;
		timeStamp = System.currentTimeMillis();
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public String getContent() {
		return content;
	}

	public String toString() {
		return timeStamp + ": " + content;
	}

}
