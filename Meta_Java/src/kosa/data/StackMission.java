package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		// 키보드로부터 수학 수식을 입력
		// ((2+3)+10) => 괄호 일치 / 불일치 판단
		
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stack = new Stack<String>();
		
		System.out.print("수식 입력 : ");
		String str = sc.nextLine();
		
		try {
			
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if(ch == '(') {
					//""으로 String으로 바꿔줌
					stack.push(ch + "");
				} else if(ch == ')') {
					stack.pop();
				}
			}

			if(stack.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 불일치 합니다.");
			}
			
		} catch (Exception e) {
			// 예외처리를 하지 않으면 스택이 더이상 없어 오류가 발생한다
			System.out.println("괄호가 불일치 합니다.");
		}
			
		
		

	}

}
