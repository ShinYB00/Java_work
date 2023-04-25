package kosa.oop;

public class CheckingAccount extends Account{
	
	// 자식이 new로 생성하면 부모가 디폴트 생성자가 생성된다
	// 디폴트 말고 값을 전달하기 위해 지정된 것들을 super 함수로 생성할 수 있음
	
	private String cardNo;
	
	public CheckingAccount() {}
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}

	public int pay(String cardNo, int amount) throws Exception{
		// 오류가 나는 이유는 같은 클래스 안이 아니기 때문에 balance가 사용 X
		// if(!cardNo.equals(this.cardNo) || balance <amount)
		if(!cardNo.equals(this.cardNo) || getBalance() < amount) {
			throw new Exception("결제 불능");
		}
		
		return withdraw(amount);
	}
	
	
}
