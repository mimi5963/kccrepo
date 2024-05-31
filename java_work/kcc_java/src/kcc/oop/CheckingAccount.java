package kcc.oop;

public class CheckingAccount extends Account {
	private String cardNo;
	
	
	


	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}





	public int pay(String cardNo, int amount) throws Exception{
		if(!this.cardNo.equals(cardNo) || getBalance() < amount) {
			throw new Exception("결제 불능");
		}
		return 0;
	}

	
}
