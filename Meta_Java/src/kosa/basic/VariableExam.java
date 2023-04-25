package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		// 변수 선언시 주의사항
		// 변수명은 특수문자 X, 숫자로 시작 X, 소문자로 시작, 합성어-> 두 번째 단어 첫 자 대문자
		int num; // (지역)변수 선언(메모리 할당)
		num = 10; // 변수 초기화
		int num2 = 20; // 변수 선언과 동시에 초기화
		
		// 기본 리터럴
		// 정수값 => int, 실수형 => double, 'A' => char, "문자열" => String, true/false => boolen
		double d = 3.14;
		// float f = 3.14; => 오류의 원인은  double이 더 큰 그릇의 타입이기 때문
		float f = 3.14f; // or (float)3.14;
		
		// byte < short < int < long < float < double
		// 형변환(Casting)
		// 묵시적 형변환
		// 큰 데이터형 <--- 작은 데이터형(O)
		// 큰 데이터형 ---> 작은 데이터형(X) => 강제 형변환이 필요
		
		// 강제 형변환 => 데이터 손실 유발
		int b = (int)3.14;
		System.out.println("b: " + b);
		
		double num3 = 3.14 + 1;
		System.out.println(num3);
		
		if(num3 == 4.14) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// int <==> char(아스키코드)
		char num4 = 'A';
		System.out.println((int)num4);
		
		String str = new String("AAA");
		String str2 = "BBB"; // 기본형처럼 사용이 가능
		
		// String <==> int
		String num5 = "1";
		int num6 = Integer.parseInt(num5);
		int result = num6 + 1;
		System.out.println(result);
		
		// int => String
		int num7 = 100;
		String num8 = String.valueOf(num7);
		String num9 = num7 + "";
		System.out.println(num9);
		
		// 퀴즈
		String str4 = 7 + "7" + 7;
		System.out.println(str4);
		
		
		
	}

}
