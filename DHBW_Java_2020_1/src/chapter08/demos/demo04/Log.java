package chapter08.demos.demo04;

import java.util.ArrayList;

/**
 * Protokoll
 * 
 * @author Daniel Appenmaier
 *
 */
public class Log {

	/*
	 * Attribute
	 */
	private ArrayList<LogEntry> logEntries;

	/*
	 * Methoden
	 */
	public Log() {
		logEntries = new ArrayList<>();
	}

	public void addLogEntry(LogEntry logEntry) {
		logEntries.add(logEntry);
	}

	public ArrayList<LogEntry> getLogEntries() {
		return logEntries;
	}

}
