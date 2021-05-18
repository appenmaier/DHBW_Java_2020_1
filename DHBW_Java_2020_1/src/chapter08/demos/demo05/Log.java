package chapter08.demos.demo05;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Protokoll
 * 
 * @author Daniel Appenmaier
 *
 */
public class Log implements Serializable {
	
	/*
	 * Attribute
	 */
	private static final long serialVersionUID = 4858039574924426195L;
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
