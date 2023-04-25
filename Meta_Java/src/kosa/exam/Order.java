package kosa.exam;

import java.util.LinkedList;

public class Order {
	private Food food;
	private int amount;
	private int totalPrice;	
	
	public Order(Food food, int amount) {
		super();
		this.food = food;
		this.amount = amount;
		totalPrice = food.getPrice() * amount;
	}
	
	public void orderShow() {
		System.out.println("음식 이름 : " + food.getFoodName());
		System.out.println("음식 가격 : " + food.getPrice());
		System.out.println("주문 개수 : " + amount);
		System.out.println("총금액 : " + totalPrice);
	}
	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
}
