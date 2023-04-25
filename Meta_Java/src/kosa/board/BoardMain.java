package kosa.board;

import java.util.Scanner;

import kosa.phone.Manager;
import kosa.phone.PhoneInfo;

public class BoardMain {

	public static void main(String[] args) {
		
		BoardManager m = new BoardManager();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("1.글쓰기 2.댓글쓰기 3.글 목록 보기 4.글 세부 보기 5.종료");
			System.out.print("원하는 서비스 번호 입력 : ");
			String menu = sc.nextLine();

			switch(menu) {
			case "1" :
				m.addBoard();
				break;
			case "2" :
//				m.comment();
				break;
			case "3" :
				m.listBoard();
				break;
			case "4" :
				m.detailBoard();
				break;
			case "5" :
				System.out.println("게시판을 종료합니다.");
				return;
			}
		}

	}

}
