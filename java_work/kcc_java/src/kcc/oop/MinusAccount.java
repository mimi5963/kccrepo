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
			throw new Exception("�ܾ׺���");
		}
		setBalnace(getBalance() - amount);
		return getBalance() - amount;
	}
	
	//�������̵�
	//1. ��Ӱ���, 2.�޼����� �ñ״�ó ��ġ 3. �޼����� ���� ����ġ 
	

}