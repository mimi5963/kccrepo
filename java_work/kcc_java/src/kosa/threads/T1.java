package kosa.threads;

public class T1 extends Thread{
	private int number;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<= 50;i++) {
			number += i;
		}
		
	}
	
	public int getNumber() {
		return this.number;
	}

}
