package kcc.gameoop;

public class BaseBall {	
	private int[] hidden;
	
	public BaseBall() {
		hidden = new int[3];
		hidden[0] = (int)(Math.random()*9)+1;
//		do {
//			hidden[1] = (int)(Math.random()*9)+1;
//		}while(hidden)

	}
	
	//볼체크
		public int countStrike(int input[]) {
			int strike=0;
			
			for(int i=0; i<3; i++) {
				if(hidden[i] == input[(i+1)%3])strike++;
				if(hidden[i] == input[(i+2)%3])strike++;
			}
			return strike;
		}
	
	//볼체크
	public int countBall(int input[]) {
		int ball=0;
		
		for(int i=0; i<3; i++) {
			if(hidden[i] == input[(i+1)%3])ball++;
			if(hidden[i] == input[(i+2)%3])ball++;
		}
		return ball;
	}
}
