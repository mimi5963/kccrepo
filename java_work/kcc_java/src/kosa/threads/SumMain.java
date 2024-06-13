package kosa.threads;

public class SumMain {
	public static void main(String[] args) {
		Thread t1 =new T1();
		Thread t2 = new T2();
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(((T1)t1).getNumber()+((T2)t2).getNumber());
	}
}
