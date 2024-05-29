package kosa.game;

public class Ball {
	
	private int num;
	private int idx;
	private GameStatus gameStatus;
	public Ball() {}
	
	public Ball(int idx,int num) {
		this.num = num;
		this.idx = idx;
		gameStatus = GameStatus.NOTHING;
	}
	
	public void compareBall(Ball target) {
		if(gameStatus == GameStatus.NOTHING) {
			if (isSameBallNumber(target) && isSameBallIdx(target)) {
				gameStatus = GameStatus.STRIKE;
			} else if (isSameBallNumber(target) ) {
				gameStatus = GameStatus.BALL;
			}
		}
	}
	
	
	public boolean isSameBallNumber(Ball target) {
		return num == target.num;
	}
	public boolean isSameBallIdx(Ball target) {return idx == target.idx;}

	public GameStatus getGameStatus(){
		return this.gameStatus;
	}
	
	
}
