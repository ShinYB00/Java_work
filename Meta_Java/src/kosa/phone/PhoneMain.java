package kosa.phone;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		// 1.전화번호 추가 2.출력 3.검색 4.종료
		
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.전화번호 추가 2.출력 3.검색 4.수정 5.삭제 6.종료");
			System.out.print("메뉴 입력 : ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1" :
				manager.addPhoneInfo();
				break;
			case "2" :
				manager.listPhoneInfo();
				break;
			case "3" :
				manager.searchPhoneInfo();
				break;
			case "4" :
				manager.updatePhoneInfo();
				break;
			case "5" :
				manager.deletePhoneInfo();
				break;
			case "6" :
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}

}
