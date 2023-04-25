package kosa.oop;

public class MinusAccount extends Account{

	// 마이너스 통장은 대출 한도가 있음
	
	private int creditLine; // 마이너스 한도

	public MinusAccount() {}
	
	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	
	// setBalance 중요!!!!!!

	@Override
	public int withdraw(int amount) throws Exception{
		if(getBalance() + creditLine < amount) {
			throw new Exception("잔액 부족");
		}
		
		int balanace = getBalance();
		setBalance(balanace-amount);
		return amount;
		
	}
	
	public int getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}
}
