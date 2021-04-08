package chapter08.listings.listing06;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Listing0806b {

	public static void main(String[] args) {

		File file = new File("C:/Temp/goods.dat");
		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
			while (true) {
				Goods goods = (Goods) ois.readObject();
				System.out.println(goods.toString());
			}
		} catch (EOFException e) {
			// End of File
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
