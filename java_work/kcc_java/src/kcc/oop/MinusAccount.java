package kcc.oop;

public class MinusAccount extends Account{
	private int creditLine;
	
	public MinusAccount() {
		
	}
	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	@Override
	public int withdraw(int amount) throws Exception {
		if(getBalance() + creditLine < amount) {
			throw new Exception("잔액부족");
		}
		setBalnace(getBalance() - amount);
		return getBalance() - amount;
	}
	
	//오버라이딩
	//1. 상속관계, 2.메서드의 시그니처 일치 3. 메서드의 내용 불일치 
	

}
