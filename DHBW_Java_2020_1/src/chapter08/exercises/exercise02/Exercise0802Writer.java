package chapter08.exercises.exercise02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Exercise0802Writer {

	public static void main(String[] args) {

		File file = new File("C:/Temp/persons.dat");
		ArrayList<Person> persons = new ArrayList<>();

		Person p1 = new Person("Hans", 42, 'm');
		Person p2 = new Person("Peter", 18, 'm');
		Person p3 = new Person("Lisa", 18, 'w');

		persons.add(p1);
		persons.add(p2);
		persons.add(p3);

		try (FileOutputStream fileOutputStream = new FileOutputStream(file);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(persons);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
