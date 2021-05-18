package chapter08.demos.demo05;

import java.io.Serializable;

/**
 * Protokoll-Eintrag
 * 
 * @author Daniel Appenmaier
 *
 */
public class LogEntry implements Serializable {

	/*
	 * Attribute
	 */
	private static final long serialVersionUID = 1L;
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
