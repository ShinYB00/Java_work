package kosa.bank;

public class MyBank {
	
	//1번
	Customer customer[] = new Customer[10];
	private int customersNum;
	private Customer id;
	
	public MyBank() {}
	
	public void addCustomer(String id, String name, long balance) {
		customer[customersNum++] = new Customer(id, name, balance);
	}

	public Customer getCustomer(String id) {
		Customer cust = null;
		for(int i = 0; i < customersNum; i++) {
			if(id.equals(customer[i].getId())) {
				cust = customer[i];
				break;
			}
		}
		return cust;
		
	}

	public int getCustomerNum() {
		return customersNum;
	}
	
	public Customer[] getAllCustomers() {
		// 실제 배열의 크기만큼 있어야 오류가 발생 X
		Customer newCustomer[] = new Customer[customersNum];
		
		System.arraycopy(customer, 0, newCustomer, 0, customersNum);
		
		return newCustomer;
	}
	
}
