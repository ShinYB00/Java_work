package kosa.shop;

public class Main {

	public static void main(String[] args) {
		Member m1 = new Member("홍길동", "가산");
		
		Item i1 = new Item("갤럭시 23", 100);
		Order o1 = new Order(1, 10);
		
		m1.register(o1);
		o1.addItem(i1);
		o1.printOrder();

	}

}
