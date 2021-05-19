package chapter08.exercises.exercise01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise0801Writer {

	public static void main(String[] args) {

		File file = new File("C:/Temp/persons.txt");
		ArrayList<Person> persons = new ArrayList<>();

		Person p1 = new Person("Hans", 42, 'm');
		Person p2 = new Person("Peter", 18, 'm');
		Person p3 = new Person("Lisa", 18, 'w');

		persons.add(p1);
		persons.add(p2);
		persons.add(p3);

		try (FileWriter fileWriter = new FileWriter(file, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			for (Person p : persons) {
				String line = p.getName() + ";" + p.getAge() + ";" + p.getGender();
				bufferedWriter.write(line);
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
