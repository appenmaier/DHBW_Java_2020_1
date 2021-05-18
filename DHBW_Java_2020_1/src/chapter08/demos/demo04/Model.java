package chapter08.demos.demo04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Model für Demo0804
 * 
 * @author Daniel Appenmaier
 *
 */
public class Model {

	/*
	 * Attribute
	 */
	private final static String LOGFILE_PATH = "C:/Temp/log.txt";
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
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] tokens = line.split(";");
				long timeStamp = Long.valueOf(tokens[0]);
				String content = tokens[1];
				createLogEntry(content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveLog() {
		try (FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			for (LogEntry logEntry : log.getLogEntries()) {
				String line = logEntry.getTimeStamp() + ";" + logEntry.getContent();
				bufferedWriter.write(line);
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
