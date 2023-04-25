package kosa.board;

import java.util.Scanner;

public class BoardManager {
	
	private BoardComment addComment;
	
	Board arr[] = new Board[10];
	Scanner sc = new Scanner(System.in);
	int count;
	
	public void addBoard() {
		System.out.print("글 번호 : ");
		String num = sc.nextLine();
		System.out.print("글 제목 : ");
		String title = sc.nextLine();
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		System.out.print("글 내용 : ");
		String content = sc.nextLine();
		
		arr[count++] = new Board(num, title, writer, content);
		
	}
	
	public void comment(Board comment) {
		for(int i = 0; i < count; i++) {
			System.out.print("댓글 쓰고 싶은 글 번호 : ");
			String num = sc.nextLine();
			if(num.equals(arr[i].getNum())) {
				arr[i].boardDetail();
				System.out.print("댓글 : ");
				String s = sc.nextLine();
				
			}
		}
		
	}
	
	public void listBoard() {
		for(int i = 0; i < count; i++) {
			arr[i].boardList();
			System.out.println("");
		}
	}
	
	public void detailBoard() {
		for(int i = 0; i < count; i++) {
			arr[i].boardDetail();
			System.out.println("");
		}
	}
	
	
	
}
