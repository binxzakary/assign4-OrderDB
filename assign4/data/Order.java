package data;

public class Order {

	private int orderID;
	private double totalAmount;
	private String product;

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Order() {

	}

	public Order(int orderID, double totalAmount, String product) {
		this.orderID = orderID;
		this.totalAmount = totalAmount;
		this.product = product;
	}
}
