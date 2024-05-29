package kosa.game;

public class Ball {
	
	private int num;
	private int idx;
	
	public Ball() {}
	
	public Ball(int num) {
		this.num = num;
		this.idx = idx;
	}
	
	public GameStatus compareBall(Ball target) {
		if(num == target.num && idx == target.idx) {
			return GameStatus.STRIKE;
		}else if(num == target.num) {
			return GameStatus.BALL;
		}
		return GameStatus.NOTTHING;
	}
	
	
	public boolean isSameBall(Ball target) {
		return num == target.num;
	}
	
	
	
}
