package kosa.book;

public class BookMain {

	public static void main(String[] args) {
		int totalPrice = 0;
		
		BookInfo arr[] = {
			new BookInfo("JAVA", 30000),
			new BookInfo("JSP", 20000),
			new BookInfo("Oracle", 15000),
		};
		
		for(BookInfo b : arr) {
			b.discount();
			b.printBook();
			totalPrice += b.getDc_price();
		}
		
		System.out.println("총합 : " + totalPrice + "원");
		
	}

}
