package kosa.api;

import java.util.Scanner;

public class RegularExam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
//		//abc 문자열 포함 여부
//		if(str.matches(".*abc.*")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("비매칭");
//		}
		
//		//숫자만 3자리 유무 판단
//		if(str.matches("[\\d]{3}")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("비매칭");
//		}
		
//		// 알파벳, 숫자만 5자리 이상
//		if(str.matches("[\\w]{5,}")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("비매칭");
//		}

		// 이메일 관련 검증
		//dolsam77@nate.com => 매칭
		//432dolsam77@nate.com => 비매칭
		//dolsam77nate.com => 비매칭
		//dolsam77@nate.comcomcom => 비매칭
		
//		if(str.matches("^[\\D]\\w+@\\w+\\.\\w{2,3}$")) {
//			System.out.println("매칭");
//		} else {
//			System.out.println("비매칭");
//		}
		
		// 다시 봐보기
		
		// 일반 , 이미지 파일 식별
		// abc.jpg, abc.gif, abc.PNG, abc.txt
		// (?i) 대소문자 구분 없이
//		if(str.matches("^\\S+\\.(?i)(jpg|gif|png)$")) {
//			System.out.println("이미지 파일");
//		} else {
//			System.out.println("일반 파일");
//		}
		
		
		String message = "SW 개발자 처우와 근무여건453 선진국 수준으로 개선해야 【서454울=뉴시스】김형섭 기자 = 박근혜 대통령은 23일 342소프트웨어(SW) 중심사회를 실현하기 위해서는 SW의 가치를 제대로 인정하는 데서 출발해야 한다고 말했다.";
		// SW => 소프트웨어
		
//		String result = message.replaceAll("SW", "소프트웨어");
//		System.out.println(result);
		
		// 문자열 안에 숫자를 모두 제거하시오
		
		String result = message.replaceAll("[0-9]", "");
		System.out.println(result);
		
		
	}

}
