package kosa.threads;

public class T2 extends Thread{
	private int number;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=51; i<= 100;i++) {
			number += i;
		}
		
	}
	
	public int getNumber() {
		return this.number;
	}
	

}
