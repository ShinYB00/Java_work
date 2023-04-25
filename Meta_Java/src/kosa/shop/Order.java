package kosa.shop;

import java.util.ArrayList;
import java.util.List;

public class Order {
	// 주문번호, 수량, 주문 금액
	private int orderNum;
	private int count;
	private int totalPrice;
	
	// 회원 내역, 제품 내역
	private Member mName;
	private Item iName;
	
	// 주문한 사람들
	private List<Member> memberList;
	private List<Item> itemList;
	
	// 디폴트 생성자
	public Order() {}
	
	// 생성자
	public Order(int orderNum, int count) {
		super();
		this.orderNum = orderNum;
		this.count = count;
		memberList = new ArrayList<Member>();
		itemList = new ArrayList<Item>();
	}
	
	public void addMember(Member member) {
		memberList.add(member);
		
	}
	
	public void addItem(Item item) {
		itemList.add(item);
		for(int i = 0; i < count; i++) {
			totalPrice += item.getPrice();
		}
	}
	
	public void printOrder() {
		System.out.println("주문번호 : " + orderNum);
		for(Member member : memberList) {
			member.printMember();
		}
		for(Item item : itemList) {
			item.printItem();
		}
		System.out.println("주문 수량 : " + count + "개");
		System.out.println("주문 금액 : " + totalPrice + "원");
		System.out.println();
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
	
	

}
