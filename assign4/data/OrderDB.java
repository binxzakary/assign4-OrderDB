package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OrderDB {

	private Order[] orderArr = new Order[50];
	private int count = 0;

	public void loadOrders(String orders) throws FileNotFoundException {
		File ordersFile = new File(orders);
		Scanner input = new Scanner(ordersFile);
		input.nextLine();

		while (input.hasNextLine()) {

			String line = input.nextLine();
			String[] parts = line.split(",");

			int id = Integer.parseInt(parts[0]);
			String product = parts[2];
			double total = Double.parseDouble(parts[3]);

			orderArr[count] = new Order(id, total, product);
			count++;
		}

		input.close();

	}

	public void showOrders() {
		int index;
		for (index = 0; index < count; index++) {
			System.out.printf("%-9d%-32s%9.2f%n", orderArr[index].getOrderID(), orderArr[index].getProduct(),
					orderArr[index].getTotalAmount());
		}
	}
}
