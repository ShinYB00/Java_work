package kosa.lamda;

public class LamdaExam {

	public static void main(String[] args) {
		// MyType => 익명 내부 클래로 구현
		
		MyType my1 = new MyType() {
			
			@Override
			public void hello() {
				System.out.println("익명 클래스 형식입니다.");
			}
		};
		
		my1.hello();
		
		
		// 람다식으로 구현
		MyType my2 = () -> {
			System.out.println("람다식 형식입니다.");
		};
		
		my2.hello();
		
		// 중괄호 생략 가능
		MyType my3 = () -> System.out.println("향상된 람다식");
		my3.hello();
		
		YourType you1 = (String message) -> {
			System.out.println("메세지 : " + message);
		};
		you1.talk("안녕");
		
		YourType you2 = message -> System.out.println("메세지 : " + message);
		you2.talk("hello");
		
		//MyNumber getMax를 구현하여 큰 값이 출력되도록
		
//		MyNumber myNum = new MyNumber() {
//			
//			@Override
//			public int getMax(int num1, int num2) {
//				if(num1 < num2) {
//					System.out.println(num2);
//					return num2;
//				}
//				System.out.println(num1);
//				return num1;
//			}
//		}; 
//		
//		myNum.getMax(10, 15);
		
		MyNumber myNum1 = (x, y) -> (x > y) ? x: y;
		System.out.println(myNum1.getMax(100, 40));
		
		//Runnable => 람다식(1~10) 출력
		
		// 익명 내부 클래스
//		Runnable runnable = new Runnable() {
//			
//			@Override
//			public void run() {
//				for(int i = 1; i <= 10; i++) {
//					System.out.print(i + " ");
//				}
//				
//			}
//		};
//		
//		runnable.run();
		
		
		Runnable r = () -> {
			for(int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.print(i + " ");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}

}
