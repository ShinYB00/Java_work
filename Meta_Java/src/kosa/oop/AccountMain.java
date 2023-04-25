package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
//		Account account = new Account("1111-1111", "홍길동", 1000);
//		Account account2 = new Account("2222-2222", "박길동", 5000);
//		
//		// 생성자의 중요성
//		// StringBuffer sb = new StringBuffer(3.14)  => 오류 발생
//		// 생성자는 객체를 생성하는데 필요한 가이드 라인(더블 타입이 없어 오류가 남)
//		
//		// account.balance = 5000;
//		// account.setBalance = 5000;
//		
//		account2.withdraw(3000);
//		account2.printAccount();
		
//		CheckingAccount ca =
//				new CheckingAccount("111-111", "홍길동", 10000, "111-111");
		
//		ca.pay("111-111", 30000);
		// 예외 처리가 안 되어 있는 상태라 오류남
		
		// finally가 들어가면 이 구문의 예외가 발생하든 안 하든 실행
		// 예외가 발생했을 때와 발생하지 않았을 때 출력되는 번호들을 구분할 줄 알아야 함
//		try {
//			System.out.println("1");
//			ca.pay("111-111", 3000);
//			System.out.println("2");
//		} catch (Exception e) {
//			System.out.println("3");
//			e.printStackTrace();
//		} finally {
//			System.out.println("4");
//		}
//		System.out.println("5");
//		
//		ca.printAccount();
		
		Account account = new MinusAccount("111-111", "홍길동", 5000, 10000);
		try {
			account.withdraw(12000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		account.printAccount();

	}

}
