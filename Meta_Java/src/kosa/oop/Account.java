package kosa.oop;

// 객체를 생성하기 위한 클래스이므로 메인 메소드는 필요 X
// 객체를 추상화 하는 작업
// 현재는 객체가 없어 메모리가 할당된 것이 아니기 때문에 개별 사용 불가능
public class Account {
	// 계좌 객체
	// 상태(필드) : 계좌번호, 계좌주, 잔액 => 멤버 변수
	// 기능(메서드) : 입금하다, 출금하다
	// 변수들을 private로 접근 제어
	
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account() {} // 디폴트 생성자
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}
	
	public int withdraw(int amount) throws Exception{
		if(balance < amount) {
			throw new Exception("잔액 부족");
		}
		
		balance -= amount;
		
		return amount;
	}
	
	public void printAccount() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("계좌주 : " + ownerName);
		System.out.println("잔액 : " + balance);
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
