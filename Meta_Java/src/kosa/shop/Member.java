package kosa.shop;

import java.util.ArrayList;
import java.util.List;

public class Member {
	// 이름, 주소
	private String mName;
	private String mAddress;
	// 주문 리스트
	private List<Order> orderList;
//	// 상품 리스트
//	private List<Item> itemList;
	
	// 디폴트 생성자
	public Member() {}
	
	// 생성자
	public Member(String mName, String mAddress) {
		super();
		this.mName = mName;
		this.mAddress = mAddress;
		// 주문서가 생긴다는 건 주문한 회원이 생겼다는 뜻
		// 회원이 생기면서 주문서도 생성
		orderList = new ArrayList<Order>();
	}
	
	public void register(Order order) {
		orderList.add(order);
		order.addMember(this);
	}
	
	public void printMember() {
		System.out.println("회원 이름 : " + mName);
		System.out.println("회원 주소 : " + mAddress);
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	
}
