package kosa.book;

public class BookInfo {
	// 상태 : 책 이름, 원가, 할인가
	// 기능 : 할인 계산(할인된 가격 산출), 책 정보 출력
	
	private String bookName;
	private int price;
	private int dc_price; // 계산이 필요하기 때문에 초기화가 불가능
	
	public BookInfo() {} // 디폴트 생성자
	
	public BookInfo(String bookName, int price) {
		super();
		this.bookName = bookName;
		this.price = price;
		
	}
	
	// 리턴이 필요 없음
	public void discount() {
		if(price >= 30000) {
			dc_price = (int)(price * 0.75);
		} else if(price >= 20000) {
			dc_price = (int)(price * 0.80);
		} else if(price >= 15000) {
			dc_price = (int)(price * 0.85);
		}
	}
	
	public void printBook() {
		System.out.println(bookName + "교재는 정가는" + price +"원 할인된 가격은 " + dc_price +"원 입니다.");
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDc_price() {
		return dc_price;
	}

	public void setDc_price(int dc_price) {
		this.dc_price = dc_price;
	}
	
	
}
