package kosa.basic;

import java.util.Scanner;

public class LoopExam {

	public static void main(String[] args) {
		// 퀴즈 -> 1~100까지의 정수 중 2의 배수와 3의 배수가 아닌 숫자만 출력하시오.
		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0 || i % 3 == 0) {
//				System.out.print("");
//			} else {
//				System.out.print(i + " ");
//			}
			
		// 교수님 답안
		// if(!(i % 2 == 0 || i % 3 == 0)) {
		//	System.out.print(i + " "); }
			
//			
//		}

		
		// 퀴즈 -> 2개의 정수를 입력 받아 b - a 결과가 항상 양의 정수가 나오도록 구현해 보자.
		
		System.out.println("2개의 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
//		
//		do {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//		} while(a > b);
//		System.out.println("b -a = " + (b - a));
		
		// 교수님 답안
		int a = 0;
		int b = 0;
//		
//		while(true) {
//			System.out.print("a : ");
//			a = sc.nextInt();
//			System.out.print("b : ");
//			b = sc.nextInt();
//			
//			if(a < b) break;
//		}
//				
//		System.out.println("b -a = " + (b - a));	
		
		
		// 교수님 답안 2
		do {
			System.out.print("a : ");
			a = sc.nextInt();
			System.out.print("b : ");
			b = sc.nextInt();
		} while(a > b);
		
		System.out.println("b -a = " + (b - a));
		
		
	}

}
