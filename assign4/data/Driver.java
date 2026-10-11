package data;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {

		OrderDB db = new OrderDB();
		db.loadOrders("orders.txt");
		db.showOrders();
	}

}
