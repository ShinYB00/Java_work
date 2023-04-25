package kosa.mission;

import java.util.Scanner;

public class Mission01 {

	public static void main(String[] args) {
		// 임의의 정수값에 대해서 전체 자리수 중 짝수, 홀수의 개수를 구하자.
		// 5자리수 ex) 12345
		// 짝수의 개수 : 2개
		// 홀수의 개수 : 3개
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		// int n = sc.nextInt();
//		String s = sc.nextLine();
//		
//		int num = 0;
//		int odd = 0;
//		int even = 0;
//		
//		for(int i=0; i <s.length(); i++) {
//			num = Integer.parseInt(s.substring(i, i+1));
//			
//			if(num % 2 == 0) {
//				 even++;
//			} else {
//				odd++;
//			}
//		}
//		
//		System.out.println("짝수의 개수 : " + even);
//		System.out.println("홀수의 개수 : " + odd);
//		
		
		
		// 교수님 답안
		
		Scanner sc = new Scanner(System.in);
		System.out.print("5자리 정수 입력: ");
		
		int num = sc.nextInt(); //12345
		int even = 0;
		int odd = 0;
		
		even += (num / 10000 % 2 == 0) ? 1 : 0;
		even += (num / 1000 % 10 % 2 == 0) ? 1 : 0;
		even += (num / 100 % 10 % 2 == 0) ? 1 : 0;
		even += (num / 10 % 10 % 2 == 0) ? 1 : 0;
		even += (num % 2 == 0) ? 1 : 0;
		
		odd = 5 - even;
		
		System.out.println("짝수의 개수 : " + even);
		System.out.println("홀수의 개수 : " + odd);
		
	}

}
