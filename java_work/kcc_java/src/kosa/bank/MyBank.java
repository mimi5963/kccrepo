package kosa.bank;

public class MyBank {
	private Customer[] customers;
	private int customersNum;
	
	public MyBank() {
		customers = new Customer[10];
		//아직 뭘 의미하는 지 모름 배열 cnt 같다.
		customersNum =0;
	}
	
	
	public void addCustomer(String id, String name, long balance) {
		// 회원을 만들어서 배열에 추가
		customers[customersNum++] = new Customer(id,name,balance);
	}


	public Customer getCustomer(String id) {
		for(int i=0; i<this.customersNum;i++) {
			if(customers[i].getId().equals(id)) {
				return customers[i];
			}
		}
		return null;
	}
	
	public int getCustomersNum() {
		return 1;
	}
	public Customer[] getAllCustomers() {
		Customer[] temp = new Customer[customersNum];
		for(int i=0; i<customersNum;i++) {
			temp[i] = customers[i];
		}
		return temp;
	}
}
