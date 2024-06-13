package kosa.threads;

public class MultiThreadExam5 {
	public static void main(String[] args) {
		SharedArea sharedArea = new SharedArea();
		sharedArea.account1 = new Account("111-111-1111", 20000000);
		sharedArea.account2 = new Account("222-222-2222",10000000);
		TransferThread thread1 = new TransferThread(sharedArea);
		PrintThread thread2 = new PrintThread(sharedArea);
		thread1.start();
		thread2.start();
	}
}
