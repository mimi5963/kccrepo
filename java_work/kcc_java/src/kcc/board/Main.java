package kcc.board;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
		BoardManager bm = new BoardManager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			printMenu();
			String input = sc.nextLine();
			
			switch(input) {
			case "1": bm.insertBoard();
					  break;
			case "2": bm.printBoard();
					  break;
					
			case "3": bm.printAllBoard();
					  break;
			case "4": bm.updateBoard();
					  break;
			case "5": bm.deleteBoard();
					  break;
			case "6": return;	
			}
		}
	}
	
	public static void printMenu() {
		System.out.println("1.게시글 등록, 2.게시글 보기,3.모든 게시글 보기,4.게시글 수정,5.게시글 삭제,6.종료");
	}
}
