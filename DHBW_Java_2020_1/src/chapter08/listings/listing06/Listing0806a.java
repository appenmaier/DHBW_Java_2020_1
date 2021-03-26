package chapter08.listings.listing06;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Listing0806a {

	public static void main(String[] args) {

		File file = new File("C:/Temp/goods.dat");
		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(new Goods("Brot", "St�ck", 2.49, ClassOfGoods.BAKERY_PRODUCTS));
			oos.writeObject(new Goods("Milch", "Liter", 0.79, ClassOfGoods.DAIRY_PRODUCTS));
		} catch (IOException | InvalidPriceException e) {
			e.printStackTrace();
		}

	}

}
