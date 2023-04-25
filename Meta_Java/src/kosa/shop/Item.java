package kosa.shop;

public class Item {

	// 모델명, 가격
	private String iName;
	private int price;
	
	private Order order;
	
	// 디폴트 생성자
	public Item() {}
	
	// 생성자
	public Item(String iName, int price) {
		super();
		this.iName = iName;
		this.price = price;
	}
	
	public void printItem() {
		System.out.println("주문한 상품 모델명 : " + iName);
		System.out.println("주문한 상품 가격 : " + price + "원");
	}


	public String getiName() {
		return iName;
	}

	public void setiName(String iName) {
		this.iName = iName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
