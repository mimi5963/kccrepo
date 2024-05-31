package kosa.game;


import java.util.Scanner;

public class BaseBallGameManager {
	private Balls computerBalls;
	private Balls userBalls;

	private Scanner sc;
	private String gameResult;
	public  BaseBallGameManager() {
		computerBalls = new Balls();
		userBalls = new Balls();
		sc = new Scanner(System.in);
	}

	public void setNewGame(){
		int cnt =0;
		while (cnt < 3){
			Ball ball = new Ball(cnt+1,(int)(Math.random()*9)+1);
			if(computerBalls.isValidBall(ball)){
				computerBalls.addBall(ball);
				cnt++;
			}
		}
	}

	public void compareBalls(){
		userBalls.compareBalls(computerBalls);
	}

	public boolean getResult(){
		return userBalls.countStatus();
	}

	public void clearUserBalls(){
		userBalls.clearBalls();
	}
	public boolean addUserBall(Ball ball) {
		if(userBalls.isValidBall(ball)){
			userBalls.addBall(ball);
			return true;
		}
		return false;
	}

	public void setUserBalls(){


		while (true) {
			System.out.println("볼을 입력해 주세요");
			String sinput = sc.nextLine();
			boolean flag = true;

			for(int i=0; i<sinput.length();i++){
				flag = addUserBall(new Ball(i+1, sinput.charAt(i)-'0'));
				if(!flag) break;
			}

			if (!flag){
				System.out.println("중복된 숫자는 입력하실 수 없습니다. 다시 입력해주세요");
				userBalls.clearBalls();
			}else{
				break;
			}
		}
	}



}
