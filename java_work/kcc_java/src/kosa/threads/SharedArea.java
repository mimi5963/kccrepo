package kosa.threads;

public class SharedArea {
	Account account1;
	Account account2;
	
	synchronized void transfer(int account) {
		account1.withdraw(1000000);
		System.out.println("�̸��� ���� 100���� ����");
		account2.deposit(1000000);
		System.out.println("������ ���� 100���� �Ա� ");
	}
	
	synchronized long getTotal() {
		return account1.getBalance() + account2.getBalance();
	}
}