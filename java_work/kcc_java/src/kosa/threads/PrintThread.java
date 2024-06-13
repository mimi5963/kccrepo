package kosa.threads;

public class PrintThread extends Thread{
	SharedArea sharedArea;
	PrintThread(SharedArea saArea){
		this.sharedArea = saArea;
	}
	
	public void run() {
		for(int i=0; i<3; i++) {
			synchronized (sharedArea) {
				long sum = sharedArea.account1.getBalance()+sharedArea.account2.getBalance();
				System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è : "+sum);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			
		}
	}
}
