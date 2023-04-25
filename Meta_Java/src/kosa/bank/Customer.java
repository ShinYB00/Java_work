package kosa.bank;

public class Customer {
	
	private String id;
	private String name;
	private Account account;
	
	public Customer() {}
	
	public Customer(String id, String name, long balance) {
		super();
		this.id = id;
		this.name = name;
		// 방금 등록한 회원의 계좌를 생성
		// new는 생성자로 넘어감
		this.account = new Account(id, balance);
	}
	
	// Account와 연결
	public void account(Account ac) {
		account = ac;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
