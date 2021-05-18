package chapter08.demos.demo05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Model für Demo0805
 * 
 * @author Daniel Appenmaier
 *
 */
public class Model {

	/*
	 * Attribute
	 */
	private final static String LOGFILE_PATH = "C:/Temp/log.dat";
	private static Model instance;
	private File file;
	private Log log;

	/*
	 * Methoden
	 */
	private Model() {
	}

	public static Model getInstance() {
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}

	public void createLogEntry(String content) {
		LogEntry logEntry = new LogEntry(content);
		log.addLogEntry(logEntry);
		System.out.println(logEntry.toString());
	}

	public void printLogEntries() {
		for (LogEntry logEntry : log.getLogEntries()) {
			System.out.println(logEntry.toString());
		}
	}

	public void initLogFile() {
		log = new Log();
		file = new File(LOGFILE_PATH);
		if (file.exists()) {
			loadLog();
		} else {
			saveLog();
		}
	}

	public void loadLog() {
		try (FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			log = (Log) objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void saveLog() {
		try (FileOutputStream fileOutputStream = new FileOutputStream(file);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(log);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
