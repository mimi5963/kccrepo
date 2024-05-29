package kosa.game;

public class Balls {
    private Ball[] ballArray;
    private int curIdx;

    public Balls() {
        ballArray = new Ball[3];
        this.curIdx = 0;
    }


    public void addBall(Ball ball) {
        ballArray[curIdx++] = ball;
    }

    public void compareBalls(Balls targetballs) {
        for (int i = 0; i < curIdx; i++) {
            for (int j = 0; j < curIdx; j++) {
                ballArray[i].compareBall(targetballs.ballArray[j]);
            }
        }
    }


    public void clearBalls() {
        this.ballArray = new Ball[3];
        this.curIdx = 0;
    }

    public boolean isValidBall(Ball ball) {
        for (int i = 0; i < curIdx; i++) {
            if (ballArray[i].isSameBallNumber(ball)) {
                return false;
            }
        }
        return true;
    }

    public boolean countStatus() {
        int strike = 0;
        int ball = 0;

        for (Ball b : ballArray) {
            if (b.getGameStatus() == GameStatus.STRIKE) {
                strike++;
            } else if (b.getGameStatus() == GameStatus.BALL) {
                ball++;
            }
        }

        if (strike == 3) {
            return true;
        }

        printStatus(strike, ball);


        return false;
    }
    private void printStatus(int strike, int ball) {

        if (strike != 0) {
            System.out.print(strike + "S");
        }
        if (ball != 0) {
            System.out.print(ball + "B");
        }
        if (ball == 0 && strike == 0) {
            System.out.print("Nothing");
        }

        System.out.println();

    }

}
