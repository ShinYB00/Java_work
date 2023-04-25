package kosa.exam;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {

	LinkedList<Order> orderList =  new LinkedList<Order>();
	Scanner sc = new Scanner(System.in);
	
	Food food1 = new Food("짜장면", 5000);
	Food food2 = new Food("짬뽕", 7000);
	Food food3 = new Food("탕수육", 13000);
	
	
	public void addOrder() {
		System.out.println("1.짜장면  2.짬뽕  3.탕수육  4.종료");
		
		System.out.print("메뉴 선택 : ");
		String menu = sc.nextLine();
		
		String d = sc.nextLine();

		System.out.print("주문 개수 : ");
		int amount = sc.nextInt();

		switch (menu) {
		case "1":
			orderList.add(new Order(food1, amount));
			break;

		case "2":
			orderList.add(new Order(food2, amount));
			break;

		case "3":
			orderList.add(new Order(food3, amount));
			break;

		case "4":
			System.out.println("주문을 종료합니다.");
			return;
		}
		
	}
	
	public void show() {
		Iterator<Order> iter = orderList.iterator();
		
		while(iter.hasNext()) {
			iter.next().orderShow();
			while(!orderList.isEmpty()) {
				orderList.poll();
			}
		}
	}
	
}
