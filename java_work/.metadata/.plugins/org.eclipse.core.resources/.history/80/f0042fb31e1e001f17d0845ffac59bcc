package kosa.game;

import java.util.Scanner;

public class BaseBallMain {
    public static void main(String[] args) {
        BaseBallGameManager bm = new BaseBallGameManager();
        bm.setNewGame();
        boolean flag = false;
        int cnt=0;

        while (!flag){
            bm.setUserBalls();
            bm.compareBalls();
           flag=bm.getResult();
           if(!flag){
               bm.clearUserBalls();
           }
           cnt++;
        }
        System.out.println("3Strike");
        System.out.println(cnt+"번째 성공");

    }
}
