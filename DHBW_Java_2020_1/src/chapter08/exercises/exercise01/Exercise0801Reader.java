package chapter08.exercises.exercise01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise0801Reader {

	public static void main(String[] args) {

		File file = new File("C:/Temp/persons.txt");
		ArrayList<Person> persons = new ArrayList<>();

		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] tokens = line.split(";");
				String name = tokens[0];
				int age = Integer.valueOf(tokens[1]);
				char gender = tokens[2].charAt(0);
				Person person = new Person(name, age, gender);
				persons.add(person);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (Person p : persons) {
			p.print();
		}

	}

}
