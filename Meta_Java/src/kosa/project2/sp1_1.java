package kosa.project2;

import java.util.Scanner;

public class sp1_1 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		String arr[] = s1.split("");
		
		for(String s : arr) {
			// equalsIgnoreCase는 대소문자 구분 없이 문자열 비교
			if(s.equalsIgnoreCase(s2))
				count++;
		}
		
		System.out.println(count);

	}

}
