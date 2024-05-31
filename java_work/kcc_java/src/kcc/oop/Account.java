package kcc.oop;

public class Account {
	
	//객체 생성을 위해 ! 
	
	private String accountNo;
	private String ownerName;
	private int balance;
	
	//생성자 
	public Account() {
		
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNo == null) ? 0 : accountNo.hashCode());
		result = prime * result + balance;
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
		if (balance != other.balance)
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		return true;
	}



	//메서드 
	public void deposit(int amount) {
		balance += amount;
	}
	//출금 
	public int withdraw(int amount) throws Exception{
		if(balance<amount) {
			throw new Exception("잔액부족");
		}
		
		balance -= amount;
		return amount;
	} 
	
	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void setBalnace(int amount) {
	 this.balance = amount;
	}

}
