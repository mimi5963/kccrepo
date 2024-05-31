package kosa.bank;

public class Account {
	
	private String id;
	private long balance;

	public Account(String id, long balance) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.balance = balance;
	}
	
	public void deposit(long amount) {
		balance += amount;
	}
	
	public boolean withdraw(long amount) {
		if(balance - amount <= 0) {
			return false;
		}
		balance -= amount;
		return true;
	}
	
	public String getId() {
		return this.id;
	}
	
	public long getBalance() {
		return this.balance;
	}
	
}
