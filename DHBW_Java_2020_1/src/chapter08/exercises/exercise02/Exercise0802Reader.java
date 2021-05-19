package chapter08.exercises.exercise02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Exercise0802Reader {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		File file = new File("C:/Temp/persons.dat");
		ArrayList<Person> persons = new ArrayList<>();

		try (FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			persons = (ArrayList<Person>) objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		for (Person p : persons) {
			p.print();
		}

	}

}
