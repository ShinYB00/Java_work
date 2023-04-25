package kosa.exam;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Manager m = new Manager();
	
		
		while(true) {
			System.out.println("1.주문요청  2.주문처리  3.매출액 총액  4.종료");
			System.out.print("선택 : ");
			String s = sc.nextLine();
			
			switch(s) {
			case "1" :
				m.addOrder();
				break;
			case "2" :
				m.show();
				break;
			case "3" :
				
				break;
			case "4" :
				System.out.println("주문을 종료합니다.");
				return;
			}
		}

		
	}

}
