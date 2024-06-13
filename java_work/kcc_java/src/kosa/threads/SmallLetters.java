package kosa.threads;

public class SmallLetters implements Runnable {

	@Override
	public void run() {
		for(char ch ='a'; ch<= 'z'; ch++) {
			System.out.print(ch);
		}
	}

}
