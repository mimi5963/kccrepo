package kosa.game;

public class Balls {
	private Ball[] balls;
	private int curIdx;
	public Balls() {
		balls = new Ball[3];
		this.curIdx = 0;
	}
	
	
	public boolean isValidBall(Ball ball) {
		for(int i=0; i<curIdx;i++) {
			if(balls[i].isSameBall(ball)) {
				return false;
			}
		}
		return true;
	}
	
	public 
}
