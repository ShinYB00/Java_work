package kosa.bank;

public class Account {

	private String id;
	private long balance;
	
	public Account() {}
	
	// 파라미터 데이터에 따라 구분(오버로딩)
	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public void deposit(long amount) {
		balance += amount;
	}
	
	public boolean withdraw(long amount) {
		if(balance < amount) {
			return false;
		}
		balance -= amount;

		return true;
	}

	public String getId() {
		return id;
	}

	public long getBalance() {
		return balance;
	}

	
}
